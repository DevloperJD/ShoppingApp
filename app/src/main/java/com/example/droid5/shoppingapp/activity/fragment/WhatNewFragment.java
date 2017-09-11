package com.example.droid5.shoppingapp.activity.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.droid5.shoppingapp.R;
import com.example.droid5.shoppingapp.adapter.CarouselRecyclerviewAdapter;
import com.example.droid5.shoppingapp.adapter.FragmentRecyclerviewAdapter;
import com.example.droid5.shoppingapp.model.CarouselItem;
import com.example.droid5.shoppingapp.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by droid5 on 7/9/17.
 */

public class WhatNewFragment extends android.support.v4.app.Fragment {

    private final static String TAG = WhatNewFragment.class.getSimpleName();
    private FragmentRecyclerviewAdapter fragmentRecyclerviewAdapter;
    private List<Product> productList;
    private RecyclerView productRecyclerView;
    private RecyclerView carouselRecyclerView;
    private GridLayoutManager gridLayoutManager;
    private List<CarouselItem> carouselItemList;
    private View view;
    private CarouselRecyclerviewAdapter carouselRecyclerviewAdapter;
    private LinearLayoutManager linearLayoutManager;
    private Button btnMore;

    private String name;


    public WhatNewFragment() {
    }

    public static WhatNewFragment newInstance(String name) {
        WhatNewFragment fragment = new WhatNewFragment();
        Bundle args = new Bundle();
        args.putString("name", name);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments() != null){
            name = getArguments().getString("name");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

         view = inflater.inflate(R.layout.layoutone, container, false);

         btnMore = view.findViewById(R.id.btn_more);
         btnMore.setText(name);

        productList = new ArrayList<>();
        carouselItemList = new ArrayList<>();

        productRecyclerView = view.findViewById(R.id.products_recycler_view);
        productRecyclerView.setNestedScrollingEnabled(false);
        carouselRecyclerView = view.findViewById(R.id.carousel_recycler);
        gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        fragmentRecyclerviewAdapter = new FragmentRecyclerviewAdapter(productList, getActivity());
        productRecyclerView.setLayoutManager(gridLayoutManager);
        productRecyclerView.setAdapter(fragmentRecyclerviewAdapter);
        linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        carouselRecyclerviewAdapter = new CarouselRecyclerviewAdapter(carouselItemList, getActivity());
        carouselRecyclerView.setLayoutManager(linearLayoutManager);
        carouselRecyclerView.setAdapter(carouselRecyclerviewAdapter);
        SnapHelper snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(carouselRecyclerView);
        prepareProductList();
        return view;
    }

    private void prepareProductList() {
        Log.e(TAG, "prepareProductList");
        Product product = new Product("https://images-na.ssl-images-amazon.com/images/I/41y7uqTlRaL.jpg", "Hot Muggs DND Genius at Work Ceramic Mug, 350ml", "Hot Muggs", "285");
        productList.add(product);
        product = new Product("https://images-na.ssl-images-amazon.com/images/I/71fwooxnbLL._SL1500_.jpg", "Hot Muggs DND Genius at Work Ceramic Mug, 350ml", "Hot Muggs", "285");
        productList.add(product);
        product = new Product("https://images-na.ssl-images-amazon.com/images/I/41y7uqTlRaL.jpg", "Hot Muggs DND Genius at Work Ceramic Mug, 350ml", "Hot Muggs", "285");
        productList.add(product);
        product = new Product("https://images-na.ssl-images-amazon.com/images/I/71fwooxnbLL._SL1500_.jpg", "Hot Muggs DND Genius at Work Ceramic Mug, 350ml", "Hot Muggs", "285");
        productList.add(product);
        product = new Product("https://images-na.ssl-images-amazon.com/images/I/41y7uqTlRaL.jpg", "Hot Muggs DND Genius at Work Ceramic Mug, 350ml", "Hot Muggs", "285");
        productList.add(product);
        product = new Product("https://images-na.ssl-images-amazon.com/images/I/41y7uqTlRaL.jpg", "Hot Muggs DND Genius at Work Ceramic Mug, 350ml", "Hot Muggs", "285");
        productList.add(product);
        product = new Product("https://images-na.ssl-images-amazon.com/images/I/71fwooxnbLL._SL1500_.jpg", "Hot Muggs DND Genius at Work Ceramic Mug, 350ml", "Hot Muggs", "285");
        productList.add(product);
        product = new Product("https://images-na.ssl-images-amazon.com/images/I/41y7uqTlRaL.jpg", "Hot Muggs DND Genius at Work Ceramic Mug, 350ml", "Hot Muggs", "285");
        productList.add(product);
        product = new Product("https://images-na.ssl-images-amazon.com/images/I/71fwooxnbLL._SL1500_.jpg", "Hot Muggs DND Genius at Work Ceramic Mug, 350ml", "Hot Muggs", "285");
        productList.add(product);
        product = new Product("https://images-na.ssl-images-amazon.com/images/I/41y7uqTlRaL.jpg", "Hot Muggs DND Genius at Work Ceramic Mug, 350ml", "Hot Muggs", "285");
        productList.add(product);
        CarouselItem carouselItem = new CarouselItem("https://images-eu.ssl-images-amazon.com/images/G/31/img17/Fashion/AW/new-season-AF-page-04.jpg");
        carouselItemList.add(carouselItem);
        carouselItem = new CarouselItem("https://images-eu.ssl-images-amazon.com/images/G/31/img16/Fashion/Brands/NB/PostLaunch/Shoes_1024x400._V517735332_.jpg");
        carouselItemList.add(carouselItem);
        carouselItem = new CarouselItem("https://images-eu.ssl-images-amazon.com/images/G/31//img16/men-apparel/DenimFest17/PC/Denim-fest_01._V516097039_.jpg");
        carouselItemList.add(carouselItem);
        carouselItem = new CarouselItem("https://images-eu.ssl-images-amazon.com/images/G/31//IMG17/Fashion/August/NSL/Women/new-season-AF-womens-12._V518517532_.jpg");
        carouselItemList.add(carouselItem);
        carouselItem = new CarouselItem("https://images-eu.ssl-images-amazon.com/images/G/31/IN-hq/2017/img/Apparel/XCM_1064736_Manual_770x460_pantaloonsbigjpg_Newseason_AW17_AllClothing_BrandTiles._V517052168_.jpg");
        carouselItemList.add(carouselItem);
        fragmentRecyclerviewAdapter.notifyDataSetChanged();
        carouselRecyclerviewAdapter.notifyDataSetChanged();

    }


}
