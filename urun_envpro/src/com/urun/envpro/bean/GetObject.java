package com.urun.envpro.bean;

import java.util.ArrayList;

import android.os.Bundle;

import com.urun.envpro.base.BaseFragment;

public class GetObject {

	public static final int CHANNEL_SUPERVISE = 0;
	public static final int CHANNEL_REGULATION = 1;
	public static final int CHANNEL_DYNAMIC = 2;
	public static final int CHANNEL_REPORT = 3;

	public static ArrayList<BaseFragment> getChannels(int type) {
		ArrayList<BaseFragment> mFragments = new ArrayList<BaseFragment>(); 

		switch (type) {
		case CHANNEL_SUPERVISE:
			mFragments.clear();
			for (int i = 0; i < 6; i++) {
				BaseFragment fragment =  new BaseFragment();
				Bundle bundle = new Bundle();
				bundle.putString("content", "监管栏目" + i);
				fragment.setArguments(bundle);
				mFragments.add(fragment);
			}
			break;
			
		case CHANNEL_REGULATION:
			mFragments.clear();
			for (int i = 0; i < 6; i++) {
				BaseFragment fragment =  new BaseFragment();
				Bundle bundle = new Bundle();
				bundle.putString("content", "法规栏目" + i);
				fragment.setArguments(bundle);
				mFragments.add(fragment);
			}
			break;
			
		case CHANNEL_DYNAMIC:
			mFragments.clear();
			for (int i = 0; i < 6; i++) {
				BaseFragment fragment =  new BaseFragment();
				Bundle bundle = new Bundle();
				bundle.putString("content", "动态栏目" + i);
				fragment.setArguments(bundle);
				mFragments.add(fragment);
			}
			break;
			
		case CHANNEL_REPORT:
			mFragments.clear();
			for (int i = 0; i < 6; i++) {
				BaseFragment fragment =  new BaseFragment();
				Bundle bundle = new Bundle();
				bundle.putString("content", "报告栏目" + i);
				fragment.setArguments(bundle);
				mFragments.add(fragment);
			}
			break;

		default:
			break;
		}

		return mFragments;
	}
	
	public static ArrayList<BaseFragment> getSuperviseChannels() {
		ArrayList<BaseFragment> mFragments = new ArrayList<BaseFragment>(); 
		
		for (int i = 0; i < 6; i++) {
			BaseFragment fragment =  new BaseFragment();
			Bundle bundle = new Bundle();
			bundle.putString("content", "企业监管栏目" + i);
			fragment.setArguments(bundle);
			mFragments.add(fragment);
		}
		
		return mFragments;
	}

	public static ArrayList<BaseFragment> getRegulationChannels() {
		ArrayList<BaseFragment> mFragments = new ArrayList<BaseFragment>(); 
		
		for (int i = 0; i < 6; i++) {
			BaseFragment fragment =  new BaseFragment();
			Bundle bundle = new Bundle();
			bundle.putString("content", "政策法规栏目" + i);
			fragment.setArguments(bundle);
			mFragments.add(fragment);
		}
		
		return mFragments;
	}
	
	public static ArrayList<BaseFragment> getDynamicChannels() {
		ArrayList<BaseFragment> mFragments = new ArrayList<BaseFragment>(); 
		
		for (int i = 0; i < 6; i++) {
			BaseFragment fragment =  new BaseFragment();
			Bundle bundle = new Bundle();
			bundle.putString("content", "行业动态栏目" + i);
			fragment.setArguments(bundle);
			mFragments.add(fragment);
		}
		
		return mFragments;
	}
	
	public static ArrayList<BaseFragment> getReportChannels() {
		ArrayList<BaseFragment> mFragments = new ArrayList<BaseFragment>(); 
		
		for (int i = 0; i < 6; i++) {
			BaseFragment fragment =  new BaseFragment();
			Bundle bundle = new Bundle();
			bundle.putString("content", "报告栏目" + i);
			fragment.setArguments(bundle);
			mFragments.add(fragment);
		}
		
		return mFragments;
	}

}
