package com.example.pr14_v6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class CalendarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.calendar)
    }
    fun Settings(view: View){
        var intent = Intent(this, SettingsActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun ToTaskList(view: View){
        var intent = Intent(this, EditTaskActivity::class.java)
        startActivity(intent)
        finish()
    }
}