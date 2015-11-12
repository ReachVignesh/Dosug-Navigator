package util;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

public class DosugNavigatorApplication extends Application {

	SharedPreferences preferences;
	DosugNavigatorApplication application;

	public SharedPreferences getPreferences() {
		return preferences;
	}

	public void setPreferences(SharedPreferences preferences) {
		this.preferences = preferences;
	}

	Context context;

	@Override
	public void onCreate() {
		super.onCreate();

		context = this;
		application = this;
		preferences = getSharedPreferences("dosugnavigator", 0);

	}

//    public static void exception_handler(Activity act) {
//        Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler(act));
//    }
//
//    public static void exception_handler_home(Activity act) {
//        Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler_home(act));
//    }

}
