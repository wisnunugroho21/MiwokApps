package com.example.android.miwokapps2;

/**
 * Created by nugroho on 02/05/17.
 */

public class EnglishMiwokWordsPair {
    String textEnglish;
    String textMiwok;
    int idImage;
    int idAudio;

    public EnglishMiwokWordsPair(String textEnglish, String textMiwok) {
        this.textEnglish = textEnglish;
        this.textMiwok = textMiwok;
    }

    public EnglishMiwokWordsPair(String textEnglish, String textMiwok, int idImage) {
        this.textEnglish = textEnglish;
        this.textMiwok = textMiwok;
        this.idImage = idImage;
    }

    public EnglishMiwokWordsPair(String textEnglish, String textMiwok, int idImage, int idAudio) {
        this.textEnglish = textEnglish;
        this.textMiwok = textMiwok;
        this.idImage = idImage;
        this.idAudio = idAudio;
    }

    public EnglishMiwokWordsPair(int idAudio, String textEnglish, String textMiwok) {
        this.textEnglish = textEnglish;
        this.textMiwok = textMiwok;
        this.idAudio = idAudio;
    }


    public String getTextEnglish() {
        return textEnglish;
    }

    public String getTextMiwok() {
        return textMiwok;
    }

    public int getIdImage() {
        return idImage;
    }

    public int getIdAudio() {
        return idAudio;
    }
}
