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

public class NumberCategory extends Fragment
{
    RecyclerView recyclerView;

    public ArrayList<EnglishMiwokWordsPair> generateNumberEnglishMiwokWordPair()
    {
        ArrayList<EnglishMiwokWordsPair> englishMiwokWordsPairs = new ArrayList<>();

        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair("one", "lutti", R.drawable.number_one, R.raw.number_one));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair("two", "ottiko", R.drawable.number_two, R.raw.number_two));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair("five", "massokka", R.drawable.number_five, R.raw.number_five));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair("six", "temmokka", R.drawable.number_six, R.raw.number_six));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair("nine", "wo'e", R.drawable.number_nine, R.raw.number_nine));
        englishMiwokWordsPairs.add(new EnglishMiwokWordsPair("ten", "na'aacha", R.drawable.number_ten, R.raw.number_ten));

        return englishMiwokWordsPairs;
    }

    /*View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int itemPosition = recyclerView.getChildLayoutPosition(v);
            String textItemPosition = String.valueOf(itemPosition);
            Toast.makeText(NumberCategory.this, "Click on position : " + textItemPosition, Toast.LENGTH_SHORT).show();
        }
    };*/

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {

        View rootView = inflater.inflate(R.layout.miwok_english_word_list, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.category_rv);

        MainCategoryRecyclerViewAdapter mainCategoryRecyclerViewAdapter = new MainCategoryRecyclerViewAdapter(generateNumberEnglishMiwokWordPair(), getActivity().getApplicationContext(), CategoryType.number);
        recyclerView.setAdapter(mainCategoryRecyclerViewAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(container.getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new SimpleDividerItemDecoration(getActivity().getApplicationContext()));

        return rootView;
    }
}
