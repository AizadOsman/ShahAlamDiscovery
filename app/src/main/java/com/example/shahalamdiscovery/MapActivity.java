package com.example.shahalamdiscovery;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Coordinates for Masjid Sultan Salahuddin Abdul Aziz
        LatLng Masjid = new LatLng(3.0788581906190644, 101.52072912410829);
        mMap.addMarker(new MarkerOptions().position(Masjid).title("Masjid Sultan Salahuddin Abdul Aziz"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Masjid, 12.0f));

        // Coordinates for WetWorld Water Park Shah Alam
        LatLng WetWorld = new LatLng(3.0724522786253057, 101.51256903944821);
        mMap.addMarker(new MarkerOptions().position(WetWorld).title("Wet World Water Park Shah Alam"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(WetWorld, 12.0f));

        // Coordinates for SnoWalk by i-City
        LatLng SnoWalk = new LatLng(3.0652936531641557, 101.48476467993339);
        mMap.addMarker(new MarkerOptions().position(SnoWalk).title("SnoWalk by i-City"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(SnoWalk, 12.0f));

        // Coordinates for Shah Alam Lake Garden
        LatLng Garden = new LatLng(3.0731228382559146, 101.51383999527339);
        mMap.addMarker(new MarkerOptions().position(Garden).title("Shah Alam Lake Garden"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Garden, 12.0f));

        // Coordinates for Raja Tun Uda Library
        LatLng library = new LatLng(3.089551601482359, 101.53319739527332);
        mMap.addMarker(new MarkerOptions().position(library).title("Raja Tun Uda Library"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(library, 12.0f));

        // Coordinates for Shah Alam Art Gallery
        LatLng Gallery = new LatLng(3.073168039387462, 101.51494956643829);
        mMap.addMarker(new MarkerOptions().position(Gallery).title("Shah Alam Art Gallery"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Gallery, 12.0f));

        // Coordinates for Uptown Shah Alam
        LatLng Uptown = new LatLng(3.0381159583389525, 101.5248618106133);
        mMap.addMarker(new MarkerOptions().position(Uptown).title("Uptown Shah Alam"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Uptown, 12.0f));

        // Coordinates for City Karting
        LatLng Karting = new LatLng(3.0815316100773305, 101.54221337993343);
        mMap.addMarker(new MarkerOptions().position(Karting).title("City Karting"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Karting, 12.0f));

        // Coordinates for Shah Alam Extreme Park
        LatLng Extreme = new LatLng(3.086700735783455, 101.54256629527332);
        mMap.addMarker(new MarkerOptions().position(Extreme).title("Shah Alam Extreme Park"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Extreme, 12.0f));

        // Coordinates for Pusat Akuatik Darul Ehsan
        LatLng swimming = new LatLng(3.0740137916949464, 101.53665185109845);
        mMap.addMarker(new MarkerOptions().position(swimming).title("Pusat Akuatik Darul Ehsan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(swimming, 12.0f));
    }
}
