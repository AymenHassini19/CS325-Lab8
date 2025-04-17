package com.example.quizzapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private var tvQuestion: TextView? = null
    private var iv1: ImageView? = null
    private var pbQuizProgress: ProgressBar? = null
    private var tvQuizProgress: TextView? = null
    private var tvOptionOne: TextView? = null
    private var tvOptionTwo: TextView? = null
    private var tvOptionThree: TextView? = null
    private var tvOptionFour: TextView? = null
    private var btnSubmit: Button? = null

    private var mQuestionsList: ArrayList<Question>? = null
    private var mCurrentPosition: Int = 1
    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswers: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quiz_questions)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.cl_quiz_layout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        mQuestionsList = Constants.myQuestionsList

        tvQuestion = findViewById(R.id.tv_question)
        iv1 = findViewById(R.id.iv1)
        pbQuizProgress = findViewById(R.id.pb_quiz_progress)
        tvQuizProgress = findViewById(R.id.tv_quiz_progress)
        tvOptionOne = findViewById(R.id.tv_option_one)
        tvOptionTwo = findViewById(R.id.tv_option_two)
        tvOptionThree = findViewById(R.id.tv_option_three)
        tvOptionFour = findViewById(R.id.tv_option_four)
        btnSubmit = findViewById(R.id.btn_submit)

        tvOptionOne?.setOnClickListener { selectedOptionView(it as TextView, 1) }
        tvOptionTwo?.setOnClickListener { selectedOptionView(it as TextView, 2) }
        tvOptionThree?.setOnClickListener { selectedOptionView(it as TextView, 3) }
        tvOptionFour?.setOnClickListener { selectedOptionView(it as TextView, 4) }
        btnSubmit?.setOnClickListener {
            if (mSelectedOptionPosition == 0) {
                mCurrentPosition++
                if (mCurrentPosition <= mQuestionsList!!.size) {
                    setQuestion()
                } else {
                    val intent = Intent(this, ResultActivity::class.java).apply {
                        putExtra(Constants.CORRECT_ANS, mCorrectAnswers)
                        putExtra(Constants.TOTAL_QUESTIONS, mQuestionsList?.size)
                    }
                    startActivity(intent)
                    finish()
                }
            } else {
                val question = mQuestionsList!![mCurrentPosition - 1]
                if (question.correctAnswer != mSelectedOptionPosition) {
                    answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                } else {
                    mCorrectAnswers++
                }
                answerView(question.correctAnswer, R.drawable.correct_option_border_bg)

                if (mCurrentPosition == mQuestionsList!!.size) {
                    btnSubmit?.text = getString(R.string.finish)
                } else {
                    btnSubmit?.text = "Next Question"
                }

                mSelectedOptionPosition = 0

            }
        }


        setQuestion()

    }

    private fun setQuestion() {

        defaultOptionsTextView()

        val question: Question = mQuestionsList!![mCurrentPosition - 1]

        iv1?.setImageResource(question.image)

        pbQuizProgress?.progress = mCurrentPosition

        tvQuizProgress?.text = "$mCurrentPosition/${pbQuizProgress?.max}"

        tvOptionOne?.text = question.optionOne
        tvOptionTwo?.text = question.optionTwo
        tvOptionThree?.text = question.optionThree
        tvOptionFour?.text = question.optionFour

        if (mCurrentPosition == mQuestionsList!!.size) {
            btnSubmit?.text = getString(R.string.finish)
        } else {
            btnSubmit?.text = getString(R.string.submit)
        }

    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {

        defaultOptionsTextView()
        mSelectedOptionPosition = selectedOptionNum
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.setBackgroundResource(R.drawable.selected_option_border_bg)
    }

    private fun defaultOptionsTextView() {
        val options = ArrayList<TextView>()
        tvOptionOne?.let { options.add(it) }
        tvOptionTwo?.let { options.add(it) }
        tvOptionThree?.let { options.add(it) }
        tvOptionFour?.let { options.add(it) }
        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.setBackgroundResource(R.drawable.default_option_border_bg)
        }

    }

    private fun answerView(selectedOptionNum: Int, drawableRes: Int) {
        when (selectedOptionNum) {
            1 -> tvOptionOne?.setBackgroundResource(drawableRes)
            2 -> tvOptionTwo?.setBackgroundResource(drawableRes)
            3 -> tvOptionThree?.setBackgroundResource(drawableRes)
            4 -> tvOptionFour?.setBackgroundResource(drawableRes)
        }
    }


}