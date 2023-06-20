package com.my.asessesment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import com.my.asessesment.databinding.ActivityMainBinding
import com.my.asessesment.databinding.ActivityMyListBinding

class MyList : AppCompatActivity() {
    lateinit var binding: ActivityMyListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var button1 =findViewById<Button>(R.id.btnlogin)
        button1 .setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        onResume()
    }

    override fun onResume() {
        super.onResume()
        checkError()
        validateContacts()
    }


    fun checkError() {
        binding.tieuserName.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tieuserName.error = null
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })

        binding.tiePhonenumber.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }


            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tilPhonenumber.error = null
            }

            override fun afterTextChanged(s: Editable?) {
            }
        })


        binding.tieEmailAdress.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }


            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tilEmail.error = null
            }

            override fun afterTextChanged(s: Editable?) {
            }
        })

        binding.tiePassword.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }


            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tiePassword.error = null
            }

            override fun afterTextChanged(s: Editable?) {
            }
        })
    }


    fun  validateContacts(){
        val name =binding.tieuserName.text.toString()
        val phone =binding.tiePhonenumber.text.toString()
        val email =binding.tilEmail.textDirection.toString()
        val password =binding.tiePassword.text.toString()
        var error =false
        if (name.isBlank()){
            binding. tieuserName.error = "name is required"
            error = true
        }
        if (phone.isBlank()){
            binding. tilPhonenumber.error = "number is required"
            error = true
        }
        if (email.isBlank()){
            binding. tilEmail.error = "email is required"
            error = true
        }
        if (password.isBlank()){
            binding. tiePassword.error = "name is required"
            error = true
        }

    }



}





