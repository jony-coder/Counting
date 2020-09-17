package com.example.counting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView result;
    private ImageButton plus, minus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView)findViewById(R.id.result);
        plus = (ImageButton)findViewById(R.id.imageButtonPlus);
        minus = (ImageButton)findViewById(R.id.imageButtonMinus);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String count = result.getText().toString();
                int n = Integer.parseInt(count);
                n = n+1;
                result.setText(""+n);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String count = result.getText().toString();
                int I = 0;
                int n = Integer.parseInt(count);
                I = Integer.parseInt(count);
                n = n-1;
                result.setText(""+n);
                if(n==-1){
                    result.setText(""+I);
                }

            }
        });

    }
}