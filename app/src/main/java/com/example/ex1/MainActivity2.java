package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String billAmountText= getIntent().getStringExtra("billAmountText");
        String tipText= getIntent().getStringExtra("tipText");
        String noOfPeopleText= getIntent().getStringExtra("noOfPeopleText");

        Double billAmount=Double.parseDouble(billAmountText);
        Double tip=Double.parseDouble(tipText);
        Double noOfPeople=Double.parseDouble(noOfPeopleText);

        Double TipAmount = billAmount * tip / 100;
        Double TotalAmount = billAmount + tip;
        Double TotalPerPerson = tip / noOfPeople;

        TextView TotalAmounttext = findViewById(R.id.textView);
        TextView TipAmounttext= findViewById(R.id.editText2);
        TextView TotalPerPersontext = findViewById(R.id.editText3);

        SeekBar seekBar = findViewById(R.id.seekBar); // Replace with your SeekBar's ID
        TotalAmounttext.setText(String.format("%.2f", TotalAmount));
        seekBar.setProgress((int)Math.floor(TotalAmount));
        TipAmounttext.setText(String.format("%.2f", TipAmount));
        TotalPerPersontext.setText(String.format("%.2f", TotalPerPerson));


    }
}