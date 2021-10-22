package com.example.s2onegroup.adapter;/*
 * @ClassName FragmentAdapter
 * @Description TODO
 * @Author 海300
 * @Date 2021/10/19 16:00
 * @Version 1.0
 * When I wrote this, only God and I understood what I was doing.
 * Now,God only knows.
 * This code sucks, You Konw it and I Konw it.
 */

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class FragmentAdapter extends FragmentPagerAdapter {
    List<Fragment> list;
    List<String> text;

    public FragmentAdapter( FragmentManager fm, List<Fragment> list, List<String> text) {
        super(fm);
        this.list = list;
        this.text = text;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return text.get(position);
    }
}
