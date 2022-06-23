package kg.geektech.classwork361

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.geektech.classwork361.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var counter: Int = 0;
    private var flag: Boolean = false;
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.text.text = counter.toString()
        binding.btn.setOnClickListener {
            if (counter == 0 && flag) {
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent);
            } else if (flag) {
                counter--
                if (counter == 0) {
                    binding.btn.text = "Open Activity"
                }
            } else {
                counter++
            }
            if (counter == 10) {
                binding.btn.text = "-1"
                flag = true;
            }
            binding.text.text = counter.toString()
        }
    }
}