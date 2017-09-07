package com.example.droid5.shoppingapp.activity;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.droid5.shoppingapp.R;

/**
 * Created by droid5 on 7/9/17.
 */

public class WHATNEWfragment extends android.support.v4.app.Fragment {

    public WHATNEWfragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {

        return inflater.inflate(R.layout.layoutone, container, false);
    }


}
