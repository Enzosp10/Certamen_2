package com.example.certamen_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button btn_ingresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_ingresar = findViewById(R.id.btn_ingresar);




        btn_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_ingresar = new Intent(MainActivity.this,MainActivity2.class);

                startActivity(btn_ingresar);
            }
        });
    }







}