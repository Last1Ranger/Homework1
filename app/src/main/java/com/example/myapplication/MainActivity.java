package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button btn;

    private EditText editText;

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        editText = findViewById(R.id.a);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str_value_a = editText.getText().toString();
                double a = Integer.parseInt(str_value_a);
                String str_value_b = editText.getText().toString();
                double b = Integer.parseInt(str_value_b);
                String str_value_c = editText.getText().toString();
                double c = Integer.parseInt(str_value_c);
                double d = b * b - 4 * a * c;
                if (d > 0){
                    double x = (-b + Math.sqrt(d))/ 2 * a;
                    double y = (-b - Math.sqrt(d))/ 2 * a;
                    textView.setText("" + x + " " + y);
                }
                if (d == 0){
                    double x = -b / 2 * a;
                    textView.setText(""+x);
                }
                if (d < 0){
                    textView.setText("Ошибка, отрицательный дискриминант!!!");
                }

            }
        });
    }
}
