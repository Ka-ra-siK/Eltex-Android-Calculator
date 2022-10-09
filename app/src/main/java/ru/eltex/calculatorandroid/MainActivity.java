package ru.eltex.calculatorandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Float firstNum = Float.valueOf(0);
    Float secondNum = Float.valueOf(0);
    String lastOperation = "=";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculatingMethod();
    }

    void calculatingMethod() {
        DecimalFormat format = new DecimalFormat();
        format.setDecimalSeparatorAlwaysShown(false);
        Button btnOne = (Button) findViewById(R.id.btn_1);
        Button btnTwo = (Button) findViewById(R.id.btn_2);
        Button btnThree = (Button) findViewById(R.id.btn_3);
        Button btnFour = (Button) findViewById(R.id.btn_4);
        Button btnFive = (Button) findViewById(R.id.btn_5);
        Button btnSix = (Button) findViewById(R.id.btn_6);
        Button btnSeven = (Button) findViewById(R.id.btn_7);
        Button btnEight = (Button) findViewById(R.id.btn_8);
        Button btnNine = (Button) findViewById(R.id.btn_9);
        Button btnZero = (Button) findViewById(R.id.btn_0);
        Button btnClear = (Button) findViewById(R.id.btn_clean);
        Button btnDelete = (Button) findViewById(R.id.btn_del);
        Button btnDivide = (Button) findViewById(R.id.btn_divide);
        Button btnMultiply = (Button) findViewById(R.id.btn_multiply);
        Button btnPlus = (Button) findViewById(R.id.btn_plus);
        Button btnMinus = (Button) findViewById(R.id.btn_minus);
        Button btnEqual = (Button) findViewById(R.id.btn_equal);
        Button btnPoint = (Button) findViewById(R.id.btn_point);
        TextView out = (TextView) findViewById(R.id.output);
        TextView operationView = (TextView) findViewById(R.id.operation_view);
        btnOne.setOnClickListener((View view) -> {
            //((TextView) findViewById(R.id.output)).setText("1");
            out.setText(out.getText() + "1");
        });

        btnTwo.setOnClickListener((view) -> {
            out.setText(out.getText() + "2");
        });

        btnThree.setOnClickListener((view) -> {
            out.setText(out.getText() + "3");
        });

        btnFour.setOnClickListener((view) -> {
            out.setText(out.getText() + "4");
        });

        btnFive.setOnClickListener((view) -> {
            out.setText(out.getText() + "5");
        });

        btnSix.setOnClickListener((view) -> {
            out.setText(out.getText() + "6");
        });

        btnSeven.setOnClickListener((view) -> {
            out.setText(out.getText() + "7");
        });

        btnEight.setOnClickListener((view) -> {
            out.setText(out.getText() + "8");
        });

        btnNine.setOnClickListener((view) -> {
            out.setText(out.getText() + "9");
        });

        btnZero.setOnClickListener((view) -> {
            out.setText(out.getText() + "0");
        });

        btnPoint.setOnClickListener((view) -> {
            if (out.getText() != "") {
                out.setText(out.getText() + ".");
            } else {
                out.setText(out.getText() + "0.");
            }
        });

        //Button of sign Plus
        btnPlus.setOnClickListener((view) -> {
            if (String.valueOf(out.getText()) != "") {
                firstNum = Float.valueOf(String.valueOf(out.getText()));
                lastOperation = "+";
                operationView.setText(operationView.getText() + String.valueOf(firstNum) + "+");
                out.setText("");
            }

        });
        //Button of sign Minus
        btnMinus.setOnClickListener((view) -> {
            if (String.valueOf(out.getText()) != "") {
                firstNum = Float.valueOf(String.valueOf(out.getText()));
                lastOperation = "-";
                operationView.setText(operationView.getText() + String.valueOf(firstNum) + "-");
                out.setText("");
            }
        });

        //Button of sign Multiply
        btnMultiply.setOnClickListener((view) -> {
            if (String.valueOf(out.getText()) != "") {
                firstNum = Float.valueOf(String.valueOf(out.getText()));
                lastOperation = "*";
                operationView.setText(operationView.getText() + String.valueOf(firstNum) + "*");
                out.setText("");
            }
        });

        //Button of sign Divide
        btnDivide.setOnClickListener((view) -> {
            if (String.valueOf(out.getText()) != "") {
                firstNum = Float.valueOf(String.valueOf(out.getText()));
                lastOperation = "/";
                operationView.setText(operationView.getText() + String.valueOf(firstNum) + "/");
                out.setText("");
            }
        });

        btnEqual.setOnClickListener((view) -> {
            if (String.valueOf(out.getText()) != "") {
                secondNum = Float.valueOf(String.valueOf(out.getText()));
                switch (lastOperation) {
                    case "+":
                        out.setText(String.valueOf(firstNum + secondNum));
                        //Remove the decimal point
                        out.setText(format.format(Float.valueOf(String.valueOf(out.getText()))));
                        operationView.setText("");
                        lastOperation = "=";
                        break;
                    case "-":
                        out.setText(String.valueOf(firstNum - secondNum));
                        //Remove the decimal point
                        out.setText(format.format(Float.valueOf(String.valueOf(out.getText()))));
                        operationView.setText("");
                        lastOperation = "=";
                        break;
                    case "*":
                        out.setText(String.valueOf(firstNum * secondNum));
                        //Remove the decimal point
                        out.setText(format.format(Float.valueOf(String.valueOf(out.getText()))));
                        operationView.setText("");
                        lastOperation = "=";
                        break;
                    case "/":
                        //Dividing by zero
                        if (secondNum != 0) {
                            out.setText(String.valueOf(firstNum / secondNum));
                            //Remove the decimal point
                            out.setText(format.format(Float.valueOf(String.valueOf(out.getText()))));
                            operationView.setText("");
                        } else {
                            out.setText("");
                            operationView.setText("Error!");
                        }
                        lastOperation = "=";
                        break;
                }
            }
        });

        //Delete symbol
        btnDelete.setOnClickListener((view) -> {
            out.setText(removeLastChar(String.valueOf(out.getText())));
        });

        //Clear all
        btnClear.setOnClickListener((view) -> {
            out.setText("");
            operationView.setText("");
        });
    }

    public static String removeLastChar(String s) {
        return (s == null || s.length() == 0) ? null : (s.substring(0, s.length() - 1));
    }

}