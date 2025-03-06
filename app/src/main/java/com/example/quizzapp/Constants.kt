package com.example.quizzapp

object Constants {

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        val que0 = Question(
            id = 1,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_tunisia,
            optionOne = "Turkey",
            optionTwo = "Tunis",
            optionThree = "Egypt",
            optionFour = "Germany",
            correctAnswer = 2
        )
        questionsList.add(que0)

        // TODO: ADD ALL QUESTIONS THAT WILL BE DISPLAYED

        return questionsList
    }
}