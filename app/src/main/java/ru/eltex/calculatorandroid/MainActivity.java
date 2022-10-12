package ru.eltex.calculatorandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

/**
 * A class that implements the operation of a simple calculator on Android
 */
public class MainActivity extends AppCompatActivity {

    Float firstNum = Float.valueOf(0);
    Float secondNum = Float.valueOf(0);
    String lastOperation = "=";


    /**
     * First method from which the Activity execution starts
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TEST_DEBUG_ON_CREATE", "onCreate() method call");
        calculating();
    }


    /**
     * The method prepares for the output of activity to the device screen
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TEST_DEBUG_ON_START", "onStart() method call");
    }

    /**
     * Called after your activity has been stopped, prior to it being started again
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TEST_DEBUG_ON_RESTART", "onRestart() method call");
    }


    /**
     * Called when the activity will start interacting with the user
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TEST_DEBUG_ON_RESUME", "onResume() method call");
    }

    /**
     * Called when the activity loses foreground state,
     * is no longer focusable or before transition to stopped/hidden or destroyed state
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TEST_DEBUG_ON_PAUSE", "onPause() method call");
    }

    /**
     * Called when the activity is no longer visible to the user
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TEST_DEBUG_ON_STOP", "onStop() method call");
    }

    /**
     * Activity is shutting down
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TEST_DEBUG_ON_DESTROY", "onDestroy() method call");
    }

    /**
     * Method for the operation of the calculator buttons
     *
     * @param
     * @return
     */
    void calculating() {
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
        Log.d("TEST_DEBUG_CALC_FUN", "Calculating() method call");
        btnOne.setOnClickListener((View view) -> {
            out.setText(out.getText() + "1");
            Log.d("TEST_DEBUG_CALC_1", "Set number 1");
        });

        btnTwo.setOnClickListener((view) -> {
            out.setText(out.getText() + "2");
            Log.d("TEST_DEBUG_CALC_2", "Set number 2");
        });

        btnThree.setOnClickListener((view) -> {
            out.setText(out.getText() + "3");
            Log.d("TEST_DEBUG_CALC_3", "Set number 3");
        });

        btnFour.setOnClickListener((view) -> {
            out.setText(out.getText() + "4");
            Log.d("TEST_DEBUG_CALC_4", "Set number 4");
        });

        btnFive.setOnClickListener((view) -> {
            out.setText(out.getText() + "5");
            Log.d("TEST_DEBUG_CALC_5", "Set number 5");
        });

        btnSix.setOnClickListener((view) -> {
            out.setText(out.getText() + "6");
            Log.d("TEST_DEBUG_CALC_6", "Set number 6");
        });

        btnSeven.setOnClickListener((view) -> {
            out.setText(out.getText() + "7");
            Log.d("TEST_DEBUG_CALC_7", "Set number 7");
        });

        btnEight.setOnClickListener((view) -> {
            out.setText(out.getText() + "8");
            Log.d("TEST_DEBUG_CALC_8", "Set number 8");
        });

        btnNine.setOnClickListener((view) -> {
            out.setText(out.getText() + "9");
            Log.d("TEST_DEBUG_CALC_9", "Set number 9");
        });

        btnZero.setOnClickListener((view) -> {
            out.setText(out.getText() + "0");
            Log.d("TEST_DEBUG_CALC_0", "Set number 0");
        });

        btnPoint.setOnClickListener((view) -> {
            if (out.getText() != "") {
                out.setText(out.getText() + ".");
            } else {
                out.setText(out.getText() + "0.");
            }
            Log.d("TEST_DEBUG_CALC_POINT", "Set point");
        });

        //Button of sign Plus
        btnPlus.setOnClickListener((view) -> {
            if (String.valueOf(out.getText()) != "") {
                firstNum = Float.valueOf(String.valueOf(out.getText()));
                lastOperation = "+";
                operationView.setText(operationView.getText() + String.valueOf(firstNum));
                operationView.setText(format.format(Float.valueOf(String.valueOf(operationView.getText()))));
                operationView.setText(operationView.getText() + "+");
                out.setText("");
                Log.d("TEST_DEBUG_CALC_PLUS", "Set an addition operation");
            }

        });
        //Button of sign Minus
        btnMinus.setOnClickListener((view) -> {
            if (String.valueOf(out.getText()) != "") {
                firstNum = Float.valueOf(String.valueOf(out.getText()));
                lastOperation = "-";
                operationView.setText(operationView.getText() + String.valueOf(firstNum));
                operationView.setText(format.format(Float.valueOf(String.valueOf(operationView.getText()))));
                operationView.setText(operationView.getText() + "-");
                out.setText("");
                Log.d("TEST_DEBUG_CALC_MINUS", "Set a subtraction operation");
            }
        });

        //Button of sign Multiply
        btnMultiply.setOnClickListener((view) -> {
            if (String.valueOf(out.getText()) != "") {
                firstNum = Float.valueOf(String.valueOf(out.getText()));
                lastOperation = "*";
                operationView.setText(operationView.getText() + String.valueOf(firstNum));
                operationView.setText(format.format(Float.valueOf(String.valueOf(operationView.getText()))));
                operationView.setText(operationView.getText() + "*");
                out.setText("");
                Log.d("TEST_DEBUG_CALC_MULTI", "Set the multiplication operation");
            }
        });

        //Button of sign Divide
        btnDivide.setOnClickListener((view) -> {
            if (String.valueOf(out.getText()) != "") {
                firstNum = Float.valueOf(String.valueOf(out.getText()));
                lastOperation = "/";
                operationView.setText(operationView.getText() + String.valueOf(firstNum));
                operationView.setText(format.format(Float.valueOf(String.valueOf(operationView.getText()))));
                operationView.setText(operationView.getText() + "/");
                out.setText("");
                Log.d("TEST_DEBUG_CALC_DIV", "Set a division operation");
            }
        });

        //Checking which operation needs to be performed
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
                        Log.d("TEST_DEBUG_CALC_PLUS", "Performing an addition operation");
                        break;
                    case "-":
                        out.setText(String.valueOf(firstNum - secondNum));
                        //Remove the decimal point
                        out.setText(format.format(Float.valueOf(String.valueOf(out.getText()))));
                        operationView.setText("");
                        lastOperation = "=";
                        Log.d("TEST_DEBUG_CALC_MINUS", "Performing a subtraction operation");
                        break;
                    case "*":
                        out.setText(String.valueOf(firstNum * secondNum));
                        //Remove the decimal point
                        out.setText(format.format(Float.valueOf(String.valueOf(out.getText()))));
                        operationView.setText("");
                        lastOperation = "=";
                        Log.d("TEST_DEBUG_CALC_MULTI", "Performing the multiplication operation");
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
                            Log.e("TEST_DEBUG_CALC_DIV", "Division by 0");
                        }
                        lastOperation = "=";
                        Log.d("TEST_DEBUG_CALC_DIV", "Performing a division operation");
                        break;
                }
            }
        });

        //Delete symbol
        btnDelete.setOnClickListener((view) -> {
            out.setText(removeLastChar(String.valueOf(out.getText())));
            Log.d("TEST_DEBUG_CALC_DEL", "Deleting the last character");
        });

        //Clear all
        btnClear.setOnClickListener((view) -> {
            out.setText("");
            operationView.setText("");
            Log.d("TEST_DEBUG_CALC_CLEAN", "Log.d(\"TEST_DEBUG_CALC_DEL\", \"Deleting the last character\");");
        });
    }

    /**
     * Method for deleting the last character of string
     * @param str string to be shortened
     * @return string without the last character
     */
    public static String removeLastChar(String str) {
        return (str == null || str.length() == 0) ? null : (str.substring(0, str.length() - 1));
    }

}