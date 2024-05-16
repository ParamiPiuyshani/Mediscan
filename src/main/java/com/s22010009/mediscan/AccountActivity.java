package com.s22010009.mediscan;

import static android.app.ProgressDialog.show;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class AccountActivety  extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null)
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser != null) {
            // If user is already signed in navigate to the home page
            Intent intent = new Intent(AccountActivety.this, HomeActivity.class);
            startActivity(intent);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

        // Find views
        TextView haveAccountTextView = findViewById(R.id.Words10);
        EditText userNameEditText = findViewById(R.id.mobilehint);
        EditText emailEditText = findViewById(R.id.mailhint);
        EditText passwordEditText = findViewById(R.id.addresshint);
        EditText retypePasswordEditText = findViewById(R.id.namehint);
        Button signupButton = findViewById(R.id.loginbutton);


        // Set click listener for sign up button
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get user inputs
                String username = userNameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                String retypePassword = retypePasswordEditText.getText().toString();

                // Check if any field is empty
                if (email.isEmpty() || password.isEmpty() || username.isEmpty() || retypePassword.isEmpty()) {
                    Toast.makeText AccountActivity . this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Check if passwords match
                if (password.equals(retypePassword)) {
                    // Create user with email and password
                    mAuth.createUserWithEmailAndPassword(email, password)
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        // Sign up successful then navigate to home
                                        Toast.makeText(AccountActivety.this, "Sign up successful", Toast.LENGTH_SHORT).show();
                                        Intent intent = new Intent(AccountActivety.this, HomeActivity.class);
                                        startActivity(intent);
                                    } else {
                                        // Sign up failed
                                        Toast.makeText(A.this, "Sign up failed! Try again later", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                } else {
                    // Passwords do not match msg
                    Toast.makeText(AccountActivety.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Set click listener for already have an account txt
        haveAccountTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void backto(View view) {
                // Navigate to login page
                Intent intent = new Intent(.this, LoginActivity.class);
                startActivity(intent);
            }

            public void  gotohomepage(View view) {
                // Navigate to login page
                Intent intent = new Intent(.this, HomeActivity.class);
                startActivity(intent);



            }
        });
    }
}






