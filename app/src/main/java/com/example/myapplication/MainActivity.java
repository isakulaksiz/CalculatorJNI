package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private NativeLibrary nativeLib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nativeLib = new NativeLibrary(this);

        Button btnCalc = (Button) findViewById(R.id.btnCalc);
        btnCalc.setOnClickListener(new View.OnClickListener() {
            final TextView result = (TextView) findViewById(R.id.result);
            final EditText value1 = (EditText) findViewById(R.id.val1);
            final EditText value2 = (EditText) findViewById(R.id.val2);


            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                int v1 , v2, res;
                v1 = Integer.parseInt(value1.getText().toString());
                v2 = Integer.parseInt(value2.getText().toString());

                res = nativeLib.calculateToJni(v1,v2);
                result.setText(Integer.valueOf(res).toString());
            }
        });
    }
}