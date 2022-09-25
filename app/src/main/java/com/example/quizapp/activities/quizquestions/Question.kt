package com.example.quizapp.activities.quizquestions

// Will only hold data information for each
// of the questions and the answers.

data class Question(
    val id: Int,
    val question: String,
    val image: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int,
)