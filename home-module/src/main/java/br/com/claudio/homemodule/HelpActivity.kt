package br.com.claudio.homemodule

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.claudio.homemodule.databinding.ActivityHelpBinding

class HelpActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHelpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHelpBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}