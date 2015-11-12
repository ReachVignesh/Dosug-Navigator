package com.innerglow.dosugnavigator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.innerglow.dosugnavigator.libs.SessionMngr;

/**
 * Created by innerglowitsolutions on 08/08/14.
 */
public class SessionActivity extends Activity {

    SessionMngr session;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        DosugNavigatorApplication.exception_handler_home(this);

        session = new SessionMngr(getApplicationContext());

        if(session.IsLoggedIn()){
            openDashboard();
        }
        finish();
    }

    public void openDashboard(){
        Intent dashboard = new Intent(getApplicationContext(), HomeActivity.class);

        // Close all views before launching Dashboard
        dashboard.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        dashboard.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(dashboard);
    }

}