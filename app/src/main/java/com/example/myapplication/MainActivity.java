package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_logar;
    EditText nome, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.nomeUsuario);
        password = findViewById(R.id.passwordUsuario);
        btn_logar = findViewById(R.id.btn_logar);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent _intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(_intent);
            }
        }, 2000);
        btn_logar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String _nome = nome.getText().toString();
                String nome_ = _nome.toUpperCase();
                String _password = password.getText().toString();
                if(_password.length() >0 && _nome.length() > 0){

                    if(_password == "pass" && nome_ == "USER"){
                        Toast.makeText(MainActivity.this,"Bem-Vindo(a) "+nome_,Toast.LENGTH_LONG).show();
                    }
                    else{
                        Toast.makeText(MainActivity.this,"Um dos campos está errado",Toast.LENGTH_LONG).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this,"Preencha o formulário",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}