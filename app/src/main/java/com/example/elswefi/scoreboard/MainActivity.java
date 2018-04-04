package com.example.elswefi.scoreboard;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends ListActivity {
    private Hole[] mHoles = new Hole[18];
    private ListAdapter mListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int stroke = 0;
        for (int i = 0 ; i<mHoles.length ; i++) {
            mHoles[i] = new Hole(stroke,"Hole " + (i+1) +" :");
        }

        mListAdapter = new ListAdapter(this, mHoles);
        setListAdapter(mListAdapter);

    }
}
