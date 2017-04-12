package com.example.sey_t.calculadorasimples;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CalculadoraSimples extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_simples);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void Calcular(View view)
    {
        EditText v1 = (EditText) findViewById(R.id.edt1Valor);
        EditText v2 = (EditText) findViewById(R.id.edt2Valor);

        Double valor1 = Double.parseDouble(v1.getText().toString());
        Double valor2 = Double.parseDouble(v2.getText().toString());



        Double resultado = valor1+ valor2;

        Toast.makeText(getApplicationContext(), String.valueOf("O resultado da Soma é : " + resultado), Toast.LENGTH_LONG).show();

    }



}
