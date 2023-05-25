package com.example.hellowordsem9.Adapters;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hellowordsem9.R;
import com.example.hellowordsem9.models.Anime;
import com.example.hellowordsem9.models.Contacto;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AnimeAdapter extends RecyclerView.Adapter {

    private List<Anime> animes;

    public AnimeAdapter(List<Anime> animes) {
        this.animes = animes;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_anime, parent, false);
        AnimeAdapter.AnimeViewHolder viewHolder = new AnimeAdapter.AnimeViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Anime item = animes.get(position);
        View view = holder.itemView;
        ImageButton btnstar = view.findViewById(R.id.button_star);
        if (item.isFavorite()) {
            btnstar.setImageResource(R.drawable.star);
        } else {
            btnstar.setImageResource(R.drawable.no_star);
        }
        btnstar.setOnClickListener(click -> {
            if (item.isFavorite()) {
                btnstar.setImageResource(R.drawable.no_star);
                item.setFavorite(false);
            } else {
                btnstar.setImageResource(R.drawable.star);
                item.setFavorite(true);

            }
        });

        TextView tvName = view.findViewById(R.id.title_anime);
        TextView tvPhone = view.findViewById(R.id.description_anime);
        ImageView imageView = view.findViewById(R.id.picture_anime);
        tvName.setText(item.getTitle());
        tvPhone.setText(item.getDescription());
        Picasso.get().load(item.getPicture()).into(imageView);
    }

    @Override
    public int getItemCount() {
        return animes.size();
    }

    public class AnimeViewHolder extends RecyclerView.ViewHolder {

        public AnimeViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
