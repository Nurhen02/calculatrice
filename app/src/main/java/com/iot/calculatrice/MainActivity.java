package com.iot.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonplus, buttonmoins, buttondivise,
            buttonmultiple,  buttonC, buttonEqual, buttonpoint;
    EditText ed1;
    float Value1,Value2;
    boolean Addition, Subtract, Multiplication, Division ,decimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.btn0);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);
        button7 = (Button) findViewById(R.id.btn7);
        button8 = (Button) findViewById(R.id.btn8);
        button9 = (Button) findViewById(R.id.btn9);
        buttonplus = (Button) findViewById(R.id.btnplus);
        buttonmoins = (Button) findViewById(R.id.btnmoins);
        buttonmultiple = (Button) findViewById(R.id.btnmultiple);
        buttondivise = (Button) findViewById(R.id.btndivise);
        buttonC = (Button) findViewById(R.id.btnclear);
        buttonEqual = (Button) findViewById(R.id.btnegale);
        buttonpoint = (Button) findViewById(R.id.btnpoint);
        ed1 = (EditText) findViewById(R.id.edText1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {ed1.setText(ed1.getText()+"9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "0");
            }
        });
        buttonplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(ed1.getText() + "");
                Addition = true ;
                ed1.setText(null);
            }
        });
        buttondivise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(ed1.getText() + "");
                Division = true ;
                ed1.setText(null);
            }
        });

        buttonmultiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(ed1.getText() + "");
                Multiplication = true ;
                ed1.setText(null);
            }
        });
        buttonmoins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(ed1.getText() + "");
                Subtract = true ;
                ed1.setText(null);
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Addition || Subtract || Multiplication || Division ) {
                    Value2 = Float.parseFloat(ed1.getText() + "");
                }

                if (Addition) {

                    ed1.setText(Value1 + Value2 + "");
                    Addition = false;
                }

                if (Subtract) {

                    ed1.setText(Value1 - Value2 + "");
                    Subtract = false;
                }

                if (Multiplication) {
                    ed1.setText(Value1 * Value2 + "");
                    Multiplication = false;
                }

                if (Division) {
                    ed1.setText(Value1 / Value2 + "");
                    Division = false;
                }

            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
            }
        });
        buttonpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (decimal) {
                } else {
                    ed1.setText(ed1.getText() + ".");
                    decimal = true;
                }
            }
        });
            }
        }