package com.bigstep.samples.androidlibdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bigstep.libraries.sampleandroidlib.ReactActivity
import com.bigstep.samples.androidlibdemo.R
import com.bigstep.libraries.sampleandroidlib.SampleAndroidLibMain
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialise the main class from the Sample Android Library module
        btnPressMe.setOnClickListener {
            startActivity(Intent(this@MainActivity, ReactActivity::class.java))
        }
    }
}
