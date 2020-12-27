package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

      //  binding.nameText.text= "Abdul Qadir"


/*
        findViewById<Button>(R.id.done_button).setOnClickListener {
            sendNickame(it)
        }
*/

        binding.doneButton.setOnClickListener {
            sendNickame(it)
        }

        //  populateData();
    }

    private fun sendNickame(view: View) {
     /*  val nickName: TextView = findViewById(R.id.name_text)
        val nickName_edit: EditText = findViewById(R.id.nickname_edit)
*/
     /*   binding.nameText.text = binding.nicknameEdit.text
        binding.nicknameEdit.visibility = View.GONE
        binding.nameText.visibility = View.VISIBLE
        */
        val myName: MyName = MyName("Abdul Qadir")
        binding.apply {
            nameText.text = binding.nicknameEdit.text
            nicknameEdit.visibility = View.GONE
            nameText.visibility = View.VISIBLE
            doneButton.visibility = View.GONE
            binding.myName = myName
            myName?.nickname = nicknameEdit.text.toString()
            invalidateAll()

        }

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)

    }
}