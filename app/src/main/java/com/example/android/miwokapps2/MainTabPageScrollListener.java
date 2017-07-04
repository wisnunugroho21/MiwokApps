package com.example.android.miwokapps2;

import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;

/**
 * Created by nugroho on 02/07/17.
 */

public class MainTabPageScrollListener implements ViewPager.OnPageChangeListener {

    BottomNavigationView bottomNavigationView;

    public MainTabPageScrollListener(BottomNavigationView bottomNavigationView)
    {
        this.bottomNavigationView = bottomNavigationView;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels)
    {

    }

    @Override
    public void onPageSelected(int position) {

        switch (position)
        {
            case 0 : bottomNavigationView.setSelectedItemId(R.id.family_item_menu); break;
            case 1 : bottomNavigationView.setSelectedItemId(R.id.color_item_menu); break;
            case 2 : bottomNavigationView.setSelectedItemId(R.id.number_menu_item); break;
            case 3 : bottomNavigationView.setSelectedItemId(R.id.phrase_item_menu); break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state)
    {

    }
}
