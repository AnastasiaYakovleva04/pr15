package com.example.pr14_v6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class UserLoginActivity : AppCompatActivity() {
    lateinit var login: EditText
    lateinit var email: EditText
    lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_login)
        login = findViewById((R.id.login))
        email = findViewById((R.id.email))
        password = findViewById((R.id.password))
    }
    fun Reg(view: View){
        if (email.text.toString().isNotEmpty() && login.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()){
            if (password.text.toString().length < 8)
            {
                val alert = AlertDialog.Builder(this)
                    .setTitle("Ошибка")
                    .setMessage("Пароль должен содержать минимум 8 символов")
                    .setPositiveButton("Ок", null)
                    .create()
                    .show()
            }
            else {
                var intent = Intent(this, CalendarActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
        else{
            val alert = AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("Все поля должны быть заполнены")
                .setPositiveButton("Ок", null)
                .create()
                .show()
        }
    }
}