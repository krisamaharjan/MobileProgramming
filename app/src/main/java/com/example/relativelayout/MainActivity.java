package com.example.relativelayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText emailInput;
    EditText passwordInput;
    Spinner genderSpinner;
    Button submitButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);



        emailInput= findViewById(R.id.editInput);
        passwordInput= findViewById(R.id.password_abel);
        genderSpinner= findViewById(R.id.gender_label);
        submitButton= findViewById(R.id.submitbutton);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.gender_items, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderSpinner.setAdapter(adapter);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailInput.getText().toString();
                String password = passwordInput.getText().toString();
                String gender = genderSpinner.getSelectedItem().toString();

                String result = "Email: " + email + "\nPassword: " + password + "\nGender: " + gender;
                Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();

            }

        });

    }
}