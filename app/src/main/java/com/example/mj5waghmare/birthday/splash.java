package com.example.mj5waghmare.birthday;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by Mj5Waghmare on 02-Apr-18.
 */

public class splash extends AppCompatActivity{
    ImageView imgv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spalch_act);
        imgv = (ImageView)findViewById(R.id.imgv);
    }
}
