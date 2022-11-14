package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText numberField1, numberField2;
    private Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        numberField1 = findViewById(R.id.numberField1);
        numberField2 = findViewById(R.id.numberField2);
        addButton = findViewById(R.id.addButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(numberField1.getText().toString());
                float num2 = Float.parseFloat(numberField2.getText().toString());
                float res = num1 + num2;
                textView.setText(String.valueOf(res));
            }
        });
    }


}