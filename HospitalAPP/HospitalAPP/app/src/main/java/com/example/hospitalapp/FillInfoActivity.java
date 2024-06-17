package com.example.hospitalapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;

public class FillInfoActivity extends AppCompatActivity {
    private EditText nauseaVomitingDescription;
    private EditText giFunctionDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_info);

        nauseaVomitingDescription = findViewById(R.id.nausea_vomiting_description);
        giFunctionDescription = findViewById(R.id.gi_function_description);

        Spinner nauseaVomitingSpinner = findViewById(R.id.nausea_vomiting_spinner);
        Spinner giFunctionSpinner = findViewById(R.id.gi_function_spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.yes_no_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        nauseaVomitingSpinner.setAdapter(adapter);
        giFunctionSpinner.setAdapter(adapter);

        nauseaVomitingSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selected = parent.getItemAtPosition(position).toString();
                if (selected.equals("有")) {
                    nauseaVomitingDescription.setVisibility(View.VISIBLE);
                } else {
                    nauseaVomitingDescription.setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                nauseaVomitingDescription.setVisibility(View.GONE);
            }
        });

        giFunctionSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selected = parent.getItemAtPosition(position).toString();
                if (selected.equals("否")) {
                    giFunctionDescription.setVisibility(View.VISIBLE);
                } else {
                    giFunctionDescription.setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                giFunctionDescription.setVisibility(View.GONE);
            }
        });
    }
}


