package com.example.whatsup.pagers;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class MyPageAdapter extends FragmentPagerAdapter {
//    Fragment fragment;
//    String string;
    List<Fragment> mfragmentsList =new ArrayList<>();
    List<String> mfragmentTitleList =new ArrayList<>();

    //constructor
    public MyPageAdapter(@NonNull @org.jetbrains.annotations.NotNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public Fragment getItem(int position) {
        return mfragmentsList.get(position);
    }

    @Override
    public int getCount() {
        return mfragmentsList.size();
    }
    public void addFrag(Fragment fragment,String title){
        mfragmentsList.add(fragment);
        mfragmentTitleList.add(title);
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mfragmentTitleList.get(position);
    }

}
