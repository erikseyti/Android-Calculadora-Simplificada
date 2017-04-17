package com.example.sey_t.calculadorasimples;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class CalculadoraExterna2Resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_externa2_resultado);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //para passagem dos parametros de uma interface para a outra
        Intent intent = getIntent();

        // puxado o valor do parametro resultado da outra Activity e instanciado na variavel resultado1
        String resultado1 = intent.getStringExtra("resultado");

        // chamada para poder pegar o valor label, para poder assim altera-lo na linha seguinte
        TextView textView = (TextView) findViewById(R.id.lbResultadoSoma);
        // alterado o valor da variavel para o valor abaixo
        textView.setText("o Valor da soma é: "+ resultado1);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void VoltarCalculadoraExterna2(View view)
    {
        Intent it = new Intent(this,CalculadoraExterna2.class);
        startActivity(it);
    }


}
