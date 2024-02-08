package com.example.myfirstapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    Button buttonAdd,buttonSub,buttonmul,buttondiv ;
    EditText editTextN1,editTextN2 ;
    TextView textView;
    int num1,num2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonAdd = findViewById(R.id.btn_add);
        buttonSub = findViewById(R.id.btn_sub);
        buttonmul = findViewById(R.id.btn_mul);
        buttondiv = findViewById(R.id.btn_div);
        editTextN1 = findViewById(R.id.number1);
        editTextN2 = findViewById(R.id.number2);
        textView = findViewById(R.id.answer);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                num1 = getIntFromEditText(editTextN1);
                num2 = getIntFromEditText(editTextN2);
                int sum=num1+num2;
                textView.setText(sum+" ");
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    num1 = getIntFromEditText(editTextN1);
                    num2 = getIntFromEditText(editTextN2);
                    int sub = num1-num2;
                    textView.setText(sub+ " ");
            }
        });
        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = getIntFromEditText(editTextN1);
                num2 = getIntFromEditText(editTextN2);
                int mul = num1*num2;
                textView.setText(mul+ " ");
            }
        });
        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = getIntFromEditText(editTextN1);
                num2 = getIntFromEditText(editTextN2);
                int div = num1/num2;
                textView.setText(div+ " ");
            }
        });

    }

    public int getIntFromEditText(EditText editText){
        if (editText.getText().toString().equals("")){
            Toast.makeText( this ,"Enter number ",Toast.LENGTH_SHORT).show();
            return 0 ;
        }else
            return Integer.parseInt(editText.getText().toString());

    }




}