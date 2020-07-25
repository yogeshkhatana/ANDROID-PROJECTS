package com.example.yogeshkhatana.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convertCurrency(View view)
    {
        Log.i("info" ,"Button pressed");
        EditText editText=(EditText)findViewById(R.id.editText);
        String amountinDollars=editText.getText().toString();
        double amountinDollarsDouble=Double.parseDouble(amountinDollars);
        double amountinRupeesDouble=amountinDollarsDouble*70.51;
        String amountInRupeesString=String.format("%.2f",amountinRupeesDouble);
        Toast.makeText(this, " $ "+amountinDollars+" is RS "+amountInRupeesString, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
