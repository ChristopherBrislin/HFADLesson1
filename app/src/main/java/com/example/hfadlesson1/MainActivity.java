package com.example.hfadlesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String SELECTED_BRAND = "com.example.hfadlesson1.BRAND";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findVehicles(View view){
        Intent intent = new Intent(this, ShowActivity.class);
        Spinner carBrand = (Spinner) findViewById(R.id.vehicle_type);
        String selectedBrand = String.valueOf(carBrand.getSelectedItem());

        intent.putExtra(SELECTED_BRAND, selectedBrand);
        startActivity(intent);
        /*

        */
    }
}