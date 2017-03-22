package com.tw.birdtung.wra_20170320;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {

    Intent ShowPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        initOnClickListener();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.button1:
                ShowPage = new Intent(this, Button1Page.class);
                ShowPage.putExtra("Btnname", "button1");
                startActivity(ShowPage);
                break;
            case R.id.button2:
                ShowPage = new Intent(this, Button1Page.class);
                ShowPage.putExtra("Btnname", "button2");
                startActivity(ShowPage);
                break;
            case R.id.button3:
                ShowPage = new Intent(this, Button1Page.class);
                ShowPage.putExtra("Btnname", "button3");
                startActivity(ShowPage);
                break;
            case R.id.button4:
                ShowPage = new Intent(this, Button1Page.class);
                ShowPage.putExtra("Btnname", "button4");
                startActivity(ShowPage);
                break;
            case R.id.button5:
                ShowPage = new Intent(this, Button1Page.class);
                ShowPage.putExtra("Btnname", "button5");
                startActivity(ShowPage);
                break;
        }
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if(event.getAction() == MotionEvent.ACTION_DOWN){
            ButtonLarge(v);
        }
        else if(event.getAction() == MotionEvent.ACTION_UP){
            ButtonSmaller(v);
        }
        return false;
    }

    public void ButtonLarge(View v){
        v.setScaleX((float)1.2);
        v.setScaleY((float)1.2);
    }

    public void ButtonSmaller(View v){
        v.setScaleX((float)1);
        v.setScaleY((float)1);
    }

    void initOnClickListener(){
        int btnid[] = {R.id.button1, R.id.button2, R.id.button3, R.id.button4, R.id.button5};
        Button Btemp= null;
        for(int i = 0; i <btnid.length; i++){
            if((Btemp = (Button)findViewById(btnid[i])) != null) {
                Btemp.setOnClickListener(this);
                Btemp.setOnTouchListener(this);
            }
        }
    }
}
