package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scores;
    RadioGroup one;
    RadioGroup two;
    RadioGroup three;
    RadioGroup four;
    RadioGroup five;
    EditText six;
    CheckBox sevenA;
    CheckBox sevenB;
    CheckBox sevenC;
    CheckBox sevenD;
    CheckBox eightA;
    CheckBox eightB;
    CheckBox eightC;
    CheckBox eightD;
    CheckBox nineA;
    CheckBox nineB;
    CheckBox nineC;
    CheckBox nineD;
    EditText ten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.q1);
        two = findViewById(R.id.q2);
        three = findViewById(R.id.q3);
        four = findViewById(R.id.q4);
        five = findViewById(R.id.q5);
        six = findViewById(R.id.ansq6);
        sevenA = (CheckBox) findViewById(R.id.q_seven_a);
        sevenB = (CheckBox) findViewById(R.id.q_seven_b);
        sevenC = (CheckBox) findViewById(R.id.q_seven_c);
        sevenD = (CheckBox) findViewById(R.id.q_seven_d);
        eightA = (CheckBox) findViewById(R.id.q_eight_a);
        eightB = (CheckBox) findViewById(R.id.q_eight_b);
        eightC = (CheckBox) findViewById(R.id.q_eight_c);
        eightD = (CheckBox) findViewById(R.id.q_eight_d);
        nineA = (CheckBox) findViewById(R.id.q_nine_a);
        nineB = (CheckBox) findViewById(R.id.q_eight_b);
        nineC = (CheckBox) findViewById(R.id.q_eight_c);
        nineD = (CheckBox) findViewById(R.id.q_eight_d);
        ten = findViewById(R.id.asnqten);
        /*****************************************************/

    }

    public void submit(View view) {

        int totalScores = 16;

        checkAnswer();

        // Show Score
        if (scores == totalScores) {
            Toast.makeText(this, "You have answer all correctly   " + " Your Score: " + scores, Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "You have not answer all correctly" + " Your Score: " + scores, Toast.LENGTH_SHORT).show();
        }
        resetQuiz();
    }

    private void resetQuiz() {
        one.clearCheck();
        two.clearCheck();
        three.clearCheck();
        four.clearCheck();
        five.clearCheck();

        six.setText("");
        six.clearFocus();

        sevenA.setChecked(false);
        sevenB.setChecked(false);
        sevenC.setChecked(false);
        sevenD.setChecked(false);

        eightA.setChecked(false);
        eightB.setChecked(false);
        eightC.setChecked(false);
        eightD.setChecked(false);

        nineA.setChecked(false);
        nineB.setChecked(false);
        nineC.setChecked(false);
        nineD.setChecked(false);

        ten.setText("");
        ten.clearFocus();
    }

    public void checkAnswer() {
        scores = 0;

        if (one.getCheckedRadioButtonId() == R.id.radioBd) {
            increaseScore();
        }
        if (two.getCheckedRadioButtonId() == R.id.radio2d) {
            increaseScore();
        }
        if (three.getCheckedRadioButtonId() == R.id.radio3c) {
            increaseScore();
        }

        if (four.getCheckedRadioButtonId() == R.id.radio4a) {
            increaseScore();
        }

        if (five.getCheckedRadioButtonId() == R.id.radio5c) {
            increaseScore();
        }

        if (six.getText().toString().equalsIgnoreCase("4")) {
            increaseScore();
        }

        if (sevenA.isChecked() && !sevenB.isChecked() && !sevenC.isChecked() && !sevenD.isChecked()) {
            increaseScore();
        }

        if (!eightA.isChecked() && !eightB.isChecked() && !eightC.isChecked() && eightD.isChecked()) {
            increaseScore();
        }
        if (nineA.isChecked() && !nineA.isChecked() && nineA.isChecked() && nineA.isChecked()) {
            increaseScore();
        }
        if (ten.getText().toString().equalsIgnoreCase("2")) {
            increaseScore();
        }

    }

    public void increaseScore() {
        scores += 2;

    }

}