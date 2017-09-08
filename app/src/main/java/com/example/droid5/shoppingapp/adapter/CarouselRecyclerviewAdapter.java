package com.example.droid5.shoppingapp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.droid5.shoppingapp.R;
import com.example.droid5.shoppingapp.model.CarouselItem;

import java.util.List;

/**
 * Created by droid5 on 8/9/17.
 */

public class CarouselRecyclerviewAdapter extends RecyclerView.Adapter<CarouselRecyclerviewAdapter.Holder> {
    private List<CarouselItem> carouselItemList;
    Context context;

    public CarouselRecyclerviewAdapter(List<CarouselItem> carouselItemList, Context context) {
        this.carouselItemList = carouselItemList;
        this.context = context;
    }

    public class Holder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        public Holder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.product_carousel_imageview);
        }
    }
    @Override
    public CarouselRecyclerviewAdapter.Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_viewpager,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(CarouselRecyclerviewAdapter.Holder holder, int position) {
        CarouselItem carouselItem = carouselItemList.get(position);
        Glide.with(context).load(carouselItem.getThumbUrl()).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return carouselItemList.size();
    }


}
