package com.example.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, reset;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int flag = 0, count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        inapt();
        reset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                bt1.setText("");
                bt2.setText("");
                bt3.setText("");
                bt4.setText("");
                bt5.setText("");
                bt6.setText("");
                bt7.setText("");
                bt8.setText("");
                bt9.setText("");
                flag = 0;
                count = 0;
            }
        });
    }
    public void inapt() {
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);
        bt7 = findViewById(R.id.bt7);
        bt8 = findViewById(R.id.bt8);
        bt9 = findViewById(R.id.bt9);
        reset = findViewById(R.id.reset);
    }

    public void Check(View vi) {
        Button btCurrent;
        btCurrent = (Button) vi;
        if(btCurrent.getText().toString().equals("")){

        count++;
        if (flag == 0) {
            btCurrent.setText("x");
            flag = 1;
        } else {
            btCurrent.setText("o");
            flag = 0;
        }

        if (count > 4) {
            b1 = bt1.getText().toString();
            b2 = bt2.getText().toString();
            b3 = bt3.getText().toString();
            b4 = bt4.getText().toString();
            b5 = bt5.getText().toString();
            b6 = bt6.getText().toString();
            b7 = bt7.getText().toString();
            b8 = bt8.getText().toString();
            b9 = bt9.getText().toString();
        }
        if(count>4){
        if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")){
            Toast.makeText(this, "Winner is: " + b1, Toast.LENGTH_SHORT).show();
        } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
            Toast.makeText(this, "Winner is: " + b4, Toast.LENGTH_SHORT).show();
        } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
            Toast.makeText(this, "Winner is: " + b7, Toast.LENGTH_SHORT).show();
        } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
            Toast.makeText(this, "Winner is: " + b1, Toast.LENGTH_SHORT).show();
        } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
            Toast.makeText(this, "Winner is: " + b2, Toast.LENGTH_SHORT).show();
        } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
            Toast.makeText(this, "Winner is: " + b3, Toast.LENGTH_SHORT).show();
        } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
            Toast.makeText(this, "Winner is: " + b1, Toast.LENGTH_SHORT).show();
        } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
            Toast.makeText(this, "Winner is: " + b3, Toast.LENGTH_SHORT).show();
        }}}
    }
}