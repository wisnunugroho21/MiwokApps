package com.example.android.miwokapps2;

import android.graphics.Color;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.main_bnv);
        viewPager = (ViewPager) findViewById(R.id.main_vp);

        SetBottomNavigationView();
        SetMainTab();
    }

    private void SetBottomNavigationView()
    {
        bottomNavigationView.setOnNavigationItemSelectedListener(new MainCategoryBottomNavigationOnClickListener(bottomNavigationView, viewPager));
        bottomNavigationView.setItemBackgroundResource(R.color.colorPrimary);
    }

    private void SetMainTab()
    {
        viewPager.setAdapter(new MainTabAdapter(getSupportFragmentManager()));
        viewPager.addOnPageChangeListener(new MainTabPageScrollListener(bottomNavigationView));
    }
}
