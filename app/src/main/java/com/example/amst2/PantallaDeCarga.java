package com.example.amst2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.VideoView;

public class PantallaDeCarga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pantalla_de_carga);

        VideoView videov = (VideoView) findViewById(R.id.videoeo);

        try {
            //VideoView videoHolder = new VideoView(this);
            //setContentView(videoHolder);
            Uri video = Uri.parse("android.resource://" + getPackageName() + "/" +R.raw.marvelintrohd);
            //videoHolder.setVideoURI(video);
            videov.setVideoURI(video);


            //videoHolder.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            videov.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                public void onCompletion(MediaPlayer mp) {
                    jump();
                }
            });
            //videoHolder.requestFocus();
            //videoHolder.start();

            videov.requestFocus();
            videov.start();

        } catch (Exception ex) {
            jump();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        jump();
        return true;
    }

    private void jump() {
        if (isFinishing())
            return;
        startActivity(new Intent(this, Ingreso.class));
        finish();
    }
}
