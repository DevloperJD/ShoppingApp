package com.example.droid5.shoppingapp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.droid5.shoppingapp.R;
import com.example.droid5.shoppingapp.model.Product;

import java.util.List;

/**
 * Created by droid5 on 8/9/17.
 */

public class FragmentRecyclerviewAdapter extends RecyclerView.Adapter<FragmentRecyclerviewAdapter.Holder> {
    List<Product> productList;
    Context context;


    public FragmentRecyclerviewAdapter(List<Product> productList, Context context) {
        this.productList = productList;
        this.context = context;
    }

    public class Holder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView productName,firmName,priceTag;
        public Holder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.product_image);
            productName = itemView.findViewById(R.id.product_name);
            firmName = itemView.findViewById(R.id.firm_name);
            priceTag = itemView.findViewById(R.id.price_tag);

        }
    }


    @Override
    public FragmentRecyclerviewAdapter.Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View productView = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_view,parent, false);
        return new Holder(productView);
    }

    @Override
    public void onBindViewHolder(FragmentRecyclerviewAdapter.Holder holder, int position) {
        Product product = productList.get(position);

        holder.productName.setText(product.getProductName());
        holder.firmName.setText(product.getFirmName());
        holder.priceTag.setText( product.getPrice());
        Glide.with(context).load(product.getThumbUrl()).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }


}
