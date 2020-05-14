package com.example.mainacivity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        login_button_login.setOnClickListener {
            val email = email_textView_login.text.toString()
            val password = password_textview_login.text.toString()

            Log.d("Login","Attempt to login w email/pw $email/***")
        }

        backtoregister_textview_login.setOnClickListener {
            finish()
        }

    }
}

