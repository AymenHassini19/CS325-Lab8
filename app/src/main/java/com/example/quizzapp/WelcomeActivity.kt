package com.example.quizzapp

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.quizzapp.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {

    private var mediaPlayer: MediaPlayer? = null
    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btnStart.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    MainActivity::class.java
                )
            )
        }

        val mediaPlayer = MediaPlayer.create(this, R.raw.start_audio)

        mediaPlayer?.let {
            it.isLooping = true
            it.start()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer?.let {
            it.release()
            mediaPlayer = null
        }
    }

}