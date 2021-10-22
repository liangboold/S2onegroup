package com.example.s2onegroup.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import com.example.s2onegroup.R;
import com.example.s2onegroup.adapter.FragmentAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;


public class SofaFragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    View inflate;
    List<Fragment> list;
    List<String> text;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        inflate = inflater.inflate(R.layout.fragment_sofa, container, false);
        initView();
        list = new ArrayList<>();
        text = new ArrayList<>();
        list.add(new PictureFragment());
        list.add(new VideoFragment());
        list.add(new TextFragment());
        text.add("图片");
        text.add("视频");
        text.add("文本");
        FragmentAdapter fragmentAdapter = new FragmentAdapter(getActivity().getSupportFragmentManager(),list,text);
        viewPager.setAdapter(fragmentAdapter);
        tabLayout.setupWithViewPager(viewPager);

        return inflate;

    }

    private void initView() {
        tabLayout = (TabLayout)inflate.findViewById(R.id.tab_layout);
        viewPager = (ViewPager) inflate.findViewById(R.id.view_pager);
    }
}