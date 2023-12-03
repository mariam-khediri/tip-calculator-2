package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calculer = findViewById(R.id.button);
        calculer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText  billAmountEditText = findViewById(R.id.editText1);
                EditText tipEditText = findViewById(R.id.editText2);
                EditText noOfPeopleEditText = findViewById(R.id.editText3);


                String billAmountText = billAmountEditText.getText().toString();
                String tipText = tipEditText.getText().toString();
                String noOfPeopleText = noOfPeopleEditText.getText().toString();

                try {
                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    i.putExtra("billAmountText",billAmountText);
                    i.putExtra("tipText",tipText);
                    i.putExtra("noOfPeopleText", noOfPeopleText);
                    startActivity(i);
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}