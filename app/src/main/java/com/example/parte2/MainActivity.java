package com.example.parte2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText valor, descuento;
    Button total;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor = (EditText) findViewById(R.id.edTxtNValor);
        descuento = (EditText) findViewById(R.id.edTextNDescuento);
        total = (Button) findViewById(R.id.btnCalcular);
        resultado = (TextView) findViewById(R.id.txtVTotal);

    }

    public void Calcular(View view){
        double dato, desc, tot, resul;

        if(!valor.getText().toString().isEmpty() && !descuento.getText().toString().isEmpty()) {
            dato = Double.parseDouble(valor.getText().toString());
            desc = Double.parseDouble(descuento.getText().toString());
            tot = dato * (desc / 100);
            resul = dato - tot;

            resultado.setText("Valor neto es: " + String.valueOf(resul));
        } else{
            Toast.makeText(this, "Los campso estan vacios", Toast.LENGTH_SHORT).show();
        }
    }
}