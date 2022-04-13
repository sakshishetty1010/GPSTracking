package com.example.gpstracking;

import android.app.Application;
import android.location.Location;

import java.util.ArrayList;
import java.util.List;

public class MyAplication extends Application {
    private static MyAplication singleton;

    private List<Location> mylocations;

    public MyAplication getInstance(){
        return singleton;
    }

    public void setMylocations(List<Location> mylocations) {
        this.mylocations = mylocations;
    }

    public List<Location> getMylocations() {
        return mylocations;
    }


    public void onCreate(){
        super.onCreate();
        singleton = this;
        mylocations = new ArrayList<>();
    }
}
