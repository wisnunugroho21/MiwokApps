package com.example.android.miwokapps2;

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

import java.util.ArrayList;

public class FamilyMemberCategory extends Fragment {

    RecyclerView recyclerView;

    public ArrayList<EnglishMiwokWordsPair> generateNumberEnglishMiwokWordPair()
    {
        ArrayList<EnglishMiwokWordsPair> englishMiwokWordsPairs = new ArrayList<>();

        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair("father", "әpә", R.drawable.family_father, R.raw.family_father));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair("mother", "әṭa", R.drawable.family_mother, R.raw.family_mother));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair("son", "angsi", R.drawable.family_son, R.raw.family_son));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair("daugther", "tune", R.drawable.family_daughter, R.raw.family_daughter));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair("older brother", "taachi", R.drawable.family_older_brother, R.raw.family_older_brother));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair("younger brother", "chalitti", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair("older sister", "teṭe", R.drawable.family_older_sister, R.raw.family_older_sister));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair("younger sister", "kolliti", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair("grandmother", "ama", R.drawable.family_grandmother, R.raw.family_grandmother));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair("grandfather", "paapa", R.drawable.family_grandfather, R.raw.family_grandfather));


        return englishMiwokWordsPairs;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.miwok_english_word_list, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.category_rv);

        MainCategoryRecyclerViewAdapter mainCategoryRecyclerViewAdapter = new MainCategoryRecyclerViewAdapter(generateNumberEnglishMiwokWordPair(), getActivity().getApplicationContext(), CategoryType.family);
        recyclerView.setAdapter(mainCategoryRecyclerViewAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(container.getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new SimpleDividerItemDecoration(getActivity().getApplicationContext()));

        return rootView;
    }
}
