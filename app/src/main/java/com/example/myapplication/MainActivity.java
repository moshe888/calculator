package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    int num1 = 0;
    int num2 = 0;
    int equal = 0;
    String type = null;
    String current_value = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
    }

    public void funcButten_number(View view) {
        Button b = (Button) view;
        String str = b.getText().toString();
         if(num1 == 0){
            textView.setText(" ");

            textView.append(str);

            num1 = Integer.parseInt(str);
        }
        else {
            textView.append(str);
            num2 = Integer.parseInt(str);
        }
    }
public void funcButten_calculation(View view){
    Button b = (Button) view;
    String str = b.getText().toString();
    textView.append(str);
   if(str.equals("+") )
        type = "plus";
   if(str.equals("-"))
       type = "minus";

    }



    public void equal(View view) {
        if(type == "plus")
        equal = num1 + num2;
       else if(type == "minus")
            equal = num1 - num2;
        Button b = (Button) view;
        String str = b.getText().toString();
             textView.append(str + equal);
            num1 = 0;
        num2 = 0;

    }

    public void divide(View view) {

    }

    public void funcDouble(View view) {
    }

    public void funcAc(View view) {
        textView.setText(" ");

    }
}