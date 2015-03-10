package com.urun.envpro.adapter;

import java.util.ArrayList;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import com.urun.envpro.base.BaseFragment;

public class TabPageIndicatorAdapter extends FragmentPagerAdapter {
	
	private ArrayList<BaseFragment> mFragments;

	public TabPageIndicatorAdapter(FragmentManager fm, ArrayList<BaseFragment> fragments) {
		super(fm);
		mFragments = fragments;
	}

	@Override
	public int getCount() {
		return mFragments.size();
	}

	@Override
	public BaseFragment getItem(int position) {
		return mFragments.get(position);
	}
	
	@Override
	public CharSequence getPageTitle(int position) {
		return mFragments.get(position).getArguments().getString("content");
	}
	
	public void updateChannel(ArrayList<BaseFragment> fragments) {
		mFragments.clear();
		mFragments.addAll(fragments);
		notifyDataSetChanged();
		Log.d("wind", "aaaaaa");
	}

}
