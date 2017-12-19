package com.example.sunlight1.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Email,Pass;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Email=(EditText)findViewById(R.id.editTextEmail);
        Pass=(EditText)findViewById(R.id.editTextpass);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email=Email.getText().toString();
                String pass=Pass.getText().toString();
                if (email.length() == 0) {
                    Email.setError("Email is Required");
                    Email.requestFocus();
                }
                if (pass.length() == 0) {
                    Pass.setError("Password is Required");
                    Pass.requestFocus();
                }
                if(email.equals("awesomesaim@gmail.com")&&pass.equals("123456")==true){
                    Toast.makeText(MainActivity.this, "Email And Password are Match", Toast.LENGTH_SHORT).show();


                }
                else{
                    Toast.makeText(MainActivity.this, "Invalid login", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
