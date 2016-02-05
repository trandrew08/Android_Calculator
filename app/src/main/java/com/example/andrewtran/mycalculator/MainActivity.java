package com.example.andrewtran.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b_1, b_2, b_3, b_4, b_5, b_6, b_7, b_8, b_9, b_0;
    Button b_plus;
    Button b_minus;
    Button b_multiply;
    Button b_divide;
    Button b_equal;
    Button b_clear;
    TextView result;

    String input = "", input2 = "", sign = "";
    //boolean plus, minus, multiply, divide,
    boolean div_by_zero = false;
    int op_num = 0;
    double t = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_0 = (Button) findViewById(R.id.button0);
        b_1 = (Button) findViewById(R.id.button);
        b_2 = (Button) findViewById(R.id.button2);
        b_3 = (Button) findViewById(R.id.button3);
        b_4 = (Button) findViewById(R.id.button4);
        b_5 = (Button) findViewById(R.id.button5);
        b_6 = (Button) findViewById(R.id.button6);
        b_7 = (Button) findViewById(R.id.button7);
        b_8 = (Button) findViewById(R.id.button8);
        b_9 = (Button) findViewById(R.id.button9);
        b_plus = (Button) findViewById(R.id.button_plus);
        b_minus = (Button) findViewById(R.id.button_minus);
        b_multiply = (Button) findViewById(R.id.button_multiply);
        b_divide = (Button) findViewById(R.id.button_div);
        b_equal = (Button) findViewById(R.id.button_equal);
        b_clear = (Button) findViewById(R.id.clear);

        result = (TextView) findViewById(R.id.textView);

        eventListener();
    }

    private void eventListener(){
        b_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op_num == 0) {
                    input += "0";
                    result.setText(input);
                }
                else {
                    input2 += "0";
                    result.setText(input+sign+input2);
                }
            }
        });

        b_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op_num == 0) {
                    input += "1";
                    result.setText(input);
                }
                else {
                    input2 += "1";
                    result.setText(input+sign+input2);
                }
            }
        });

        b_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op_num == 0) {
                    input += "2";
                    result.setText(input);
                }
                else {
                    input2 += "2";
                    result.setText(input+sign+input2);
                }
            }
        });

        b_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op_num == 0) {
                    input += "3";
                    result.setText(input);
                }
                else {
                    input2 += "3";
                    result.setText(input+sign+input2);
                }
            }
        });

        b_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op_num == 0) {
                    input += "4";
                    result.setText(input);
                }
                else {
                    input2 += "4";
                    result.setText(input+sign+input2);
                }
            }
        });

        b_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op_num == 0) {
                    input += "5";
                    result.setText(input);
                }
                else {
                    input2 += "5";
                    result.setText(input+sign+input2);
                }
            }
        });

        b_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op_num == 0) {
                    input += "6";
                    result.setText(input);
                }
                else {
                    input2 += "6";
                    result.setText(input+sign+input2);
                }
            }
        });

        b_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op_num == 0) {
                    input += "7";
                    result.setText(input);
                }
                else {
                    input2 += "7";
                    result.setText(input+sign+input2);
                }
            }
        });

        b_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op_num == 0) {
                    input += "8";
                    result.setText(input);
                }
                else {
                    input2 += "8";
                    result.setText(input+sign+input2);
                }
            }
        });

        b_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op_num == 0) {
                    input += "9";
                    result.setText(input);
                }
                else {
                    input2 += "9";
                    result.setText(input+sign+input2);
                }
            }
        });

        b_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //plus = true;
                if (op_num == 0) {
                    sign = "+";
                    op_num = 1;
                    result.setText(input+sign);
                }
                else{
                    t = calculationStart(input, input2,1);
                    result.setText(Double.toString(t));
                    input = Double.toString(t);
                    input2 = "";
                }
            }
        });

        b_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //minus = true;
                if (op_num == 0) {

                    sign = "-";
                    op_num = 2;
                    result.setText(input+sign);
                }
                else{
                    t = calculationStart(input, input2,2);
                    result.setText(Double.toString(t));
                    input = Double.toString(t);
                    input2 = "";
                }
            }
        });

        b_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //multiply = true;
                if (op_num == 0) {
                    sign = "*";
                    op_num = 3;
                    result.setText(input+sign);
                }
                else{
                    t = calculationStart(input, input2,3);
                    result.setText(Double.toString(t));
                    input = Double.toString(t);
                    input2 = "";
                }
            }
        });

        b_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //divide = true;
                if (op_num == 0) {
                    sign = "÷";
                    op_num = 4;
                    result.setText(input+sign);
                }
                else{
                    t = calculationStart(input, input2, 4);
                    result.setText(Double.toString(t));
                    input = Double.toString(t);
                    input2 = "";
                }
            }
        });

        b_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t = calculationStart(input, input2,op_num);
                if (!div_by_zero) {
                    op_num = 0;
                    result.setText(Double.toString(t));
                    input = "";
                    input2 = "";
                }
                else{
                    result.setText("Can't divide by 0");
                    div_by_zero = false;
                }
            }
        });

        b_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op_num = 0;
                result.setText("0");
                input = "";
                input2 = "";
            }
        });
    }

    private double calculationStart(String inp1, String inp2, int c){
        double res = -25;
        try {
            double a = Double.parseDouble(inp1);
            double b = Double.parseDouble(inp2);
            switch(c){
                case 1:
                    res = a + b;
                    break;
                case 2:
                    res = a - b;
                    break;
                case 3:
                    res = a * b;
                    break;
                case 4:
                    if (b != 0){
                        res = a / b;
                    }
                    else{
                        div_by_zero = true;
                    }
                    break;
                default:
                    return 0;
            }
        }
        catch (NumberFormatException e){
            result.setText("0");
        }
        return res;
    }
}
