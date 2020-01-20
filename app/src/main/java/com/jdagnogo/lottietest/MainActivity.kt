package com.jdagnogo.lottietest

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        thumb_up.setOnClickListener {
                with(thumb_down) {
                    progress = 0f
                    pauseAnimation()
                }
                thumb_up.playAnimation()
                Toast.makeText(this@MainActivity, "Cheers!!", Toast.LENGTH_SHORT).show()
        }

        thumb_down.setOnClickListener {
            with(thumb_up) {
               setProgress(0f)
               pauseAnimation()
            }
            thumb_down.playAnimation()
            Toast.makeText(this@MainActivity, "Boo!!", Toast.LENGTH_SHORT).show()
        }
    }
}
