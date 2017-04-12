package com.example.sey_t.calculadorasimples;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class CalculadoraCompleta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_completa);
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

    public void CalculadoraComplexa(View view)
    {
        EditText vc1 = (EditText) findViewById(R.id.edtValorUno);
        EditText vc2 = (EditText) findViewById(R.id.edtValorDuo);
        Double valorc1 = Double.parseDouble(vc1.getText().toString());
        Double valorc2 = Double.parseDouble(vc2.getText().toString());
        RadioButton rbSoma = (RadioButton) findViewById(R.id.rbSoma);
        RadioButton rbSubtracao = (RadioButton) findViewById(R.id.rbSubtracao);
        RadioButton rbMultiplicao = (RadioButton) findViewById(R.id.rbMultiplicacao);
        RadioButton rbDivisao = (RadioButton) findViewById(R.id.rbDivisao);


        Double resultado = 0.;
        if(rbSoma.isChecked())
        {
            resultado = valorc1+ valorc2;
        }

        else if(rbSubtracao.isChecked())
        {
            resultado = valorc1 - valorc2;
        }

        else if(rbMultiplicao.isChecked())
        {
            resultado = valorc1 * valorc2;
        }

        else if(rbDivisao.isChecked())
        {
            resultado = valorc1/valorc2;
        }

        Toast.makeText(getApplicationContext(), String.valueOf("o valor do resultado é: " + resultado), Toast.LENGTH_SHORT).show();
    }


}
