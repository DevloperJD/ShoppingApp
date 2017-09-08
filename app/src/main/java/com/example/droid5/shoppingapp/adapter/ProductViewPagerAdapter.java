package com.example.droid5.shoppingapp.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.droid5.shoppingapp.R;
import com.example.droid5.shoppingapp.model.CarouselItem;

import java.util.List;

/**
 * Created by droid5 on 8/9/17.
 */

public class ProductViewPagerAdapter extends PagerAdapter {


    private LayoutInflater inflater;
    List<CarouselItem> carouselItemList;


    public ProductViewPagerAdapter(List<CarouselItem> carouselItems) {
        this.carouselItemList = carouselItems;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = inflater.inflate(R.layout.product_viewpager, container, false);
        container.addView(view);
        return view;
    }

    @Override
    public int getCount() {
        return carouselItemList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view ==object;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        View view = (View) object;
        container.removeView(view);
    }



}
