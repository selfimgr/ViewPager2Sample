package com.chaowen.androidviewpager2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ViewPager2 mviewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mviewPager2 = findViewById(R.id.viewpager2);
        List<String> list = new ArrayList<>();
        list.add("页面一");
        list.add("页面二");
        list.add("页面三");
        list.add("页面四");


        mviewPager2.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);

        mviewPager2.setAdapter(new ViewPagerAdapter(this, list, mviewPager2));

    }
}
