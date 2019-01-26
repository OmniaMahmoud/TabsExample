package com.example.nh.tabsexample;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener{

    private TabLayout tabs;
    private FirstFragment firstFragment;
    private SecondFragment secondFragment;
    private ThirdFragment thirdFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabs = findViewById(R.id.tabs);
        tabs.addTab(tabs.newTab().setText("Tab 1"));
        tabs.addTab(tabs.newTab().setText("Tab 2"));
        tabs.addTab(tabs.newTab().setText("Tab 3"));
        tabs.addOnTabSelectedListener(this);
        firstFragment = new FirstFragment();
        secondFragment = new SecondFragment();
        thirdFragment = new ThirdFragment();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.main_frame,firstFragment);
        ft.commit();
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        switch (tab.getPosition()){
            case 0:
                ft.replace(R.id.main_frame,firstFragment);
                ft.commit();
                break;
            case 1:
                ft.replace(R.id.main_frame,secondFragment);
                ft.commit();
                break;
            case 2:
                ft.replace(R.id.main_frame,thirdFragment);
                ft.commit();
                break;
        }
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
