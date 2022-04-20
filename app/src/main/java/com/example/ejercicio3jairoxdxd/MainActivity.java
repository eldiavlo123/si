package com.example.ejercicio3jairoxdxd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //atibutos
    private EditText tbPalabra;
    private Button btnProcesar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.el_diavlo_123);
        tbPalabra.setText("probando errores");
        inicializarVistas();
    }
    private void inicializarVistas(){
        tbPalabra = findViewById(R.id.tbPalabra);
        btnProcesar = findViewById(R.id.btnProcesar);
    }
}