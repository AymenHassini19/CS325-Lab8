package com.example.quizzapp

object Constants {

    const val CORRECT_ANS = "correct_answers"
    const val TOTAL_QUESTIONS = "total_questions"

    var myQuestionsList: ArrayList<Question> = arrayListOf(
        Question(
            1,
            R.drawable.ic_flag_of_algeria,
            "Morocco", "Libya", "Nigeria", "Algeria", 4
        ),
        Question(
            2,
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Chile", "Uruguay", "Paraguay", 1
        ),
        Question(
            3,
            R.drawable.ic_flag_of_australia,
            "New Zealand", "Fiji", "Indonesia", "Australia", 4
        ),
        Question(
            4,
            R.drawable.ic_flag_of_belgium,
            "Netherlands", "France", "Belgium", "Luxembourg", 3
        ),
        Question(
            5,
            R.drawable.ic_flag_of_brazil,
            "Colombia", "Brazil", "Argentina", "Venezuela", 2
        ),
        Question(
            6,
            R.drawable.ic_flag_of_denmark,
            "Norway", "Finland", "Denmark", "Sweden", 3
        ),
        Question(
            7,
            R.drawable.ic_flag_of_fiji,
            "Fiji", "Samoa", "Tonga", "Vanuatu", 1
        ),
        Question(
            8,
            R.drawable.ic_flag_of_germany,
            "Austria", "Switzerland", "Poland", "Germany", 4
        ),
        Question(
            9,
            R.drawable.ic_flag_of_india,
            "Pakistan", "Bangladesh", "Nepal", "India", 4
        ),
        Question(
            10,
            R.drawable.ic_flag_of_kuwait,
            "Qatar", "Kuwait", "Bahrain", "UAE", 2
        ),
        Question(
            11,
            R.drawable.ic_flag_of_new_zealand,
            "Australia", "Fiji", "New Zealand", "Papua New Guinea", 3
        )
    )
}

