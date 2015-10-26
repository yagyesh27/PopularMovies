package com.myappsworld.popularmovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView iv = (ImageView)findViewById(R.id.imageView);
        Intent i = getIntent();
        Log.d("Poster url", i.getStringExtra("poster_url"));
        Picasso.with(getApplicationContext()).load("http://image.tmdb.org/t/p/w500" + i.getStringExtra("poster_url")).into(iv);
        ((TextView)findViewById(R.id.title_content)).setText(i.getStringExtra("title"));
        ((TextView)findViewById(R.id.release_date_content)).setText(i.getStringExtra("release_date"));
        ((TextView)findViewById(R.id.vote_avg_content)).setText(i.getStringExtra("vote_avg"));
        ((TextView)findViewById(R.id.plot_synopsis_content)).setText(i.getStringExtra("plot_synopsis"));


    }



}
