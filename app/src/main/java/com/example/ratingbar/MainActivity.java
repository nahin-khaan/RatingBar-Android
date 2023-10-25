package com.example.ratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    RatingBar rating;
    TextView texts;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rating=findViewById(R.id.ratingId);
        texts=findViewById(R.id.textsId);

        //for ratingbar change

        rating.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
        public void onRatingChanged(RatingBar ratingBar,float rating, boolean fromUser)
        {
            texts.setText("FeedBack "+rating+" star");
            Toast.makeText(MainActivity.this,""+rating+" star",Toast.LENGTH_SHORT).show();


        }
    });


    }
}