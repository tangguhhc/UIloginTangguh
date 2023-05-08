package com.example.tugasuilogin

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Iagree = findViewById<TextView>(R.id.iagree)

        val mText = "I agree with Terms and Privacy"
        val mSpannableString = SpannableString(mText)
        val mBlue = ForegroundColorSpan(this.getColor(R.color.teal_200))
        val mbiru = ForegroundColorSpan(this.getColor(R.color.teal_200))
        mSpannableString.setSpan(mBlue, 12, 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        mSpannableString.setSpan(mbiru, 22, 30, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        Iagree.text = mSpannableString

        val secondActbutton = findViewById<TextView>(R.id.login)
        secondActbutton.setOnClickListener{
            val Intent = Intent (this,Loginacty::class.java)
            startActivity(Intent)
        }
    }
}