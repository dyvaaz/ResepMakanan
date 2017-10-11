package com.example.d2a.menumakanan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by D2A on 10/11/2017.
 */

public class Data extends AppCompatActivity {
    ImageView gambar;
    TextView pembuatan;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        Intent in = getIntent();

        gambar = (ImageView) findViewById(R.id.data_image);
        gambar.setImageResource(in.getIntExtra("gambar",0));

        pembuatan = (TextView) findViewById(R.id.pembuatan);
        pembuatan.setText(in.getStringExtra("pembuatan"));


        getSupportActionBar().setTitle(in.getStringExtra("resep.judul"));

    }

}
