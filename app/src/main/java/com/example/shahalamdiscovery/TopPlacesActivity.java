package com.example.shahalamdiscovery;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class TopPlacesActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PlaceAdapter placeAdapter;
    private List<Place> placeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_places);

        recyclerView = findViewById(R.id.top_place);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        placeList = new ArrayList<>();
        placeList.add(new Place("Sultan Salahuddin Abdul Shah Mosque", "FREE", R.drawable.masjid,
                "Location:Seksyen 14, 40100 Shah Alam, Selangor, Malaysia",
                "Shah Alam is known to house the largest mosque named Masjid Negeri Shah Alam or known officially as Mosque of Sultan Salahuddin Abdul Aziz Shah. Splendid mosque inside and out, the Mosque of Sultan Salahuddin Abdul Aziz Shah is an absolute architectural masterpiece to behold. They also provide free tour guide, ideal for non-Muslims to know more about Islam."));
        placeList.add(new Place("Shah Alam Lake Garden", "FREE", R.drawable.shah_alam_lake_garden,
                "Location:Seksyen 14, 40100 Shah Alam, Selangor, Malaysia",
                "Shah Alam Lake Garden is a popular recreational park with a large lake and various facilities for outdoor activities."));
        placeList.add(new Place("Raja Tun Uda Public Library", "FREE", R.drawable.raja_tun_uda_public_library,
                "Location:Seksyen 14, 40100 Shah Alam, Selangor, Malaysia",
                "Located opposite the Golf Club House, the Raja Tun Uda Library is nicknamed ‘the library in a park.’ Surrounded by green scenery of hills, the library attracts many visitors, not just book lovers with its contemporary glass architecture. Besides their wide selection of books, the library is also equipped with computers that are available for rent and a high-tech 6D theater."));
        placeList.add(new Place("SnoWalk @ i-City", "RM 20", R.drawable.snowalk_i_city,
                "Location:Seksyen 14, 40100 Shah Alam, Selangor, Malaysia",
                "Touted as the first indoor water wonderland in Southeast Asia, SnoWalk is said to always maintained below 5 degrees Celsius with 100mm of snow underfoot. It features 50 thousand square feet of floor space and over 100 tonnes of ice sculptures shaped by a team of 30 artists from Harbin, China. It also features a play zone for fun activities such as snowman-making, ice-sliding and tobogganing."));
        placeList.add(new Place("Wet World Water Park Shah Alam", "RM 35", R.drawable.wet_world_water_park_shah_alam,
                "Location: No. 3A, Persiaran Dato Menteri, Seksyen 14, 40000 Shah Alam.",
                "The largest waterpark chain in Shah Alam, Wet World, stands by its promise to make everyone happy. The park features plenty of thrilling water rides and colourful floats for travelling families and people looking to cool off on a sunny day in Kuala Lumpur.\n" +
                        "\n" +
                        "This place is accessible within a 45-minute drive from Kuala Lumpur city centre. The park is ideal for hosting group functions, carnivals, parties, family days, school picnics, corporate events and fundraising activities, especially during weekends."));
        placeList.add(new Place("Shah Alam Gallery", "FREE", R.drawable.shah_alam_gallery,
                "Location:Seksyen 14, 40100 Shah Alam, Selangor, Malaysia",
                "This gallery is located alongside the lake and contains a modest exhibition of paintings and artworks from local and foreign artists. The gallery is also often used as a wedding venue. Next door is a facility called Shah Alam Cultural Park where traditional and modern dance and music performances are held periodically alongside handicraft stalls."));
        placeList.add(new Place("Shah Alam Extreme Park", "FREE", R.drawable.shah_alam_extreme_park,
                "Location:Jalan Lompat Pagar 13/37, Seksyen 13, 40100 Shah Alam, Selangor, Malaysia",
                "Shah Alam Extreme Park is a little-known outdoor multisport facility near the Shah Alam library and Stadium Melawati. The place is accessible via the many highways to Shah Alam.\n" +
                        "\n" +
                        "3 circuits of varying difficulty are available, and picnic areas and venues for events such as team building, birthday parties, or just a relaxing day in the forest. This is a popular weekend destination for residents of Shah Alam."));
        placeList.add(new Place("Up Town Shah Alam", "FREE", R.drawable.up_town_shah_alam,
                "Location:Seksyen 24 40300 Shah Alam Selangor",
                "There are indeed many shopping malls in Shah Alam. One of the most visited is Uptown Shah Alam.Located in Section 24, this mall sells a wide variety of goods. Both digital and necessities, everything is there.\n" +
                        "\n" +
                        "Among them are mobile phone accessories, shirts and other necessities. The food here is also delicious."));
        placeList.add(new Place("City Karting Shah Alam", "RM50 per 10 minutes", R.drawable.city_karting,
                "Location:Western 5, Seksyen 13, 40000 Shah Alam, Selangor",
                "Want to drive Go Kart? Just stop by the go-kart circuit located in Section 13. It is the first outdoor go-kart circuit in Malaysia. The circuit is also very famous among go-kart lovers because it regularly holds races."));
        placeList.add(new Place("Pusat Akuatik Darul Ehsan", "FREE", R.drawable.pusat_akuatik,
                "Location:Jalan Aerobik 13/43, Seksyen 13, 40100 Shah Alam, Selangor",
                "Apart from water theme parks, are you still looking for a place to bathe in Shah Alam? The Darul Ehsan Aquatic Centre is one of them. There are also various sizes of swimming pools here. In addition, the swimming pool for children is also safe and not deep."));

        placeAdapter = new PlaceAdapter(placeList, new PlaceAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Place place) {
                Intent intent = new Intent(TopPlacesActivity.this, DetailActivity.class);
                intent.putExtra("place", place);
                startActivity(intent);
            }
        });
        recyclerView.setAdapter(placeAdapter);
    }
}
