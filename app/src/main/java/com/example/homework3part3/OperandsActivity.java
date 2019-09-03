package com.example.homework3part3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OperandsActivity extends AppCompatActivity {

    static final String RESULT_KEY = "res_key";

    EditText first_number;
    EditText second_number;
    TextView resultView;
    Button plus;
    Button minus;
    Button multiply;
    Button division;
    Button save;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operands);


        first_number = findViewById(R.id.first_number);
        second_number = findViewById(R.id.second_number);
        resultView = findViewById(R.id.result);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply1);
        division = findViewById(R.id.division);
        save = findViewById(R.id.save);

        String number1 = first_number.getText().toString();
        String number2 = second_number.getText().toString();

        final int num1 = Integer.parseInt(number1);
        final int num2 = Integer.parseInt(number2);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result = num1 + num2;
                resultView.setText(result);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result = num1 - num2;
                resultView.setText(result);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result = num1 * num2;
                resultView.setText(result);
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result = num1 / num2;
                resultView.setText(result);
            }
        });

        public void save (View view){
            Intent intent = new Intent();
            intent.putExtra(RESULT_KEY, textView.getText());
            setResult(RESULT_OK, intent);
            finish();

        }



}

    }

