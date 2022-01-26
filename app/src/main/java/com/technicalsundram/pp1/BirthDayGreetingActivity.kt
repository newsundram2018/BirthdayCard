package com.technicalsundram.pp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birth_day_greeting.*
class BirthDayGreetingActivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birth_day_greeting)
        val name = intent.getStringExtra(NAME_EXTRA)
        BirthDayGreeting.text = "Happy Birthday\n$name!"
    }
}