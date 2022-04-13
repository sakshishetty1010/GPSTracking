package com.example.gpstracking;

import androidx.appcompat.app.AppCompatActivity;

import android.location.Location;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class ShowSaveLocationList extends AppCompatActivity {

    ListView lv_savedLocations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_save_location_list);
        lv_savedLocations = findViewById(R.id.lv_waypoints) ;
        MyAplication myapplication = (MyAplication)getApplicationContext();
        List<Location> savedLocations = myapplication.getMylocations();
        lv_savedLocations.setAdapter(new ArrayAdapter<Location>(this, android.R.layout.simple_list_item_1,savedLocations));


    }



}