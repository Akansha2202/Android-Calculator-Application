package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, buttonC, buttonEqual;
    EditText crunchifyEditText;

    float mValueOne, mValueTwo;
    boolean checkAdd,checkSub,checkMul,checkDiv;

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

        buttonAdd = (Button) findViewById(R.id.btnplus);
        buttonSub = (Button) findViewById(R.id.btnminus);
        buttonMul = (Button) findViewById(R.id.btnmul);
        buttonDivision = (Button) findViewById(R.id.btndiv);

        buttonC = (Button) findViewById(R.id.clear);
        buttonEqual = (Button) findViewById(R.id.btneq);

        //etVar=(EditText) findViewById(R.id.etvar);
        crunchifyEditText = (EditText) findViewById(R.id.etvar);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "0");
            }
        });


        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (crunchifyEditText == null) {
                    crunchifyEditText.setText("");
                } else {
                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                    checkAdd = true;
                    crunchifyEditText.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                checkSub = true;
                crunchifyEditText.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                checkMul = true;
                crunchifyEditText.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                checkDiv = true;
                crunchifyEditText.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(crunchifyEditText.getText() + "");

                if (checkAdd == true) {
                    crunchifyEditText.setText(mValueOne + mValueTwo + "");
                    checkAdd = false;
                }

                if (checkSub == true) {
                    crunchifyEditText.setText(mValueOne - mValueTwo + "");
                    checkSub = false;
                }

                if (checkMul == true) {
                    crunchifyEditText.setText(mValueOne * mValueTwo + "");
                    checkMul = false;
                }

                if (checkDiv == true) {
                    crunchifyEditText.setText(mValueOne / mValueTwo + "");
                    checkDiv = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText("");
            }
        });



    }
}
