package test.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ckbutton.setOnClickListener {
            textview.text = "버튼을 누름"
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}
