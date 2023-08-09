package com.example.bscscalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextFirstNumber, editTextSecondNumber, editTextOperator;
    private Button buttonAdd, buttonMultiply, buttonSubtract, buttonDivide, buttonRefresh, buttonEquals;
    private TextView textViewAnswer, operatorsView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing UI Views and Buttons
        editTextFirstNumber = findViewById(R.id.editTextFirstNumber);
        editTextSecondNumber = findViewById(R.id.editTextSecondNumber);
        editTextOperator = findViewById(R.id.editTextOperator);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonSubtract = findViewById(R.id.buttonSubtract);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonRefresh = findViewById(R.id.buttonRefresh);
        buttonEquals = findViewById(R.id.buttonEquals);
        textViewAnswer = findViewById(R.id.editTextAnswer);
        operatorsView = findViewById(R.id.editTextOperator);

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);
        Button btn0 = findViewById(R.id.btn0);

        // Setting click listeners for the number buttons (0-9)
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextOperator.getText().toString().isEmpty()) {
                    editTextFirstNumber.append("1");
                } else {
                    editTextSecondNumber.append("1");
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextOperator.getText().toString().isEmpty()) {
                    editTextFirstNumber.append("2");
                } else {
                    editTextSecondNumber.append("2");
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextOperator.getText().toString().isEmpty()) {
                    editTextFirstNumber.append("3");
                } else {
                    editTextSecondNumber.append("3");
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextOperator.getText().toString().isEmpty()) {
                    editTextFirstNumber.append("4");
                } else {
                    editTextSecondNumber.append("4");
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextOperator.getText().toString().isEmpty()) {
                    editTextFirstNumber.append("5");
                } else {
                    editTextSecondNumber.append("5");
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextOperator.getText().toString().isEmpty()) {
                    editTextFirstNumber.append("6");
                } else {
                    editTextSecondNumber.append("6");
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextOperator.getText().toString().isEmpty()) {
                    editTextFirstNumber.append("7");
                } else {
                    editTextSecondNumber.append("7");
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextOperator.getText().toString().isEmpty()) {
                    editTextFirstNumber.append("8");
                } else {
                    editTextSecondNumber.append("8");
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextOperator.getText().toString().isEmpty()) {
                    editTextFirstNumber.append("9");
                } else {
                    editTextSecondNumber.append("9");
                }
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextOperator.getText().toString().isEmpty()) {
                    editTextFirstNumber.append("0");
                } else {
                    editTextSecondNumber.append("0");
                }
            }
        });

        // Set click listeners for operation buttons
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOperator("+");
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOperator("*");
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOperator("-");
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOperator("/");
            }
        });

        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performCalculation();
            }
        });

        buttonRefresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextFirstNumber.setText("");
                editTextSecondNumber.setText("");
                editTextOperator.setText("");
                textViewAnswer.setText("");
                operatorsView.setText("");
            }
        });
    }

    private void setOperator(String operator) {
        editTextOperator.setText(operator);
        operatorsView.setText(operator);
    }

    private void performCalculation() {
        String strFirstNumber = editTextFirstNumber.getText().toString();
        String strSecondNumber = editTextSecondNumber.getText().toString();
        String operator = editTextOperator.getText().toString();

        if (strFirstNumber.isEmpty() || strSecondNumber.isEmpty() || operator.isEmpty()) {
            textViewAnswer.setText("Enter valid numbers and operator");
            return;
        }

        int firstNumber = Integer.parseInt(strFirstNumber);
        int secondNumber = Integer.parseInt(strSecondNumber);

        int result = 0;

        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    textViewAnswer.setText("Cannot divide by zero");
                    return;
                }
                break;
        }

        textViewAnswer.setText(String.valueOf(result));
    }
}
