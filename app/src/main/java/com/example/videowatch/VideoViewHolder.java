package com.example.videowatch;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class VideoViewHolder  extends RecyclerView.ViewHolder {

    public ImageView imgThumbnail;
    public TextView txtName;
    public CardView cardView;

    public VideoViewHolder(@NonNull View itemView) {
        super(itemView);
        imgThumbnail  = itemView.findViewById(R.id.img_thumbnail);
        txtName = itemView.findViewById(R.id.txt_name);
        cardView = itemView.findViewById(R.id.main_container);

    }
}
