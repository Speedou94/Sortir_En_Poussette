package com.example.sortieenpoussette;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;


public class MainActivity extends AppCompatActivity {

    private Button createAccountBtn;
    private Button guestBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);
        createAccountBtn = findViewById(R.id.createAccountBtn);
        guestBtn = findViewById(R.id.guestBtn);


        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);
        // admin
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    //password correct
                    Toast.makeText(MainActivity.this, "Connexion éffectuée avec succès", Toast.LENGTH_LONG).show();
                } else
                    //password incorrect
                    Toast.makeText(MainActivity.this, "Connexion impossible", Toast.LENGTH_LONG).show();
            }
        });

        createAccountBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent createAccountActivity = new Intent(getApplicationContext(), CreateAccountActivity.class);
                startActivity(createAccountActivity);
            }
        });

        guestBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent HomeActivity = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(HomeActivity);
            }
        });

    }
}