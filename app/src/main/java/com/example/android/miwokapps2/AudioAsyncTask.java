package com.example.android.miwokapps2;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.AsyncTask;
import android.widget.Toast;

import java.io.IOException;

/**
 * Created by nugroho on 01/07/17.
 */

public class AudioAsyncTask extends AsyncTask<Void, Void, Boolean>
{
    MediaPlayer mediaPlayer;
    int audioRawID;
    Context context;

    public AudioAsyncTask(int audioRawID, Context context) {
        this.audioRawID = audioRawID;
        this.context = context;
    }

    @Override
    protected Boolean doInBackground(Void... params) {

        if(mediaPlayer != null)
        {
            if(mediaPlayer.isPlaying())
            {
                mediaPlayer.stop();
            }

            mediaPlayer.release();
            mediaPlayer = null;
        }

        try
        {
            Resources resources = context.getResources();
            Uri uri = new Uri.Builder()
                    .scheme(ContentResolver.SCHEME_ANDROID_RESOURCE)
                    .authority(resources.getResourcePackageName(audioRawID))
                    .appendPath(resources.getResourceTypeName(audioRawID))
                    .appendPath(resources.getResourceEntryName(audioRawID))
                    .build();

            mediaPlayer = new MediaPlayer();
            mediaPlayer.setDataSource(context, uri);
            mediaPlayer.prepare();
        }
        catch (IOException e)
        {
            return false;
        }
        catch (IllegalArgumentException e)
        {
            return false;
        }

        return true;
    }

    @Override
    protected void onPostExecute(Boolean aBoolean) {

        if (aBoolean == true)
        {
            mediaPlayer.start();
        }

        else
        {
            Toast.makeText(context, "Audio has failed on", Toast.LENGTH_SHORT).show();
        }
    }
}