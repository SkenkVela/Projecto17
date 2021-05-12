package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button btn;
    EditText senha ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn = findViewById(R.id.ir);
        senha = findViewById(R.id.senha);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String _senha = senha.getText().toString();
                if(_senha =="123456fv"){
                    Toast.makeText(MainActivity2.this, "Login feito com sucesso", Toast.LENGTH_SHORT).show();
                    Intent _intent = new Intent(MainActivity2.this,MainActivity.class);
                    startActivity(_intent);
                }
                else{
                    Toast.makeText(MainActivity2.this, "Senha errada!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}