package com.example.android.miwokapps2;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.AsyncTask;
import android.view.View;
import android.widget.Toast;

import java.io.IOException;

/**
 * Created by nugroho on 01/07/17.
 */

public class AudioOnClickListener implements View.OnClickListener {

    int audioRawID;
    Context context;

    public AudioOnClickListener(int audioRawID, Context context) {
        this.audioRawID = audioRawID;
        this.context = context;
    }

    @Override
    public void onClick(View v)
    {
        AudioAsyncTask audioAsyncTask = new AudioAsyncTask(audioRawID, context);
        audioAsyncTask.execute();
    }
}




