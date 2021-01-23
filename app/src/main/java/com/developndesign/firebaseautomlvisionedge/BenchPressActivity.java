package com.developndesign.firebaseautomlvisionedge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ListView;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

public class BenchPressActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bench_press);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Benchpress");


        StringBuilder stringBuilder = new StringBuilder();

        String Benchpressinfo = ("");


//        InputStream stream = null;
//        try {
//            stream = getAssets().open("benchpress.gif");
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        GifWebView view = new GifWebView(this,"file://android_assest   /benchpress.gif");
//
//        setContentView(view);


//        list=findViewById(R.id.list_Workouts);
//        ActivityCustomListView customListView=new ActivityCustomListView(this, workoutName, workoutReps, imgid);
//        list.setAdapter(customListView);

    }
}
