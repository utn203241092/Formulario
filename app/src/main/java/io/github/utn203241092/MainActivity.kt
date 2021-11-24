package io.github.utn203241092

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val peso = findViewById<EditText>(R.id.idpeso)
        val altura = findViewById<EditText>(R.id.idaltura)
        val imc = findViewById<TextView>(R.id.idimc)
        val calcular = findViewById<Button>(R.id.btncalcular)
    }

    private fun calcular(peso: String, altura: String): Double = peso.toDouble() / (altura.toDouble() * altura.toDouble())
}