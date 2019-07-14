package com.example.banquetvisit;

import android.content.Intent;
import android.provider.Telephony;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button login, register;
    EditText logemail , logpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.btn_login);
        register = findViewById(R.id.to_register);
        logemail=findViewById(R.id.edit1);
        logpass = findViewById(R.id.edit2);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                login();

            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });


    }

    public void register(){

        Intent i =new Intent(this, MainActivity.class);
        startActivity(i);

    }

    public void login (){
        if(logemail.getText().toString().equals("Sajid") && logpass.getText().toString().equals("12345")){

            Intent i =new Intent(this, Manager_activity.class);
            startActivity(i);

        }

        else if (logemail.getText().toString().equals("Manager") && logpass.getText().toString().equals("56789")){

            Intent i = new Intent(this , Manager_activity.class);
            startActivity(i);

        }

        else if(logemail.getText().toString().equals("") && logpass.getText().toString().equals("")){

            Toast.makeText(Login.this, "Please Fill All Fields",Toast.LENGTH_SHORT).show();

        }

        else {

            Toast.makeText(Login.this, "Invalid Credentials",Toast.LENGTH_SHORT).show();

        }
    }
}
