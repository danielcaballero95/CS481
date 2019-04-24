package com.example.fitbud;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;


public class MainActivity extends Activity {
    Button login, cancel, signup;
    EditText name, pass;

    TextView tx1;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logonsplash);

        login = (Button) findViewById(R.id.loginButt);
        name = (EditText) findViewById(R.id.editText);
        pass = (EditText) findViewById(R.id.editText2);

        cancel = (Button) findViewById(R.id.cancelButt);
        signup = (Button) findViewById(R.id.accountButt);
        //tx1 = (TextView)findViewById(R.id.textView3);
        //tx1.setVisibility(View.GONE);

        login.setOnClickListener(new View.OnClickListener());}



        @Override
        public void onClick(View view){
            if (name.getText().toString().equals("user") &&
                    pass.getText().toString().equals("user")) {
                Toast.makeText(getApplicationContext(),
                        "Redirecting...", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();

                //tx1.setVisibility(View.VISIBLE);
                //tx1.setBackgroundColor(Color.RED);
                //counter--;
                //tx1.setText(Integer.toString(counter));

                if (counter == 0) {
                    login.setEnabled(false);
                }
            }
        }
    }}
