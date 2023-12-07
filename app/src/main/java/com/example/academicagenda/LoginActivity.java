package com.example.academicagenda;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;
    private Button registerButton;
    private Button forgotPasswordButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); // Assuming you have a layout file named "activity_login.xml"

        // Initialize UI elements
        usernameEditText = findViewById(R.id.editTextUsername); // Assuming you have an EditText with id "editTextUsername" in your layout
        passwordEditText = findViewById(R.id.editTextPassword); // Assuming you have an EditText with id "editTextPassword" in your layout
        loginButton = findViewById(R.id.buttonLogin); // Assuming you have a Button with id "buttonLogin" in your layout
        registerButton = findViewById(R.id.buttonRegister); // Assuming you have a Button with id "buttonRegister" in your layout
        forgotPasswordButton = findViewById(R.id.buttonForgotPassword); // Assuming you have a Button with id "buttonForgotPassword" in your layout

        // Set click listener for the login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle login logic here
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // For simplicity, check if both username and password are not empty
                if (!username.isEmpty() && !password.isEmpty()) {
                    // Successful login, navigate to the main activity or another appropriate screen
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish(); // Finish the LoginActivity to prevent going back to it
                } else {
                    // Display an error message or handle invalid login credentials
                    Toast.makeText(LoginActivity.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Set click listener for the register button
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle registration logic here
                Intent intent = new Intent(LoginActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });

        // Set click listener for the forgot password button
        forgotPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle password recovery logic here
                // You can navigate to a password recovery activity or show a dialog
                Toast.makeText(LoginActivity.this, "Password recovery feature coming soon!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
