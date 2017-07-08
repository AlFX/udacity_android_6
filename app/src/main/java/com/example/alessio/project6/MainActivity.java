package com.example.alessio.project6;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*setup the ViewPager (swipe through fragments)
        * defined in XML*/
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        /*this Custom Adapter associates screen positions to fragments
        * defined in CategoryAdapter.java*/
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());

        /*connect the ViewPager to the Custom Adapter*/
        viewPager.setAdapter(adapter);

        /*setup the TabLayout (upper bar to jump through fragments)*/
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        /*connect TabLayout to the ViewPager*/
        tabLayout.setupWithViewPager(viewPager);
    }
}

/*check out this funny little comment*/