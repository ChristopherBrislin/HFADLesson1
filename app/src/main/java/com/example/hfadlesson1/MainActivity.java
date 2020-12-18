package com.example.hfadlesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findVehicles(View view){
        Spinner carBrand = (Spinner) findViewById(R.id.vehicle_type);
        TextView cars = (TextView) findViewById(R.id.text);
        switch(String.valueOf(carBrand.getSelectedItem())){
            case("Toyota"):
                cars.setText("Yaris");
                break;
            case("Mazda"):
                cars.setText("BT50");
                break;
            case("Audi"):
                cars.setText("S3");
                break;
            default:
                break;
        }
    }
}