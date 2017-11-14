package com.example.sczap.zapuchlaktipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

import org.w3c.dom.Text;

public class Calc extends AppCompatActivity {
    EditText personUserEntered;
    EditText tipPercentUserEntered;
    EditText billTotalUserEntered;
    Button calculateButton;
    Button resetButton;
    TextView tipAmountCalc;
    TextView totalWithtipCalc;
    TextView eachPersonCalc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        personUserEntered =  findViewById(R.id.personUserInput);
        personUserEntered =  findViewById(R.id.tipPercentUserInput);
        personUserEntered =  findViewById(R.id.billTotalUserInput);
        calculateButton =  findViewById(R.id.calculateButton);

        calculateButton.setOnClickListener(new View.OnClickListener(){
           public void onClick(View view){
               tipAmountCalc = findViewById(R.id.tipAmountCalc);
               totalWithtipCalc = findViewById(R.id.totalWithTipCalc);
               eachPersonCalc = findViewById(R.id.eachUserPaysCalc);

               tipAmountCalc.setText("Just seeing if this works");
           }
        });
    }

}
