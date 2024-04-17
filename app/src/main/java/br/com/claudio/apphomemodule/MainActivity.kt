package br.com.claudio.apphomemodule

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.claudio.apphomemodule.databinding.ActivityMainBinding
import br.com.claudio.homemodule.HomeActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btNavigate.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("token", "123456")
            startActivity(intent)
        }
    }
}