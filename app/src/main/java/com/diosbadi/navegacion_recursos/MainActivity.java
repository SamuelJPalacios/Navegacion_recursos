package com.diosbadi.navegacion_recursos;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //Boton para abrir perfil
        Button btnVerPerfil = findViewById(R.id.btnVerPerfil);
        btnVerPerfil.setOnClickListener(v -> {
            EditText editTextNombre = findViewById(R.id.editTextNombre);
            String nombre = editTextNombre.getText().toString();

            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("nombre", nombre);
            startActivity(intent);
        });

        //Boton para abrir web (Intent implicito)
        Button btnAbrirWeb = findViewById(R.id.btnAbrirWeb);
        btnAbrirWeb.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, WebActivity.class);
            startActivity(intent);
        });
    }
}