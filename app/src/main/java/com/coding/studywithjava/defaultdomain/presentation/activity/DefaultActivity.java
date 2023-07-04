package com.coding.studywithjava.defaultdomain.presentation.activity;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.studywithjava.R;

public class DefaultActivity extends AppCompatActivity implements View.OnClickListener {
    private Button buttonUP, buttonDOWN;
    private ImageView imageViewTop, imageViewBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default);
        initComponentsAndSetListener();
    }

    private void initComponentsAndSetListener() {
        // Initialize components
        buttonUP = (Button) findViewById(R.id.button_default_up);
        buttonDOWN = (Button) findViewById(R.id.button_default_down);
        imageViewTop = (ImageView) findViewById(R.id.image_view_default_top);
        imageViewBottom = (ImageView) findViewById(R.id.image_view_default_bottom);
        // Set Listener to components
        buttonUP.setOnClickListener(this);
        buttonDOWN.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        Resources res = getResources();
        BitmapDrawable bitmapDrawable = (BitmapDrawable) res.getDrawable(R.drawable.image_app_icon);
        if(id == R.id.button_default_up) {
            imageViewBottom.setImageBitmap(null);
            imageViewTop.setImageDrawable(bitmapDrawable);
        }
        else if(id == R.id.button_default_down) {
            imageViewTop.setImageBitmap(null);
            imageViewBottom.setImageDrawable(bitmapDrawable);
        }
        else {
            // throw new Exception();
        }
    }
}