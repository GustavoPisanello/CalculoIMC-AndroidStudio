package com.example.calculo_imc;

import static android.os.Build.VERSION_CODES.S;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peso = findViewById(R.id.numPeso);
        altura = findViewById(R.id.numAlt);
        resultado = findViewById(R.id.result);
        rbMasc = findViewById(R.id.rbMasc);


    }
    EditText peso, altura;
    TextView resultado;
    RadioButton rbMasc;
    public void Calcular(View view){

        double numPeso, numAltura;
        String result;
        boolean rbM;

        numPeso = Double.parseDouble(peso.getText().toString());
        numAltura = Double.parseDouble(altura.getText().toString());
        rbM = rbMasc.isChecked();
        double valor;
        valor = numPeso/(numAltura * numAltura);

        if(rbM = true){
             if(valor < 20){
                 resultado.setText("Seu IMC é de:" + valor + "\n Abaixo do peso");
             }
             else if(valor > 20 && valor < 24.9) {
                 resultado.setText("Seu IMC é de:" + valor + "\n Peso ideal");
             }
             else if(valor > 25 && valor < 29.9){
                 resultado.setText("Seu IMC é de:" + valor + "\n Obesidade leve");
             }
             else if(valor >30 && valor < 39.9){
                 resultado.setText("Seu IMC é de:" + valor + "\n Obesidade Moderada");
             }
             else{
                 resultado.setText("Seu IMC é de:" + valor + "\n Obesidade Mórbida");
             }
        }
        else {
            if (valor < 19) {
                resultado.setText("Seu IMC é de:" + valor + "\n Abaixo do peso");
            }
            else if (valor > 19 && valor < 23.9) {
                resultado.setText("Seu IMC é de:" + valor + "\n Peso ideal");
            }
            else if (valor > 24 && valor < 28.9) {
                resultado.setText("Seu IMC é de:" + valor + "\n Obesidade leve");
            }
            else if (valor > 29 && valor < 38.9){
                resultado.setText("Seu IMC é de:" + valor + "\n Obesidade Moderada");
            }
            else{
            resultado.setText("Seu IMC é de:" + valor + "\n Obesidade Mórbida");
            }
        }
    }
}