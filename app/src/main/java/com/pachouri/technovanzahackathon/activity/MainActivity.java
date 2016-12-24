package com.pachouri.technovanzahackathon.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;

import com.pachouri.technovanzahackathon.R;
import com.pachouri.technovanzahackathon.directory.HomeMenuAdapter;
import java.util.ArrayList;
import com.pachouri.technovanzahackathon.adapter.MainViewPagerAdapter;
import com.pachouri.technovanzahackathon.fragment.MusicFragment;
import com.pachouri.technovanzahackathon.fragment.NewsFragment;
public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    RecyclerView recyclerView;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);

        recyclerView = (RecyclerView) findViewById(R.id.rv_home_menu);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        setViewPager(viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
        initViews();
    }

    private void initViews() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Technovanza Hackathon");
        toolbar.setTitleTextColor(Color.WHITE);

        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(
                this,  drawerLayout, toolbar,
                R.string.something, R.string.something);
        drawerLayout.setDrawerListener(mDrawerToggle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        mDrawerToggle.syncState();

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(new HomeMenuAdapter(getApplicationContext(),getMenuString(),getImageList()));
    }

    private ArrayList<Integer> getImageList(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(R.drawable.ic_share_black);
        arrayList.add(R.drawable.ic_send_black);

        return arrayList;
    }

    private ArrayList<String> getMenuString(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Share");
        arrayList.add("Feedback");

        return arrayList;
    }

    private void setViewPager(ViewPager viewPager) {
        MainViewPagerAdapter pagerAdapter = new MainViewPagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragmentToViewPager(new MusicFragment(), getString(R.string.tab_title_music));
        pagerAdapter.addFragmentToViewPager(new NewsFragment(), getString(R.string.tab_title_news));
        viewPager.setAdapter(pagerAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case android.R.id.home:
                drawerLayout.openDrawer(Gravity.LEFT);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
