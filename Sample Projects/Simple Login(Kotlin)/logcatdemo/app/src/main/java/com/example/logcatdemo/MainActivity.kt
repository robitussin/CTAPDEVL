package com.example.logcatdemo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
    }

    fun login(v: View) {
        val i = Intent(this, ProfileActivity::class.java)

        // This refers to the username textfield
        val t = findViewById<TextView>(R.id.username)
        val name = t.text.toString()

        i.putExtra("uname", name)

        val p = findViewById<TextView>(R.id.password)
        val password = p.text.toString()

        if (password == "abc123") {
            startActivity(i)
        } else {
            Toast.makeText(this, "INCORRECT PASSWORD", Toast.LENGTH_SHORT).show()
        }
    }
}