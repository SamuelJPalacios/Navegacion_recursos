package com.diosbadi.navegacion_recursos;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        TextView textViewNombre = findViewById(R.id.textViewNombre);
        Intent intent = getIntent();
        String nombre = intent.getStringExtra("nombre");
        textViewNombre.setText("¡Hola, " + nombre + "!");
    }
}
