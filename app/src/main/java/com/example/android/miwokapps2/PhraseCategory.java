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

public class PhraseCategory extends Fragment
{

    RecyclerView recyclerView;

    public ArrayList<EnglishMiwokWordsPair> generateNumberEnglishMiwokWordPair()
    {
        ArrayList<EnglishMiwokWordsPair> englishMiwokWordsPairs = new ArrayList<>();

        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair(R.raw.phrase_where_are_you_going, "Where are you going?", "minto wuksus"));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair(R.raw.phrase_what_is_your_name, "What is your name?", "tinnә oyaase'nә"));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair(R.raw.phrase_my_name_is, "My name is...", "oyaaset..."));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair(R.raw.phrase_how_are_you_feeling, "How are you feeling?", "michәksәs?"));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair(R.raw.phrase_im_feeling_good, "I’m feeling good.", "kuchi achit"));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair(R.raw.phrase_are_you_coming, "Are you coming?", "әәnәs'aa?"));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair(R.raw.phrase_yes_im_coming, "Yes, I’m coming.", "hәә’ әәnәm"));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair(R.raw.phrase_im_coming, "I’m coming.", "әәnәm"));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair(R.raw.phrase_lets_go, "Let’s go.", "yoowutis"));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair(R.raw.phrase_come_here, "Come here.", "әnni'nem"));

        return englishMiwokWordsPairs;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.miwok_english_word_list, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.category_rv);

        MainCategoryRecyclerViewAdapter mainCategoryRecyclerViewAdapter = new MainCategoryRecyclerViewAdapter(generateNumberEnglishMiwokWordPair(), getActivity().getApplicationContext(), CategoryType.phrase);
        recyclerView.setAdapter(mainCategoryRecyclerViewAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(container.getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new SimpleDividerItemDecoration(getActivity().getApplicationContext()));

        return rootView;
    }
}



