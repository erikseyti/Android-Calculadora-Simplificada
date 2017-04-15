package com.example.sey_t.calculadorasimples;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CalculadoraExterna2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_externa2);
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

    public void CalcularSomaExterna2(View view)
    {
        EditText value1 = (EditText) findViewById(R.id.edtValorOne);
        EditText value2 = (EditText) findViewById(R.id.edtValorTwo);

        Double doubleValue1 = Double.parseDouble(value1.getText().toString());
        Double doubleValue2 = Double.parseDouble(value2.getText().toString());


        Double result = doubleValue1 + doubleValue2;
        // conversão do resultado para o formato String para passar para a outra Activity
        String resultString = Double.toString(result);
        // chamada para a outra Activity
        Intent myIntent = new Intent(this, CalculadoraExterna2Resultado.class);
        // criação do parametro resultado para ser exibido na outra Activity
        myIntent.putExtra("resultado", resultString);
        // iniciação da outra Activity
        startActivity(myIntent);



        //http://stackoverflow.com/questions/2091465/how-do-i-pass-data-between-activities-in-android-application
        //http://stackoverflow.com/questions/2347152/in-android-how-do-i-get-variables-data-from-one-screen-to-another

    }

}
