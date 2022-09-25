package com.example.quizapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.quizapp.R
import com.example.quizapp.activities.quizquestions.Constants

class MainActivity : AppCompatActivity() {

    // create reference to the button and edit text view
    // that we need to change
    private lateinit var btnStart: Button
    private lateinit var etName: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart  = findViewById(com.example.quizapp.R.id.btn_start)
        etName = findViewById(com.example.quizapp.R.id.et_name)

        // call set onClickListener to start the action for the button
        btnStart.setOnClickListener{
            // if edit text is empty, make a toast, and create the intent
            if(etName.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter Your Name...", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, etName.text.toString())
                startActivity(intent)
                finish()
                // start the activity and finish the sequence
            }
        }

    }
}