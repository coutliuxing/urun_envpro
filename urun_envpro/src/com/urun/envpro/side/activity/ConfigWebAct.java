package com.urun.envpro.side.activity;

import com.urun.envpro.R;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

public class ConfigWebAct extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.config_web_act);
		initActionBar();
	}

	private void initActionBar() {
		ActionBar actionBar = getActionBar();
		actionBar.setCustomView(R.layout.config_web_actionbar);
		actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
		actionBar.setDisplayShowCustomEnabled(true);
		actionBar.setBackgroundDrawable(getResources().getDrawable(
				R.drawable.bg_actionbar));
	}
}
