package br.com.fiap.placarpingpong

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_player.*

class PlayerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)

        btStartGame.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("PLAYER_1",inputP1.text)
            intent.putExtra("PLAYER_2",inputP2.text)
            startActivity(intent)
            finish()
        }
    }
}
