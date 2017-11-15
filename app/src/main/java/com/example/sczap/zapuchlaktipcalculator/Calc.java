package com.example.sczap.zapuchlaktipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;


public class Calc extends AppCompatActivity {

    //find all of the inputs we will need to reference
    EditText tipPercentUserEntered = (EditText) findViewById(R.id.tipPercentUserInput);
    EditText billTotalUserEntered = (EditText) findViewById(R.id.billTotalUserInput);
    TextView tipAmountCalc = (TextView) findViewById(R.id.tipAmountCalc);
    TextView totalWithtipCalc = (TextView) findViewById(R.id.totalWithTipCalc);
    TextView eachPersonCalc = (TextView) findViewById(R.id.eachUserPaysCalc);
    EditText personUserEntered = (EditText)  findViewById(R.id.personUserInput);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        //attach the listener to the calculate button
        Button calcButton = (Button) findViewById(R.id.calculateButton);
        calcButton.setOnClickListener(new CalculateClickListener());

        //attach the listener to the reset button
        Button resetButton = (Button) findViewById(R.id.resetButton);
        resetButton.setOnClickListener(new ResetClickListener());

    }

    private class CalculateClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view){

                //calculate tip amount from the percentage entered and the total bill amount
                //and then set the text in the calc slot
                int billAmount = Integer.parseInt(billTotalUserEntered.getText().toString());
                int getTip = Integer.parseInt(tipPercentUserEntered.getText().toString());
                int tipAmount = getTip*billAmount/100;
                tipAmountCalc.setText(Integer.toString(tipAmount));

                //calculate total with the tip , and then set the text in the calc slot
                int totalPlusTip= billAmount+tipAmount;
                totalWithtipCalc.setText(Integer.toString(totalPlusTip));

                //calculate amount per person , and then set the text in the calc slot
                int personAmount = Integer.parseInt(personUserEntered.getText().toString());
                int eachPersonOwes= totalPlusTip/personAmount;
                eachPersonCalc.setText(Integer.toString(eachPersonOwes));
           }
    }

     public class ResetClickListener implements View.OnClickListener {
         @Override
         public void onClick(View view) {
             tipPercentUserEntered.setText(String.format(""));
             billTotalUserEntered.setText(String.format(""));
             tipAmountCalc.setText(String.format(""));
             totalWithtipCalc.setText(String.format(""));
             eachPersonCalc.setText(String.format(""));
             personUserEntered.setText(String.format(""));

         }
         }
}
