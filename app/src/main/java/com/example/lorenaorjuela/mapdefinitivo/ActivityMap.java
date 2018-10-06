package com.example.lorenaorjuela.mapdefinitivo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ActivityMap extends AppCompatActivity implements OnMapReadyCallback{

    private static final String TAG = ActivityMap.class.getSimpleName(); //"ActivityMap"
    private GoogleMap googleMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        MapView mapPrincipal;
        mapPrincipal = findViewById(R.id.map);
        mapPrincipal.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        Log.d(TAG, "onMapReady: ");
        this.googleMap = googleMap;

        LatLng currentLocation = new LatLng(10, 10);
        this.googleMap.addMarker(new MarkerOptions().position(currentLocation).title("My location"));
        this.googleMap.moveCamera(CameraUpdateFactory.newLatLng(currentLocation));
    }
}
