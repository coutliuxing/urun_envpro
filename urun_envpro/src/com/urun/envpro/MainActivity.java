package com.urun.envpro;

import java.util.ArrayList;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.urun.envpro.adapter.TabPageIndicatorAdapter;
import com.urun.envpro.base.BaseFragment;
import com.urun.envpro.bean.GetObject;
import com.viewpagerindicator.TabPageIndicator;

public class MainActivity extends FragmentActivity implements OnClickListener {

	private View mActionBar;
	private ViewPager mContentVp;
	private ArrayList<BaseFragment> mFragments;
	private TabPageIndicatorAdapter mAdapter;
	private TabPageIndicator mChannelTpi;
	private RadioGroup mTabRg;
	private DrawerLayout mDrawerLlyt;
	private ImageButton mIconIbtn;
	private RadioButton mSuperviseRb;
	private RadioButton mRegulationRb;
	private RadioButton mDynamicRb;
	private RadioButton mReportRb;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initActionBar();

		findViews();
		
		setListener();

		mAdapter = new TabPageIndicatorAdapter(getSupportFragmentManager(), GetObject.getChannels(GetObject.CHANNEL_SUPERVISE));
		mContentVp.setAdapter(mAdapter);

		mChannelTpi.setViewPager(mContentVp);

//		mTabRg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//
//			@Override
//			public void onCheckedChanged(RadioGroup group, int checkedId) {
//				switch (checkedId) {
//				case 0:
//					mAdapter.updateChannel(GetObject.getChannels(GetObject.CHANNEL_SUPERVISE));
//					Toast.makeText(MainActivity.this, "11", Toast.LENGTH_LONG).show();
//					break;
//
//				case 1:
//					mAdapter.updateChannel(GetObject.getChannels(GetObject.CHANNEL_REGULATION));
//					Toast.makeText(MainActivity.this, "11", Toast.LENGTH_LONG).show();
//					break;
//				case 2:
//					mAdapter.updateChannel(GetObject.getChannels(GetObject.CHANNEL_DYNAMIC));
//					Toast.makeText(MainActivity.this, "11", Toast.LENGTH_LONG).show();
//					break;
//				case 3:
//					mAdapter.updateChannel(GetObject.getChannels(GetObject.CHANNEL_REPORT));
//					Toast.makeText(MainActivity.this, "11", Toast.LENGTH_LONG).show();
//					break;
//
//				default:
//					break;
//				}
//			}
//		});
	}

	private void setListener() {
		mIconIbtn.setOnClickListener(this);
		mSuperviseRb.setOnClickListener(this);
		mRegulationRb.setOnClickListener(this);
		mDynamicRb.setOnClickListener(this);
		mReportRb.setOnClickListener(this);
	}

	private void initFragments() {
		mFragments = new ArrayList<BaseFragment>(); 
		for (int i = 0; i < 6; i++) {
			BaseFragment fragment =  new BaseFragment();
			Bundle bundle = new Bundle();
			bundle.putString("content", "栏目" + i);
			fragment.setArguments(bundle);
			mFragments.add(fragment);
		}
	}

	private void initActionBar() {
		ActionBar actionBar = getActionBar();
		actionBar.setCustomView(R.layout.main_content_header);
		actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
		actionBar.setDisplayShowCustomEnabled(true);
		actionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.bg_actionbar));
		mActionBar = actionBar.getCustomView();
	}

	private void findViews() {
		mDrawerLlyt = (DrawerLayout) findViewById(R.id.main_dlyt_drawer);
		mIconIbtn = (ImageButton) findViewById(R.id.header_ibtn_icon);
		mChannelTpi = (TabPageIndicator) findViewById(R.id.header_tpi_channel);
		mContentVp = (ViewPager) findViewById(R.id.main_vp_content);
		mTabRg = (RadioGroup) findViewById(R.id.footer_rg_tab);
		
		mSuperviseRb = (RadioButton) findViewById(R.id.footer_rb_supervise);
		mRegulationRb = (RadioButton) findViewById(R.id.footer_rb_regulation);
		mDynamicRb = (RadioButton) findViewById(R.id.footer_rb_dynamic);
		mReportRb = (RadioButton) findViewById(R.id.footer_rb_report);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.footer_rb_supervise:
			mAdapter.updateChannel(GetObject.getSuperviseChannels());
			Toast.makeText(MainActivity.this, "11", Toast.LENGTH_LONG).show();
			break;

		case R.id.footer_rb_regulation:
			mAdapter.updateChannel(GetObject.getRegulationChannels());
			Toast.makeText(MainActivity.this, "22", Toast.LENGTH_LONG).show();
			break;
			
		case R.id.footer_rb_dynamic:
			mAdapter.updateChannel(GetObject.getDynamicChannels());
			Toast.makeText(MainActivity.this, "33", Toast.LENGTH_LONG).show();
			break;
			
		case R.id.footer_rb_report:
			mAdapter.updateChannel(GetObject.getReportChannels());
			Toast.makeText(MainActivity.this, "44", Toast.LENGTH_LONG).show();
			break;

		case R.id.header_ibtn_icon:
			if (mDrawerLlyt.isDrawerOpen(Gravity.START)) {
				mDrawerLlyt.closeDrawer(Gravity.START);
			} else {
				mDrawerLlyt.openDrawer(Gravity.START);
			}
			break;
		default:
			break;
		}
	}


}
