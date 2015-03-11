package com.urun.envpro.side.adapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class WebAdapter extends BaseAdapter{


		private Context context;
		private JSONArray jsonArray;
		private int type ;

		public WebAdapter(Context context, JSONArray jsonArray,int type) {
			// TODO Auto-generated constructor stub
			this.context = context;
			this.jsonArray = jsonArray;
			this.type = type;

		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return jsonArray.length();
		}

		@Override
		public Object getItem(int arg0) {
			// TODO Auto-generated method stub

			JSONObject jo = null;
			try {
				jo = (JSONObject) jsonArray.get(arg0);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return jo;
		}

		@Override
		public long getItemId(int arg0) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int arg0, View arg1, ViewGroup arg2) {
			// TODO Auto-generated method stub
			
			
			
			return null;
		}

	}

