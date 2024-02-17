package com.example.a209755ihm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class InicioSesion extends AppCompatActivity implements View.OnClickListener {

    public Button olvidoContrasenia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);

        olvidoContrasenia =  (Button) findViewById(R.id.button4);
        olvidoContrasenia.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(InicioSesion.this, OlvidoContrasenia.class);
        startActivity(intent);
    }
}
