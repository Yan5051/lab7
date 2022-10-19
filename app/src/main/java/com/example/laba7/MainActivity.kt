package com.example.laba7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity","Activity переходит из состояния INITIALIZED к состоянию CREATED")
    }
    override fun onStart() {
        super.onStart()
        Log.d("MainActivity","Activity стартует и готовится выйти на передний план, чтобы стать видимым пользователю.")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity","Activity становится видимым пользователю и переходит в состояние RESUMED")
    }

    override fun onPostResume() {
        super.onPostResume()
        Log.d("MainActivity","Вызывается после onResume() когда процесс возобновления Activity завершился.")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity","Activity уходит с переднего плана и переходит из состояния RESUMED в состояние STARTED")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity","Activity становится невидимым пользователю и возвращается в состояние CREATED.")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity","Activity собирается вернуться на передний план и будет отображено пользователю")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity","Вызывается непосредственно перед уничтожением Activity")
    }
}