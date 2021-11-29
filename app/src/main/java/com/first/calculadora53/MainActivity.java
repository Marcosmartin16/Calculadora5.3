package com.first.calculadora53;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText caja1;
    public EditText caja2;
    public TextView tv1;
    private Spinner sp1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp1 = (Spinner) findViewById(R.id.sp1);
        caja1 = (EditText) findViewById(R.id.caja1);
        caja2 = (EditText) findViewById(R.id.caja2);
        tv1 = (TextView) findViewById(R.id.tv1);

        String[] operador = {"operadores", "+", "-", "X", "/"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, operador);
        sp1.setAdapter(adapter);


    }

    public void operar(View view){
        String valor1 = caja1.getText().toString();
        String valor2 = caja2.getText().toString();

        int numero1 = Integer.parseInt(valor1);
        int numero2 = Integer.parseInt(valor2);

        String selec=sp1.getSelectedItem().toString();

        if (selec.equals("+")){
            int suma = numero1 + numero2;
            String resultado = String.valueOf(suma);
            tv1.setText(resultado);
        }else
            if(selec.equals("-")){
                int resta = numero1 - numero2;
                String resultado = String.valueOf(resta);
                tv1.setText(resultado);
        }else
            if (selec.equals("X")){
                int multiplicacion = numero1 * numero2;
                String resultado = String.valueOf(multiplicacion);
                tv1.setText(resultado);
            }else
                if(selec.equals("/")){
                    int division = numero1 / numero2;
                    String resultado = String.valueOf(division);
                    tv1.setText(resultado);
                }
    }
}

