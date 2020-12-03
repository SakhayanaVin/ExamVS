package com.example.examvs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SignAUpctivity extends AppCompatActivity {

    TextView status, signUp;
    Button signIn, signUpBtn;
    EditText emailAddress, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_a_upctivity);

        status = (TextView)findViewById(R.id.status);
        signUp = (TextView)findViewById(R.id.signUp);
        signIn = (Button)findViewById(R.id.signIn);
        signUpBtn = (Button)findViewById(R.id.signUpBtn);
        emailAddress = (EditText)findViewById(R.id.EmailAddress);
        password = (EditText)findViewById(R.id.Password);

        signUpBtn.setVisibility(View.INVISIBLE);
        signUpBtn.setEnabled(false);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUpBtn.setVisibility(View.INVISIBLE);
                signUp.setVisibility(View.INVISIBLE);
                signUpBtn.setVisibility(View.VISIBLE);
                signUpBtn.setEnabled(true);
                status.setText("Forgot password?");
            }
        });
    }
}