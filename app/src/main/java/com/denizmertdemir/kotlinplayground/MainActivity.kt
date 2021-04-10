package com.denizmertdemir.kotlinplayground

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.denizmertdemir.kotlinplayground.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @Inject
    @Named("TestString")
    lateinit var testString: String

    @Inject
    @Named("valueFromActivityModule")
    lateinit var testStringFromResources: String

    private val viewModel : TestViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        binding.btnTest.setOnClickListener {
            viewModel
            Toast.makeText(this,"$testString \n$testStringFromResources",Toast.LENGTH_LONG).show()
        }
    }
}