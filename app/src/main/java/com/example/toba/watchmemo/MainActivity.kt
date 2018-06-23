package com.example.toba.watchmemo

import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.text.SpannableStringBuilder
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Enables Always-on
        setAmbientEnabled()

        button1.setOnClickListener{
            inputText.text = ""+inputText.text+"1"
        }

        button0.setOnClickListener{
            inputText.text = ""+inputText.text+"0"
        }
        button2.setOnClickListener{
            inputText.text = ""+inputText.text+"2"
        }
        button3.setOnClickListener{
            inputText.text = ""+inputText.text+"3"
        }
        button4.setOnClickListener{
            inputText.text = ""+inputText.text+"4"
        }
        button5.setOnClickListener{
            inputText.text = ""+inputText.text+"5"
        }
        button6.setOnClickListener{
            inputText.text = ""+inputText.text+"6"
        }
        button7.setOnClickListener{
            inputText.text = ""+inputText.text+"7"
        }
        button8.setOnClickListener{
            inputText.text = ""+inputText.text+"8"
        }
        button9.setOnClickListener{
            inputText.text = ""+inputText.text+"9"
        }
        reset_button.setOnClickListener{
            inputText.text = ""
        }
        backspace_button.setOnClickListener{
            inputText.append("")
            var backspace : SpannableStringBuilder = inputText.text as SpannableStringBuilder
            if(inputText.length()>0){
                backspace.delete(backspace.length-1, backspace.length)
                inputText.setText(backspace.toString())
            }
        }
    }
}
