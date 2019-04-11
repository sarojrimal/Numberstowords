package com.example.numberstowords;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn11;
    private EditText text;
    private TextView txt_output;
    public boolean validate(){
        boolean checkvalidate=true;
        if (TextUtils.isEmpty(text.getText().toString())) {
            text.setError("Number is required");
            text.requestFocus();
            checkvalidate = false;

        }


        return  checkvalidate;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.text);

        txt_output=findViewById(R.id.txt_output);
        btn11=findViewById(R.id.btn11);

        btn11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(validate()) {
                    int num1 = Integer.parseInt(text.getText().toString());
                    String return_val_in_english = NumbersToWords.convert(num1);


                    txt_output.setText(num1 + " In Word: " + return_val_in_english);

                }



            }
        });


    }


}
