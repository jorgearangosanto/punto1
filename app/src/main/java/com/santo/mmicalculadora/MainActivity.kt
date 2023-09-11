package com.santo.mmicalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.santo.mmicalculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var numero1 = 0
    private var numero2 = 0
    private var operacion = ""
    private var resultado = 0
    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        val view = mainBinding.root
        setContentView(view)
        //val numero1 = 0
        //mainBinding.reultadoTextView2.setText("hola")

        mainBinding.equalButton15.setOnClickListener {
            //val numero1 = mainBinding.oneButton9.setText("1").toString()
            //val numero1 = mainBinding.sevenButton.text
            //val uno = mainBinding.oneButton9.text.toString().toInt()
            //uno = 1.toInt()
                //https://www.youtube.com/watch?v=gnmin11DY08


            //val numero1 = mainBinding.oneButton9.text.toString()==("1")
            //mainBinding.reultadoTextView2.text = mainBinding.oneButton9.toString()

            //mainBinding.oneButton9.setOnClickListener {
            //val numero1 = mainBinding.oneButton9.text.toString()==("1")
            //val resultado = mainBinding.reultadoTextView2.text.toString() + numero1.toString()}


        }
    }

    fun escribirsiete(view: View) {
        numero1 = mainBinding.reultadoTextView2.text.toString().toInt()
        if (numero1 == 0) {
            mainBinding.reultadoTextView2.setText("7")
        } else {


        }
    }

    fun escribirocho(view: View) {
        numero1 = mainBinding.reultadoTextView2.text.toString().toInt()
        if (numero1 == 0) {
            mainBinding.reultadoTextView2.setText("8")
        } else {


        }

    }

    fun operaciondividir(view: View) {
        numero1 = mainBinding.reultadoTextView2.text.toString().toInt()
        operacion = "/"
        mainBinding.reultadoTextView2.setText("/")

    }

    fun mostrarresultado(view: View) {
        numero2 = mainBinding.reultadoTextView2.text.toString().toInt()
        if (operacion ==("/")){
            resultado = numero1/numero2
            mainBinding.reultadoTextView2.setText(resultado.toString().toInt())
        }
        if (operacion==("+")){
            resultado = numero1+numero2
            mainBinding.reultadoTextView2.setText(resultado.toString().toInt())
            }
        if (operacion==("-")){
            resultado = numero1-numero2
            mainBinding.reultadoTextView2.setText(resultado.toString().toInt())
        }
        if (operacion==("*")){
            resultado = numero1*numero2
            mainBinding.reultadoTextView2.setText(resultado.toString().toInt())

        }

        }

    fun escribirnueve(view: View) {
        numero1 = mainBinding.reultadoTextView2.text.toString().toInt()
        if (numero1 == 0) {
            mainBinding.reultadoTextView2.setText("9")
        } else {


        }

    }

    fun escribircuatro(view: View) {
        numero1 = mainBinding.reultadoTextView2.text.toString().toInt()
        if (numero1 == 0) {
            mainBinding.reultadoTextView2.setText("4")
        } else {


        }
    }

    fun escribircinco(view: View) {
        numero1 = mainBinding.reultadoTextView2.text.toString().toInt()
        if (numero1 == 0) {
            mainBinding.reultadoTextView2.setText("5")
        } else {


        }
    }

    fun escribirseis(view: View) {
        numero1 = mainBinding.reultadoTextView2.text.toString().toInt()
        if (numero1 == 0) {
            mainBinding.reultadoTextView2.setText("6")
        } else {


        }
    }

    fun escribiruno(view: View) {
        numero1 = mainBinding.reultadoTextView2.text.toString().toInt()
        if (numero1 == 0) {
            mainBinding.reultadoTextView2.setText("1")
        } else {


        }
    }

    fun escribirdos(view: View) {
        numero1 = mainBinding.reultadoTextView2.text.toString().toInt()
        if (numero1 == 0) {
            mainBinding.reultadoTextView2.setText("2")
        } else {


        }
    }

    fun escribirtres(view: View) {
        numero1 = mainBinding.reultadoTextView2.text.toString().toInt()
        if (numero1 == 0) {
            mainBinding.reultadoTextView2.setText("3")
        } else {


        }
    }

    fun escribircero(view: View) {
        numero1 = mainBinding.reultadoTextView2.text.toString().toInt()
        if (numero1 == 0) {
            mainBinding.reultadoTextView2.setText("0")
        } else {


        }


    }

    fun operacionsuma(view: View) {
        numero1 = mainBinding.reultadoTextView2.text.toString().toInt()
        operacion = "+"
        mainBinding.reultadoTextView2.setText("+")
    }

    fun operacionresta(view: View) {
        numero1 = mainBinding.reultadoTextView2.text.toString().toInt()
        operacion = "-"
        mainBinding.reultadoTextView2.setText("-")
    }

    fun operacionmultiplicar(view: View) {
        numero1 = mainBinding.reultadoTextView2.text.toString().toInt()
        operacion = "*"
        mainBinding.reultadoTextView2.setText("*")

    }
}