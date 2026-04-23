package com.example.final_project

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)

        val ivLogo = findViewById<ImageView>(R.id.iv_logo)
        val tvAppName = findViewById<TextView>(R.id.tv_app_name)
        val tvSlogan = findViewById<TextView>(R.id.tv_slogan)

        // Load animations
        val fadeInScale = AnimationUtils.loadAnimation(this, R.anim.fade_in_scale)
        val slideUp = AnimationUtils.loadAnimation(this, R.anim.slide_up)

        ivLogo.startAnimation(fadeInScale)
        tvAppName.startAnimation(slideUp)
        tvSlogan.startAnimation(slideUp)

        // Navigate to MainActivity after 2500ms
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 2500)
    }
}
