package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

 public void bartButton(View view){

     Log.i("log1", "pressed");
     ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
     ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView);




 }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        bartImageView.setX(-1000);
        bartImageView.animate().rotation(1800).translationXBy(1000).setDuration(1100);
    }
}