package thinktankesolutions.com.firestoredemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

    }

    public fun gotoMain(view: View) {
        startActivity(Intent(this, MainActivity::class.java))
    }
}