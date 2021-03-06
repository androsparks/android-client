package vision.genesis.clientapp.utils;

import android.app.Activity;
import android.os.Build;

import androidx.core.content.ContextCompat;

/**
 * GenesisVisionAndroid
 * Created by Vitaly on 28/06/2018.
 */
public class StatusBarUtil
{
	public static void setColorResId(Activity activity, int color) {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
			activity.getWindow().setStatusBarColor(ContextCompat.getColor(activity, color));
		}
	}

	public static void setColor(Activity activity, int color) {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
			activity.getWindow().setStatusBarColor(color);
		}
	}

	public static int getColor(Activity activity) {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
			return activity.getWindow().getStatusBarColor();
		}
		return 0;
	}
}
