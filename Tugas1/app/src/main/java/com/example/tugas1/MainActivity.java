package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnSegitiga, btnJajargenjang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSegitiga = findViewById(R.id.btnSegitiga);
        btnJajargenjang = findViewById(R.id.btnJajargenjang);

        btnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),isiSegitiga.class);
                startActivity(intent);
            }
        });

        btnJajargenjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),isiJajargenjang.class);
                startActivity(intent);
            }
        });
    }
}
