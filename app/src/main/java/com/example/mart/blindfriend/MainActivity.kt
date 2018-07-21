package com.example.mart.blindfriend

import android.graphics.Camera
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.ml.vision.cloud.FirebaseVisionCloudDetectorOptions
import com.google.firebase.ml.vision.common.FirebaseVisionImage
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var currentPath: String? = null
    val CAMERA_REQUEST_CODE = 0
    val GALLAERY_REQUEST_CODE = 1


    var options = FirebaseVisionCloudDetectorOptions.Builder()
            .setModelType(FirebaseVisionCloudDetectorOptions.LATEST_MODEL)
            .setMaxResults(15)
            .build()


    lateinit var image: FirebaseVisionImage


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonCapture.setOnClickListener {

        }

    }
}
