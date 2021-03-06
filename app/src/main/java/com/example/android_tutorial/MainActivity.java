package com.example.android_tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et_test;
    Button btn_test;
    ImageView image_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_test = (EditText)findViewById(R.id.et_test);
        btn_test = (Button)findViewById(R.id.btn_test);
        image_test = (ImageView)findViewById(R.id.image_test);


        // 버튼을 클릭했을 때 SubActivity를 띄우기
        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                startActivity(intent);
            }
        });

        image_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "내가 짱이다~~", Toast.LENGTH_SHORT).show();
            }
        });

        };
    }