package com.example.shreeghanesh.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shreeghanesh on 7/4/18.
 */

public class ViewPagert extends FragmentPagerAdapter {
    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> titlelist = new ArrayList<>();
    public ViewPagert(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titlelist.get(position);
    }

    public void addFragment(Fragment fragment,String title)
    {
        fragmentList.add(fragment);
        titlelist.add(title);
    }
}
