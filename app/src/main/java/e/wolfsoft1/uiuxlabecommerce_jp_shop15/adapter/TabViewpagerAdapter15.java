package e.wolfsoft1.uiuxlabecommerce_jp_shop15.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import e.wolfsoft1.uiuxlabecommerce_jp_shop15.fragment.Fragment_Jumper15;

public class TabViewpagerAdapter15 extends FragmentPagerAdapter {
    private final int tabCount;

    public TabViewpagerAdapter15(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount=tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;

        switch (position){
            case 0:
                fragment=new Fragment_Jumper15();
                break;
            case 1:
                fragment=new Fragment_Jumper15();
                break;
            case 2:
                fragment=new Fragment_Jumper15();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
