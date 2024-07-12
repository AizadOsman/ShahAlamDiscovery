package com.example.shahalamdiscovery;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.PlaceViewHolder> {

    private List<Place> placeList;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(Place place);
    }

    public PlaceAdapter(List<Place> placeList, OnItemClickListener listener) {
        this.placeList = placeList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public PlaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_place, parent, false);
        return new PlaceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceViewHolder holder, int position) {
        Place place = placeList.get(position);
        holder.title.setText(place.getTitle());
        holder.price.setText(place.getPrice());
        holder.relativeLayout.setBackgroundResource(place.getImageResId());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(place);
            }
        });
    }

    @Override
    public int getItemCount() {
        return placeList.size();
    }

    static class PlaceViewHolder extends RecyclerView.ViewHolder {
        TextView title, price;
        RelativeLayout relativeLayout;

        public PlaceViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.Title);
            price = itemView.findViewById(R.id.price);
            relativeLayout = itemView.findViewById(R.id.relativeLayout);
        }
    }
}
