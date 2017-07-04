package com.example.android.miwokapps2;

import android.content.Context;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nugroho on 02/07/17.
 */

public class MainCategoryRecyclerViewAdapter extends RecyclerView.Adapter<MainCategoryViewHolder>
{
    View itemView;
    ArrayList<EnglishMiwokWordsPair> englishMiwokWordsPairs;
    Context context;
    CategoryType categoryType;

    public MainCategoryRecyclerViewAdapter(ArrayList<EnglishMiwokWordsPair> englishMiwokWordsPairs, Context context, CategoryType categoryType) {
        this.englishMiwokWordsPairs = englishMiwokWordsPairs;
        this.context = context;
        this.categoryType = categoryType;
    }

    @Override
    public MainCategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.miwok_english_word_item_list, parent , false);
        return new MainCategoryViewHolder(itemView, englishMiwokWordsPairs, context, categoryType);
    }

    @Override
    public void onBindViewHolder(MainCategoryViewHolder holder, int position)
    {
        holder.Bind(position);
    }

    @Override
    public int getItemCount() {
        return englishMiwokWordsPairs.size();
    }
}

class MainCategoryViewHolder extends RecyclerView.ViewHolder
{
    ArrayList<EnglishMiwokWordsPair> englishMiwokWordsPairs;

    ImageView categoryIV;
    TextView englishTV;
    TextView miwokTV;
    ConstraintLayout constraintLayout;

    CategoryType categoryType;
    Context context;
    View view;

    public MainCategoryViewHolder(View itemView, ArrayList<EnglishMiwokWordsPair> englishMiwokWordsPairs, Context context, CategoryType categoryType) {
        super(itemView);

        this.view = itemView;

        this.englishMiwokWordsPairs = englishMiwokWordsPairs;
        this.context = context;
        this.categoryType = categoryType;

        categoryIV = (ImageView) view.findViewById(R.id.item_category_iv);
        englishTV = (TextView) view.findViewById(R.id.english_word_tv);
        miwokTV = (TextView) view.findViewById(R.id.miwok_word_tv);
        constraintLayout = (ConstraintLayout) view.findViewById(R.id.item_menu_layout_background);
    }

    public void Bind(int position)
    {
        EnglishMiwokWordsPair englishMiwokWordsPair = englishMiwokWordsPairs.get(position);

        if(englishMiwokWordsPair.getIdImage() <= 0 )
        {
            categoryIV.setVisibility(View.INVISIBLE);
        }

        else
        {
            categoryIV.setVisibility(View.VISIBLE);
            categoryIV.setImageResource(englishMiwokWordsPair.getIdImage());
        }

        englishTV.setText(englishMiwokWordsPair.getTextEnglish());
        miwokTV.setText(englishMiwokWordsPair.getTextMiwok());

        AudioOnClickListener audioOnClickListener = new AudioOnClickListener(englishMiwokWordsPair.getIdAudio(), context);
        view.setOnClickListener(audioOnClickListener);

        switch (categoryType)
        {
            case family: constraintLayout.setBackgroundResource(R.color.familyCategory); break;
            case color: constraintLayout.setBackgroundResource(R.color.colorCategory); break;
            case number: constraintLayout.setBackgroundResource(R.color.numberCategory); break;
            case phrase: constraintLayout.setBackgroundResource(R.color.phraseCategory); break;
        }
    }

}


