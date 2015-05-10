package com.example.tanloc.pcremote.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.tanloc.pcremote.R;

/**
 * Created by tanloc on 4/25/15.
 */
public class MainActivity extends FragmentActivity {
    ViewPager viewPager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
        viewPager = (ViewPager) findViewById(R.id.pager);
        FragmentManager fragmentManager = getSupportFragmentManager();
        viewPager.setAdapter(new MyAdapter(fragmentManager));
    }

    public void onLeftClick(View view) {
        Toast.makeText(this, "Left Click", Toast.LENGTH_SHORT).show();
    }

    public void onRightClick(View view) {
        Toast.makeText(this, "Right Click", Toast.LENGTH_SHORT).show();
    }
}

class MyAdapter extends FragmentPagerAdapter {
    String titles[] = {"HOME", "MOUSE CONTROL", "KEYBOARD CONTROL", "PRESENTATION CONTROL","POWER CONTROL","PLAYER CONTROL"};

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Log.d("FRAGMENT", "Item is called " + i);
        Fragment fragment = null;
        if (i == 0)
            fragment = new HomeFragment();
        if (i == 1)
            fragment = new MouseFragment();
        if (i == 2)
            fragment = new KeyboardFragment();
        if (i == 3)
            fragment = new PresentationFragment();
        if (i == 4)
            fragment = new PowerFragment();

        return fragment;
    }

    @Override
    public int getCount() {
        Log.d("FRAGMENT", "Count is called ");
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
