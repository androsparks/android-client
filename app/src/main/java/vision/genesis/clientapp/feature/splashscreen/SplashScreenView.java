package vision.genesis.clientapp.feature.splashscreen;

import com.arellomobile.mvp.MvpView;

/**
 * GenesisVision
 * Created by Vitaly on 1/18/18.
 */

public interface SplashScreenView extends MvpView
{
	void showLockScreen();

	void showMainActivity();

	void showNetworkError();

	void showServerError();

	void showProgress(boolean show);
}
