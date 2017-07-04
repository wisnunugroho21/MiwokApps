package com.example.android.miwokapps2;

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.apache.http.conn.ConnectTimeoutException;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class ColorCategory extends Fragment {

    RecyclerView recyclerView;

    public ArrayList<EnglishMiwokWordsPair> generateNumberEnglishMiwokWordPair()
    {
        ArrayList<EnglishMiwokWordsPair> englishMiwokWordsPairs = new ArrayList<>();

        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair("red", "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair("green", "chokokki", R.drawable.color_green, R.raw.color_green));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair("brown", "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair("gray", "ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair("black", "kululli", R.drawable.color_black, R.raw.color_black));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair("white", "kelelli", R.drawable.color_white, R.raw.color_white));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));

        return englishMiwokWordsPairs;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {

        View rootView = inflater.inflate(R.layout.miwok_english_word_list, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.category_rv);

        MainCategoryRecyclerViewAdapter mainCategoryRecyclerViewAdapter = new MainCategoryRecyclerViewAdapter(generateNumberEnglishMiwokWordPair(), getActivity().getApplicationContext(), CategoryType.color);
        recyclerView.setAdapter(mainCategoryRecyclerViewAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(container.getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new SimpleDividerItemDecoration(getActivity().getApplicationContext()));

        return rootView;
    }
}
