package br.osvaldoneves.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.osvaldoneves.quizapp.R
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val username = intent.getStringExtra(Constants.USER_NAME)
        tv_name.text = username
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswer = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        tv_score.text = "Sua Pontuação foi $correctAnswer de $totalQuestions "

        btn_finish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}