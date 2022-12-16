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
    String str_num = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
    }

    public void funcButten_number(View view) {
        current_value="";
        Button b = (Button) view;

//        if (current_value.equals(str_num))
//        current_value =str_num;
         if((num1 == 0 || str_num != "") && num2 == 0){
            textView.setText(" ");
             str_num += b.getText().toString();
            textView.setText(str_num);

            num1 = Integer.parseInt(str_num);
        }
        else {
             str_num += b.getText().toString();

            textView.append(b.getText().toString());
            num2 = Integer.parseInt(str_num);
        }
    }
public void funcButten_calc(View view){
    str_num = "";
        try {

            Button b = (Button) view;

            String str = b.getText().toString();
            Exception expation = new Exception();
            if (current_value.equals(str))
                throw(expation.getCause());
            current_value = str;
            textView.append(str);
            if (str.equals("+"))
                type = "plus";
           else if (str.equals("-"))
                type = "minus";
           else if (str.equals("/"))
                type = "divide";
          else  if (str.equals("*"))
                type = "double";

        } catch (Throwable e) {
            e.printStackTrace();
        }

}



    public void equal(View view) {
        current_value="";
        str_num = "";
        if(type.equals("plus"))
        equal = num1 + num2;
       else if(type.equals("minus"))
            equal = num1 - num2;
       else if (type.equals("divide"))
           equal = (num1/num2);
       else if (type.equals("double"))
            equal = (num1*num2);
        Button b = (Button) view;
        String str = b.getText().toString();
             textView.append(str + equal);
            num1 = 0;
        num2 = 0;

    }



    public void funcAc(View view) {
        str_num = "";
        textView.setText("0");

    }
}