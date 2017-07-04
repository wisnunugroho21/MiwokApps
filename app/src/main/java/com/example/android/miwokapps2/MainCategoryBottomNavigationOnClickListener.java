package com.example.android.miwokapps2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;

/**
 * Created by nugroho on 02/07/17.
 */

public class MainCategoryBottomNavigationOnClickListener implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;
    ViewPager viewPager;

    public MainCategoryBottomNavigationOnClickListener(BottomNavigationView bottomNavigationView, ViewPager viewPager) {
        this.bottomNavigationView = bottomNavigationView;
        this.viewPager = viewPager;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId())
        {
            case R.id.color_item_menu : viewPager.setCurrentItem(1); break;
            case R.id.family_item_menu : viewPager.setCurrentItem(0); break;
            case R.id.number_menu_item : viewPager.setCurrentItem(2); break;
            case R.id.phrase_item_menu : viewPager.setCurrentItem(3); break;
            default: return false;
        }

        return true;
    }
}
