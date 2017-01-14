package com.jp.pikason08.imagealpha;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.tab_layout)
    TabLayout tabLayout;
    @BindView(R.id.view_pager)
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initView();
    }

    private void initView(){
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        FragmentManager manager = getSupportFragmentManager();
        MainPagerAdapter adapter = new MainPagerAdapter(manager);
        viewPager.setAdapter(adapter);
        tabLayout.setTabTextColors(getResources().getColor(R.color.unselect_tab), getResources().getColor(R.color.white));
        tabLayout.setupWithViewPager(viewPager);
    }
}
