package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurr(View view){
        EditText dollars = (EditText) findViewById(R.id.input);
        Spinner selectionSpinner = (Spinner) findViewById(R.id.convSpinner);
        String selection = selectionSpinner.getSelectedItem().toString();
        boolean inputEmpty = TextUtils.isEmpty(dollars.getText());
        if(!inputEmpty){
            Double convDollars = Double.parseDouble(dollars.getText().toString());
            if(selection.equals("Bitcoin")){
                convDollars *= .00015386;
            }
            if(selection.equals("Euros")){
                convDollars *= 0.86;
            }
            if(selection.equals("Yen")){
                convDollars *= 110.60;
            }
            Toast.makeText(MainActivity.this, String.format("%.2f", convDollars) + " " + selection, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
