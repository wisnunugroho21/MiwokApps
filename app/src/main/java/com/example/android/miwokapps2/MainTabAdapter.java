package com.example.android.miwokapps2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by nugroho on 02/07/17.
 */

public class MainTabAdapter extends FragmentPagerAdapter
{
    ArrayList<Fragment> fragmentArrayList = new ArrayList<>();
    ArrayList<String> titleArrayList = new ArrayList<>();

    public MainTabAdapter(FragmentManager fm)
    {
        super(fm);

        fragmentArrayList.add(new FamilyMemberCategory());
        titleArrayList.add("Family");

        fragmentArrayList.add(new ColorCategory());
        titleArrayList.add("Color");

        fragmentArrayList.add(new NumberCategory());
        titleArrayList.add("Number");

        fragmentArrayList.add(new PhraseCategory());
        titleArrayList.add("Phrase");
    }

    @Override
    public Fragment getItem(int position)
    {
        return fragmentArrayList.get(position);
    }

    @Override
    public int getCount()
    {
        return fragmentArrayList.size();
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        return titleArrayList.get(position);
    }
}
