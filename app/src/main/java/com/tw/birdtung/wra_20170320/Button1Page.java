package com.tw.birdtung.wra_20170320;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import static com.tw.birdtung.wra_20170320.R.id.videoView;

public class Button1Page extends AppCompatActivity implements View.OnClickListener{

    VideoView vdv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button1_page);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        vdv = (VideoView) findViewById(videoView);//取得畫面中videoview元件
        MediaController mc = new MediaController(this);//建立播放控制物件
        vdv.setMediaController(mc);//設定要使用播放控制物件
        ShowVideo();
        Button btn = (Button) findViewById(R.id.page1back);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        finish();
    }
    public void ShowVideo(){

        Intent receivedata = this.getIntent();
        String btnname = receivedata.getStringExtra("Btnname");
        switch (btnname) {
            case "button1":
                vdv.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.button1));
                break;

            case "button2":
                vdv.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.button2));
                break;
            case "button3":
                vdv.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.button3));
                break;
            case "button4":
                vdv.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.button4));
                break;
            case "button5":
                vdv.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.button5));
                break;
        }
        vdv.requestFocus();
        vdv.start();
    }
}
