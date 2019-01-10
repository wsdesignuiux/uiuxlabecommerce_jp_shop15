package e.wolfsoft1.uiuxlabecommerce_jp_shop15.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import e.wolfsoft1.uiuxlabecommerce_jp_shop15.fragment.Fragmemt_Viewpager_shop15;


public class ViewpagerAdapter_Shop15 extends FragmentPagerAdapter {
    public ViewpagerAdapter_Shop15(FragmentManager fm, int i) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;
        switch (i) {
            case 0:
                fragment = new Fragmemt_Viewpager_shop15();
                break;
            case 1:
                fragment = new Fragmemt_Viewpager_shop15();
                break;
            case 2:
                fragment = new Fragmemt_Viewpager_shop15();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
