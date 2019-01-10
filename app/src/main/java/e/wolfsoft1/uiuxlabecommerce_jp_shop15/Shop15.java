package e.wolfsoft1.uiuxlabecommerce_jp_shop15;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.viewpagerindicator.LinePageIndicator;

import e.wolfsoft1.uiuxlabecommerce_jp_shop15.adapter.TabViewpagerAdapter15;
import e.wolfsoft1.uiuxlabecommerce_jp_shop15.adapter.ViewpagerAdapter_Shop15;
import e.wolfsoft1.uiuxlabecommerce_jp_shop15.adapter.WrapContentHeightViewPager;

public class Shop15 extends AppCompatActivity {

    ViewPager viewPager15;
    WrapContentHeightViewPager viewpager_tab15;
    LinePageIndicator indicator_line;
    TabLayout tabLayout15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop15);

        indicator_line = findViewById(R.id.indicator_line);
        viewPager15 = findViewById(R.id.viewpager15);
        tabLayout15 = findViewById(R.id.tablayout15);
        viewpager_tab15 = findViewById(R.id.viewpager_tab15);

        ViewpagerAdapter_Shop15 viewpagerAdapterShop15 = new ViewpagerAdapter_Shop15(getSupportFragmentManager(), 3);
        viewPager15.setAdapter(viewpagerAdapterShop15);
        indicator_line.setViewPager(viewPager15);

        tabLayout15.addTab(tabLayout15.newTab().setText("Sweater"));
        tabLayout15.addTab(tabLayout15.newTab().setText("Jumper"));
        tabLayout15.addTab(tabLayout15.newTab().setText("Jackets"));

        TabViewpagerAdapter15 adapter = new TabViewpagerAdapter15(getSupportFragmentManager(), tabLayout15.getTabCount());
        viewpager_tab15.setAdapter(adapter);

        viewpager_tab15.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout15));

        tabLayout15.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager_tab15.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

}


