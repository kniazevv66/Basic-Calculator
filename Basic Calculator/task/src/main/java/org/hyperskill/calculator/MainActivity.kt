package org.hyperskill.calculator

import android.icu.text.NumberFormat
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText: EditText = findViewById(R.id.editText)
        setClearBtnEvent(findViewById(R.id.clearButton), editText)
        setNumBtnEvent(findViewById(R.id.button9), editText)
        setNumBtnEvent(findViewById(R.id.button8), editText)
        setNumBtnEvent(findViewById(R.id.button7), editText)
        setNumBtnEvent(findViewById(R.id.button6), editText)
        setNumBtnEvent(findViewById(R.id.button5), editText)
        setNumBtnEvent(findViewById(R.id.button4), editText)
        setNumBtnEvent(findViewById(R.id.button3), editText)
        setNumBtnEvent(findViewById(R.id.button2), editText)
        setNumBtnEvent(findViewById(R.id.button1), editText)
        setZeroBtnEvent(findViewById(R.id.button0), editText)
        setDotBtnEvent(findViewById(R.id.dotButton), editText)
        val eqlBtn: Button = findViewById(R.id.equalButton)
        setSubtrBtnEvent(findViewById(R.id.subtractButton), eqlBtn, editText)
        setAddBtnEvent(findViewById(R.id.addButton), eqlBtn, editText)
        setMultpBtnEvent(findViewById(R.id.multiplyButton), eqlBtn, editText)
        setDivBtnEvent(findViewById(R.id.divideButton), eqlBtn, editText)
    }
    fun setZeroBtnEvent(
        btn: Button,
        linked: EditText
    ) = btn.setOnClickListener {
        linked.text.append(btn.text)
    }
    fun setDotBtnEvent(
        btn: Button,
        linked: EditText
    ) = btn.setOnClickListener {
        linked.text.append(btn.text)
    }
    fun setSubtrBtnEvent(
        btn: Button,
        eqlBtn: Button,
        linked: EditText
    ) = btn.setOnClickListener {
        val num = linked.text.toString()
        linked.setText("")
        linked.hint = num
        eqlBtn.setOnClickListener {
            linked.setText(NumberFormat.getInstance().format(num.toDouble() - linked.text.toString().toDouble()))
        }
    }
    fun setAddBtnEvent(
        btn: Button,
        eqlBtn: Button,
        linked: EditText
    ) = btn.setOnClickListener {
        val num = linked.text.toString()
        linked.setText("")
        linked.hint = num
        eqlBtn.setOnClickListener {
            linked.setText(NumberFormat.getInstance().format(num.toDouble() + linked.text.toString().toDouble()))
        }
    }
    fun setMultpBtnEvent(
        btn: Button,
        eqlBtn: Button,
        linked: EditText
    ) = btn.setOnClickListener {
        val num = linked.text.toString()
        linked.setText("")
        linked.hint = num
        eqlBtn.setOnClickListener {
            linked.setText(NumberFormat.getInstance().format(num.toDouble() * linked.text.toString().toDouble()))
        }
    }
    fun setDivBtnEvent(
        btn: Button,
        eqlBtn: Button,
        linked: EditText
    ) = btn.setOnClickListener {
        val num = linked.text.toString()
        linked.setText("")
        linked.hint = num
        eqlBtn.setOnClickListener {
            linked.setText(NumberFormat.getInstance().format(num.toDouble() / linked.text.toString().toDouble()))
        }
    }
    fun setNumBtnEvent(
        btn: Button,
        linked: EditText
    ) = btn.setOnClickListener {
        linked.text.append(btn.text)
    }
    fun setClearBtnEvent(
        btn: Button,
        linked: EditText
    ) = btn.setOnClickListener {
        linked.setText("")
        linked.hint = "0"
    }
}