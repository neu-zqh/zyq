package com.example.hospitalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class PatientDashboardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_dashboard);

        Button fillInfoButton = findViewById(R.id.fill_info_button);
        Button viewFeedbackButton = findViewById(R.id.view_feedback_button);

        fillInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PatientDashboardActivity.this, FillInfoActivity.class);
                startActivity(intent);
            }
        });

        viewFeedbackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PatientDashboardActivity.this, ViewFeedbackActivity.class);
                startActivity(intent);
            }
        });
    }
}
