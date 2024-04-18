package br.com.claudio.homemodule

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.claudio.homemodule.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
//
//        binding.btHelp.setOnClickListener {
//            val intent = Intent(this, HelpActivity::class.java)
//            startActivity(intent)
//        }
    }
}