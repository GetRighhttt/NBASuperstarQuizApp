package com.example.quizapp.activities.quizquestions

import com.example.quizapp.R

// One constant class of type object that will contain all of the questions
object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    private const val recurringQuestion: String = "What country does this flag belong to?"
    // method to return all the questions in an ArrayList of Questions
    // passes in the Question class in the data file Questions.kt
    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>() // Initializes questionsList to the Array

        /**
         * This is where we begin the data initialization..
         * Initializes questions to all the questions with all possible
         * outcomes for the answer from
         * our data class in Question.kt, and return the list.
         * */

        val que1 = Question(1, recurringQuestion, R.drawable.ic_flag_of_argentina,
            "Argentina",
            optionTwo = "Armenia",
            optionThree = "Australia",
            optionFour = "Armenia",
            1)
        questionsList.add(que1)


        val que2= Question(2, recurringQuestion, R.drawable.ic_flag_of_australia,
            "Argentina",
            optionTwo = "Armenia",
            optionThree = "Australia",
            optionFour = "Georgia",
            3)
        questionsList.add(que2)

        val que3 = Question(3, recurringQuestion, R.drawable.ic_flag_of_belgium,
            "Canada",
            optionTwo = "Egypt",
            optionThree = "USA",
            optionFour = "Belgium",
            4)
        questionsList.add(que3)

        val que4 = Question(4, recurringQuestion, R.drawable.ic_flag_of_brazil,
            "Brazil",
            optionTwo = "Spain",
            optionThree = "New Zealand",
            optionFour = "Mexico",
            1)
        questionsList.add(que4)

        val que5 = Question(5, recurringQuestion, R.drawable.ic_flag_of_denmark,
            "Canada",
            optionTwo = "Denmark",
            optionThree = "Austria",
            optionFour = "Germany",
            2)
        questionsList.add(que5)

        val que6 = Question(6, recurringQuestion, R.drawable.ic_flag_of_fiji,
            "Fiji",
            optionTwo = "Armenia",
            optionThree = "Australia",
            optionFour = "Belgium",
            1)
        questionsList.add(que6)

        val que7 = Question(7, recurringQuestion, R.drawable.ic_flag_of_germany,
            "Kuwait",
            optionTwo = "Germany",
            optionThree = "New Zealand",
            optionFour = "Belgium",
            2)
        questionsList.add(que7)

        val que8 = Question(8, recurringQuestion, R.drawable.ic_flag_of_india,
            "USA",
            optionTwo = "Spain",
            optionThree = "India",
            optionFour = "Kuwait",
            3)
        questionsList.add(que8)

        val que9 = Question(9, recurringQuestion, R.drawable.ic_flag_of_kuwait,
            "Argentina",
            optionTwo = "Kuwait",
            optionThree = "India",
            optionFour = "USA",
            2)
        questionsList.add(que9)

        val que10 = Question(10, recurringQuestion, R.drawable.ic_flag_of_new_zealand,
            "Argentina",
            optionTwo = "Germany",
            optionThree = "France",
            optionFour = "New Zealand",
            4)
        questionsList.add(que10)
        return questionsList
    }
}