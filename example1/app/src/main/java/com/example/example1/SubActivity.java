package com.example.example1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Button Btn2 = findViewById(R.id.Btn2);
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("태그", "값");
            }
        });

        findViewById(R.id.Btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(SubActivity.this, MainActivity.class);
                intent.putExtra("키","위");
                startActivity(intent);
            }
        });

    }

    public void Btn1Click(View v) {
        Toast toast = Toast.makeText(this, "ㅋㅋㅋ", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.END | Gravity.BOTTOM, 10, 10);
        toast.show();
    }

}
