package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.nio.charset.StandardCharsets;

public class MainActivity<textView> extends AppCompatActivity {
    Button c,par,parc,div,mult,plus,minus,eq,fac,vir,zero,one,two,three,four,five,six,seven,eight,nine;
    TextView result,operandDisplay;
    EditText newNumber;

    private Double operand1 = null;
    private Double operand2 = null;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView) findViewById(R.id.result);
        newNumber = (EditText) findViewById(R.id.editTextNumberDecimal);
        operandDisplay = (TextView) findViewById(R.id.text_operand);

        c=(Button)findViewById(R.id.btn_c);
        par=(Button)findViewById(R.id.btn_par);
        parc=(Button)findViewById(R.id.btn_parc);
        div=(Button)findViewById(R.id.btn_div);
        mult=(Button)findViewById(R.id.btn_mult);
        plus=(Button)findViewById(R.id.btn_plus);
        minus=(Button)findViewById(R.id.btn_minus);
        eq=(Button)findViewById(R.id.btn_eq);
        fac=(Button)findViewById(R.id.btn_fac);
        vir=(Button)findViewById(R.id.btn_vir);
        zero=(Button)findViewById(R.id.btn_zero);
        one=(Button)findViewById(R.id.btn_one);
        two=(Button)findViewById(R.id.btn_two);
        three=(Button)findViewById(R.id.btn_three);
        four=(Button)findViewById(R.id.btn_four);
        five=(Button)findViewById(R.id.btn_five);
        six=(Button)findViewById(R.id.btn_six);
        seven=(Button)findViewById(R.id.btn_seven);
        eight=(Button)findViewById(R.id.btn_eight);
        nine=(Button)findViewById(R.id.btn_nine);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button = (Button) view;
                newNumber.append(button.getText().toString());
            }
        };

        zero.setOnClickListener(listener);
        one.setOnClickListener(listener);
        two.setOnClickListener(listener);
        three.setOnClickListener(listener);
        four.setOnClickListener(listener);
        five.setOnClickListener(listener);
        six.setOnClickListener(listener);
        seven.setOnClickListener(listener);
        eight.setOnClickListener(listener);
        nine.setOnClickListener(listener);
        vir.setOnClickListener(listener);

        View.OnClickListener operationListener = new View.OnClickListener() {
            public void onClick(View view) {
                Button button = (Button) view;
                String op = button.getText().toString();
                String value = newNumber.getText().toString();
                try {
                    Double dValue = Double.valueOf(value);
                    //performOperation(dValue, op);
                } catch (NumberFormatException e) {
                    Log.d("---------", "sayı dönüşüm hatası");
                    newNumber.setText("");
                }
                //to do:sonuç göster

            }
        };
        div.setOnClickListener(operationListener);
        mult.setOnClickListener(operationListener);
        plus.setOnClickListener(operationListener);
        minus.setOnClickListener(listener);
        eq.setOnClickListener(operationListener);

    }

}
