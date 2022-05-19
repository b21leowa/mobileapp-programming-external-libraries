package com.example.externallibraries;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.Rotate;
import com.bumptech.glide.request.RequestOptions;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    ImageView imageOne;
    Button leftButton, rightButton;
    int angle = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageOne = findViewById(R.id.image_one);
        leftButton = findViewById(R.id.left_button);
        rightButton = findViewById(R.id.right_button);

        Glide.with(this).load("https://cdn.pixabay.com/photo/2022/05/08/18/13/cat-7182671_960_720.jpg").into(imageOne);

        leftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Rotates the image with 90 degrees
                angle += 90;
                imageOne.setRotation(angle);
            }
        });

        rightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Rotates the image with -90 degrees
                angle -= 90;
                imageOne.setRotation(angle);
            }
        });

    }
}
