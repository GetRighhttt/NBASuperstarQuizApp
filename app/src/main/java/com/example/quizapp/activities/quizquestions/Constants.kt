package com.example.quizapp.activities.quizquestions

import com.example.quizapp.R

// One constant class of type object that will contain all of the questions
object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    private const val recurringQuestion: String = "Who is the Star player of this team?"
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

        val que1 = Question(1, recurringQuestion, R.drawable.lakers,
            "Lebron James",
            optionTwo = "Anthony Davis",
            optionThree = "Russell Westbrook",
            optionFour = "Darvin Ham",
            1)
        questionsList.add(que1)


        val que2= Question(2, recurringQuestion, R.drawable.bulls,
            "Alex Caruso",
            optionTwo = "Zach Lavine",
            optionThree = "Demar Derozan",
            optionFour = "Lonzo Ball",
            3)
        questionsList.add(que2)

        val que3 = Question(3, recurringQuestion, R.drawable.timberwolves,
            "Karl Anthony-Towns",
            optionTwo = "Rudy Gobert",
            optionThree = "Patrick Beverly",
            optionFour = "Anthony Edwards",
            4)
        questionsList.add(que3)

        val que4 = Question(4, recurringQuestion, R.drawable.bucks,
            "Giannis Antetokounmpo",
            optionTwo = "Krhis Middleton",
            optionThree = "Malcolm Brogdon",
            optionFour = "Jru Holiday",
            1)
        questionsList.add(que4)

        val que5 = Question(5, recurringQuestion, R.drawable.clippers,
            "Paul George",
            optionTwo = "Kawhi Leonard",
            optionThree = "Luke Kennard",
            optionFour = "Reggie Jackson",
            2)
        questionsList.add(que5)

        val que6 = Question(6, recurringQuestion, R.drawable.trailblazers,
            "Damian (Dame Time) Lillard",
            optionTwo = "Anthony Simons",
            optionThree = "CJ McCollum",
            optionFour = "Chauncey Billups",
            1)
        questionsList.add(que6)

        val que7 = Question(7, recurringQuestion, R.drawable.nets,
            "Kyrie Irving",
            optionTwo = "Kevin Durant",
            optionThree = "Ben Simmons",
            optionFour = "Seth Curry",
            2)
        questionsList.add(que7)

        val que8 = Question(8, recurringQuestion, R.drawable.hornets,
            "Gordon Hayward",
            optionTwo = "Terry Rozier",
            optionThree = "Lamelo Ball",
            optionFour = "Kelly Oubre Jr.",
            3)
        questionsList.add(que8)

        val que9 = Question(9, recurringQuestion, R.drawable.sixers,
            "Tobias Harris",
            optionTwo = "James Harden",
            optionThree = "Tyrese Maxey",
            optionFour = "Joel Embiid",
            2)
        questionsList.add(que9)

        val que10 = Question(10, recurringQuestion, R.drawable.heat,
            "Bam Adebayo",
            optionTwo = "Duncan Robinson",
            optionThree = "Kyle Lowry",
            optionFour = "Jimmy Butler",
            4)
        questionsList.add(que10)
        return questionsList
    }
}