package com.example.a209755ihm;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;


public class inicio_sesion extends AppCompatActivity{
    private button registrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);

        registrar = (Button) findViewById(R.id.button2);
        registrar.setOnClickListener(this);
    }
    @Override
    public void onClick(view v){
        intent in
    }
}
