package com.example.where2go

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val backgroundImg : ImageView = findViewById(R.id.iv_car)
        val backgroundImg1 : ImageView = findViewById(R.id.iv_location)
        val sideAnimation = AnimationUtils.loadAnimation(this, R.anim.slide)
        val sideAnimation1 = AnimationUtils.loadAnimation(this, R.anim.pop_up)
        backgroundImg.startAnimation(sideAnimation)
        backgroundImg1.startAnimation(sideAnimation1)
        Handler().postDelayed ({
            startActivity(Intent(this, SignUpActivity::class.java))
            finish()
        },3000)
    }
}