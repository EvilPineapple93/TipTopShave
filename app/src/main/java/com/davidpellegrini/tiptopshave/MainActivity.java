package com.davidpellegrini.tiptopshave;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    ScrollView tip1Body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

        tip1Body = (ScrollView) findViewById(R.id.tip1Body);
        tip1Body.setVisibility(View.GONE);
    }

    public void toggleContents(View view){
        tip1Body.setVisibility(tip1Body.isShown() ? View.GONE : View.VISIBLE);
    }
}
