package com.lv.logintest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText username = null;
    private EditText password = null;
    private TextView deadline;
    private TextView counter;
    private Button login;
    private Button cancel;
    int count = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.editText1);
        password = findViewById(R.id.editText2);
        deadline = findViewById(R.id.textView4);
        counter = findViewById(R.id.textView5);
        counter.setText(Integer.toString(count));
        login = findViewById(R.id.button1);
        cancel = findViewById(R.id.button2);
    }

    public void login(View view) {
        if (username.getText().toString().equals("admin") && password.getText().toString().equals("12345")) {
            Toast.makeText(getApplicationContext(), "you are right", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "no no no", Toast.LENGTH_SHORT).show();
            deadline.setTextColor(Color.RED);
            count--;
            counter.setText(Integer.toString(count));
            password.setText("");
            if (count == 0) {
                login.setEnabled(false);
            }
        }
    }

    public void cancle(View view) {
        System.exit(0);
    }
}
