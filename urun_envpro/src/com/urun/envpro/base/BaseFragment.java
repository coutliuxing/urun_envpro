package com.urun.envpro.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.urun.envpro.R;

public class BaseFragment extends Fragment {

	private View mView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		mView = inflater.inflate(R.layout.fragment_base, null);
		
		Bundle bundle = getArguments();
		String content = bundle.getString("content");
		
		TextView contentTv = (TextView) mView.findViewById(R.id.base_tv_content);
		contentTv.setText(content);
		return mView;
	}
}
