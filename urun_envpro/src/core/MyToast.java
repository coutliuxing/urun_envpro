package core;

import android.content.Context;
import android.os.Looper;
import android.widget.Toast;

//Toast显示一次
public class MyToast {
	private static Toast mToast;

	public static void showToast(final Context context, final String msg,
			final int duration) {

		Thread th = new Thread() {
			@Override
			public void run() {
				Looper.prepare();
				// TODO Auto-generated method stub
				if (mToast != null) {
					mToast.cancel();

				}
				mToast = Toast.makeText(context, msg, duration);

				mToast.show();
				Looper.loop();
			}
		};

		th.start();

		// Toast.makeText(context, msg, duration).show();
	}
}
