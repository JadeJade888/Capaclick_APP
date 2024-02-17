package com.example.a209755ihm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class OlvidoContrasenia extends AppCompatActivity implements View.OnClickListener {

    public ImageButton regresarMenuInicioSesion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olvido_contrasenia);

        regresarMenuInicioSesion =  (ImageButton) findViewById(R.id.imageButton);
        regresarMenuInicioSesion.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(OlvidoContrasenia.this, InicioSesion.class);
        startActivity(intent);
    }
}