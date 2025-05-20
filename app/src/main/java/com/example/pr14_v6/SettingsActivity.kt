package com.example.pr14_v6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings)
    }
    fun ToCalendar(view: View){
        var intent = Intent(this, CalendarActivity::class.java)
        startActivity(intent)
        finish()
    }
}