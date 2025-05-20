package com.example.pr14_v6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class EditTaskActivity : AppCompatActivity() {
    lateinit var title: EditText
    lateinit var time: EditText
    lateinit var date: EditText
    lateinit var distribution: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edit_task)
    }
    fun Back(view: View){
        var intent = Intent(this, CalendarActivity::class.java)
        startActivity(intent)
        finish()
    }
}