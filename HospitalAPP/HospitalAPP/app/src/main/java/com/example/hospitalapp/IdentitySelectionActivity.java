package com.example.hospitalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class IdentitySelectionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identity_selection);

        Button doctorButton = findViewById(R.id.doctor_button);
        Button patientButton = findViewById(R.id.patient_button);

        doctorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IdentitySelectionActivity.this, DoctorActivity.class);
                startActivity(intent);
            }
        });

        patientButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IdentitySelectionActivity.this, PatientLoginActivity.class);
                startActivity(intent);
            }
        });
    }
}


