package android.app.myplayer

import android.os.Bundle
import android.os.Message
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Toast.makeText(this, "Hello world", Toast.LENGTH_SHORT).show()

        toast("Hello World")
    }

    private fun toast(message: String){

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}