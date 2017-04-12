package com.example.sey_t.calculadorasimples;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculadoraExterna extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_externa);
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

    public void CalcularLabel(View view)
    {

        EditText ve1 = (EditText) findViewById(R.id.edtValorUm);
        EditText ve2 = (EditText) findViewById(R.id.edtValorDois);
        Double valore1 = Double.parseDouble(ve1.getText().toString());
        Double valore2 = Double.parseDouble(ve2.getText().toString());
        Double resposta =0.0;
        resposta = valore1 + valore2;




        setContentView(R.layout.content_calculadora_externa);
        TextView textView = (TextView) findViewById(R.id.lbVar);
        textView.setText("o Valor da soma é: "+ resposta);
    }




}
