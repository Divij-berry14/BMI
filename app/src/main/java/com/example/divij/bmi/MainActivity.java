package com.example.divij.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText weight, height;
    private TextView txt4;
    private Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight = (EditText) findViewById(R.id.et1);
        height = (EditText) findViewById(R.id.et2);
        txt4 = (TextView) findViewById(R.id.txt4);
        bt1 = (Button) findViewById((R.id.btn1));
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bmi();
            }
        });

    }

    private void bmi()
    {
        float a,b,c;
        a=Float.parseFloat(height.getText().toString())/100;
        b=Float.parseFloat(weight.getText().toString());
        c=b/(a*a);
        if(c<=18.8){
            txt4.setText("You are underwieght!\n" +c);
        }
        if(c>=18.8 && c<=25)
        {
            txt4.setText("You are normal!\n" +c);
        }
        if(c>=25)
        {
            txt4.setText("You are overweight!\n" +c);
        }
    }
}
