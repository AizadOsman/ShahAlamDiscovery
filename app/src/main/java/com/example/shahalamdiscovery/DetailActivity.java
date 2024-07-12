package com.example.shahalamdiscovery;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView titleTextView, priceTextView, locationTextView, shortDescriptionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageView = findViewById(R.id.imageView);
        titleTextView = findViewById(R.id.places);
        priceTextView = findViewById(R.id.price);
        locationTextView = findViewById(R.id.location);
        shortDescriptionTextView = findViewById(R.id.short_description);

        Place place = (Place) getIntent().getSerializableExtra("place");
        if (place != null) {
            titleTextView.setText(place.getTitle());
            priceTextView.setText(place.getPrice());
            locationTextView.setText(place.getLocation());
            shortDescriptionTextView.setText(place.getDescription()); // Corrected method name
            imageView.setImageResource(place.getImageResId());
        }
    }
}
