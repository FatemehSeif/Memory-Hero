package ir.shariaty.memoryhero

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.IntentCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import ir.shariaty.memoryhero.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {
    private lateinit var binding : ActivityStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
<<<<<<< HEAD

        super.onCreate(savedInstanceState)
        private var clapSound: MediaPlayer? = null

=======
        super.onCreate(savedInstanceState)
>>>>>>> upstream/master
        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnStart.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
<<<<<<< HEAD
            clapSound = MediaPlayer.create(this, R.raw.clap)
=======
>>>>>>> upstream/master
        }
    }
}