package com.example.convertidormonedas;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public void convertir(View view){
        EditText et1 = findViewById(R.id.et1);
        String pesosString = et1.getText().toString();
        double pesos = Double.parseDouble(pesosString);
        double dolares = pesos / 3773;
        String dolaresString = String.format("%.2f",dolares);
        String mensaje = "COP " + pesosString + " son USD " + dolaresString;
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}