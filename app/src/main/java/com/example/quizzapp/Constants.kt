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

        questionsList.add(
            Question(
                id = 2,
                question = "What country does this flag belong to?",
                image = R.drawable.ic_flag_of_algeria,
                optionOne = "Morocco",
                optionTwo = "Libya",
                optionThree = "Nigeria",
                optionFour = "Algeria",
                correctAnswer = 4
            )
        )

        questionsList.add(
            Question(
                id = 3,
                question = "What country does this flag belong to?",
                image = R.drawable.ic_flag_of_argentina,
                optionOne = "Argentina",
                optionTwo = "Chile",
                optionThree = "Uruguay",
                optionFour = "Paraguay",
                correctAnswer = 1
            )
        )

        questionsList.add(
            Question(
                id = 4,
                question = "What country does this flag belong to?",
                image = R.drawable.ic_flag_of_australia,
                optionOne = "New Zealand",
                optionTwo = "Fiji",
                optionThree = "Indonesia",
                optionFour = "Australia",
                correctAnswer = 4
            )
        )

        questionsList.add(
            Question(
                id = 5,
                question = "What country does this flag belong to?",
                image = R.drawable.ic_flag_of_belgium,
                optionOne = "Netherlands",
                optionTwo = "France",
                optionThree = "Belgium",
                optionFour = "Luxembourg",
                correctAnswer = 3
            )
        )

        questionsList.add(
            Question(
                id = 6,
                question = "What country does this flag belong to?",
                image = R.drawable.ic_flag_of_brazil,
                optionOne = "Colombia",
                optionTwo = "Brazil",
                optionThree = "Argentina",
                optionFour = "Venezuela",
                correctAnswer = 2
            )
        )

        questionsList.add(
            Question(
                id = 7,
                question = "What country does this flag belong to?",
                image = R.drawable.ic_flag_of_denmark,
                optionOne = "Norway",
                optionTwo = "Finland",
                optionThree = "Denmark",
                optionFour = "Sweden",
                correctAnswer = 3
            )
        )

        questionsList.add(
            Question(
                id = 8,
                question = "What country does this flag belong to?",
                image = R.drawable.ic_flag_of_fiji,
                optionOne = "Fiji",
                optionTwo = "Samoa",
                optionThree = "Tonga",
                optionFour = "Vanuatu",
                correctAnswer = 1
            )
        )

        questionsList.add(
            Question(
                id = 9,
                question = "What country does this flag belong to?",
                image = R.drawable.ic_flag_of_germany,
                optionOne = "Austria",
                optionTwo = "Switzerland",
                optionThree = "Poland",
                optionFour = "Germany",
                correctAnswer = 4
            )
        )

        questionsList.add(
            Question(
                id = 10,
                question = "What country does this flag belong to?",
                image = R.drawable.ic_flag_of_india,
                optionOne = "Pakistan",
                optionTwo = "Bangladesh",
                optionThree = "Nepal",
                optionFour = "India",
                correctAnswer = 4
            )
        )

        questionsList.add(
            Question(
                id = 11,
                question = "What country does this flag belong to?",
                image = R.drawable.ic_flag_of_kuwait,
                optionOne = "Qatar",
                optionTwo = "Kuwait",
                optionThree = "Bahrain",
                optionFour = "UAE",
                correctAnswer = 2
            )
        )

        questionsList.add(
            Question(
                id = 12,
                question = "What country does this flag belong to?",
                image = R.drawable.ic_flag_of_new_zealand,
                optionOne = "Australia",
                optionTwo = "Fiji",
                optionThree = "New Zealand",
                optionFour = "Papua New Guinea",
                correctAnswer = 3
            )
        )

        return questionsList
    }
}