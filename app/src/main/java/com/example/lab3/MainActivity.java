package com.example.lab3;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView outputView;

    private Button zeroButton;
    private Button oneButton;
    private Button twoButton;
    private Button threeButton;
    private Button fourButton;
    private Button fiveButton;
    private Button sixButton;
    private Button sevenButton;
    private Button eightButton;
    private Button nineButton;
    private Button signButton;
    private Button plusButton;
    private Button minusButton;
    private Button decimalButton;
    private Button equalButton;
    private Button timesButton;
    private Button divideButton;
    private Button percentButton;
    private Button sqrtButton;
    private Button clearButton;

    StringBuilder s = new StringBuilder();
    String[] operation= {"0"};
    BigDecimal var1;
    BigDecimal var2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // The next block of code sets buttons and onClick Listeners
        zeroButton = findViewById(R.id.zeroButton);
        zeroButton.setOnClickListener(this);
        oneButton = findViewById(R.id.oneButton);
        oneButton.setOnClickListener(this);
        twoButton = findViewById(R.id.twoButton);
        twoButton.setOnClickListener(this);
        threeButton = findViewById(R.id.threeButton);
        threeButton.setOnClickListener(this);
        fourButton = findViewById(R.id.fourButton);
        fourButton.setOnClickListener(this);
        fiveButton = findViewById(R.id.fiveButton);
        fiveButton.setOnClickListener(this);
        sixButton = findViewById(R.id.sixButton);
        sixButton.setOnClickListener(this);
        sevenButton = findViewById(R.id.sevenButton);
        sevenButton.setOnClickListener(this);
        eightButton = findViewById(R.id.eightButton);
        eightButton.setOnClickListener(this);
        nineButton = findViewById(R.id.nineButton);
        nineButton.setOnClickListener(this);
        signButton = findViewById(R.id.signButton);
        signButton.setOnClickListener(this);
        plusButton = findViewById(R.id.plusButton);
        plusButton.setOnClickListener(this);
        minusButton = findViewById(R.id.minusButton);
        minusButton.setOnClickListener(this);
        decimalButton = findViewById(R.id.decimalButton);
        decimalButton.setOnClickListener(this);
        equalButton = findViewById(R.id.equalButton);
        equalButton.setOnClickListener(this);
        timesButton = findViewById(R.id.timesButton);
        timesButton.setOnClickListener(this);
        divideButton = findViewById(R.id.divideButton);
        divideButton.setOnClickListener(this);
        percentButton = findViewById(R.id.percentButton);
        percentButton.setOnClickListener(this);
        sqrtButton = findViewById(R.id.sqrtButton);
        sqrtButton.setOnClickListener(this);
        clearButton = findViewById(R.id.clearButton);
        clearButton.setOnClickListener(this);




        outputView=(TextView)findViewById(R.id.outputView);

    }
    @Override
    public void onClick(View view) {


        switch (view.getId()) {
            case R.id.zeroButton:
                s.append((zeroButton).getText().toString());
                outputView.setText(s.toString());
                break;
            case R.id.oneButton:

                s.append((oneButton).getText().toString());
                outputView.setText((s.toString()));
                break;
            case R.id.twoButton:

                s.append((twoButton).getText().toString());
                outputView.setText(s);
                break;
            case R.id.threeButton:

                s.append((threeButton).getText().toString());
                outputView.setText(s);
                break;
            case R.id.fourButton:
                s.append((fourButton).getText().toString());
                outputView.setText(s);
                break;
            case R.id.fiveButton:
                s.append((fiveButton).getText().toString());
                outputView.setText(s);
                break;
            case R.id.sixButton:
                s.append((sixButton).getText().toString());
                outputView.setText(s);
                break;
            case R.id.sevenButton:
                s.append((sevenButton).getText().toString());
                outputView.setText(s);
                break;
            case R.id.eightButton:
                s.append((eightButton).getText().toString());
                outputView.setText(s);
                break;
            case R.id.nineButton:
                s.append((nineButton).getText().toString());
                outputView.setText(s);
                break;
            case R.id.signButton:
                break;
            case R.id.plusButton:
                operation[0]="plus";
                var1=new BigDecimal(s.toString());
                s= new StringBuilder();
                break;
            case R.id.minusButton:
                operation[0]="minus";
                var1=new BigDecimal(s.toString());
                s= new StringBuilder();
                break;
            case R.id.timesButton:
                operation[0]="multiply";
                var1=new BigDecimal(s.toString());
                s= new StringBuilder();
                break;
            case R.id.divideButton:
                operation[0]="divide";
                var1=new BigDecimal(s.toString());
                s= new StringBuilder();
                break;
            case R.id.percentButton:
                operation[0]="percent";
                var1=new BigDecimal(s.toString());
                var2=new BigDecimal("100");
                String pOutput=((var1.divide(var2)).toString());
                outputView.setText(pOutput);
                s=new StringBuilder();
                break;
            case R.id.sqrtButton:
                operation[0]="sqrt";
                var1=new BigDecimal(s.toString());
                var2=new BigDecimal(Math.pow(var1.doubleValue(), .5));

                String sqrtOutput=((var2).toString());
                outputView.setText(sqrtOutput);

                s=new StringBuilder();
                break;

            case R.id.equalButton:
                String result= operation(operation,var1,s);
                outputView.setText(result);
                s=new StringBuilder();
                operation[0]=null;



        }
    }

    public String operation(String[] a, BigDecimal var1,StringBuilder s) {
        String answer;

        if (a[0] == "plus") {
            var2 = new BigDecimal(s.toString());
            answer = ((var1.add(var2)).toString());

        }
        else if (a[0] == "minus") {
            var2 = new BigDecimal(s.toString());
            answer = ((var1.subtract(var2)).toString());

        }
        else if (a[0] == "multiply") {
            var2 = new BigDecimal(s.toString());
            answer = ((var1.multiply(var2)).toString());

        }
        else if (a[0] == "divide") {
            var2 = new BigDecimal(s.toString());
            answer = ((var1.divide(var2)).toString());
        }
        else if (a[0] == "percent") {

            answer = var1.toString();
        }
        else{
            var2=new BigDecimal(Math.pow(var1.doubleValue(), .5));
            answer=var2.toString();
        }
        
        return answer;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
