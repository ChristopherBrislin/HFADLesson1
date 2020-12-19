package com.example.hfadlesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        Intent intent = getIntent();
        String brand = intent.getStringExtra(MainActivity.SELECTED_BRAND);

        TextView textView = findViewById(R.id.display_car);


        switch(brand){
            case("Toyota"):
                String car = getString(R.string.Toyota);
                textView.setText(brand + " " + car);
                break;
            case("Mazda"):

                textView.setText(brand + " " + getString(R.string.Mazda));
                break;
            case("Audi"):

                textView.setText(brand + " " + getString(R.string.Audi));
                break;
            default:
                break;
        }


    }
}