package com.innerglow.dosugnavigator;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.innerglow.dosugnavigator.libs.SessionMngr;
import com.innerglow.dosugnavigator.picker.DatePicker;
import com.innerglow.dosugnavigator.picker.DatePicker.DateWatcher;

import java.util.Calendar;

/**
 * Created by innerglowitsolutions on 08/08/14.
 */
public class AgeValidationActivity extends Activity implements DateWatcher{

    SessionMngr session;
    Button ButtonConfirm;
    TextView Txt_main_msg;
    EditText EditDate;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getActionBar();
        assert actionBar != null;
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setIcon(android.R.color.transparent);
        setContentView(R.layout.activity_age);
        session = new SessionMngr(getApplicationContext());
//        DosugNavigatorApplication.exception_handler_home(this);
        ButtonConfirm = (Button) findViewById(R.id.btnConfirm);
        Txt_main_msg = (TextView) findViewById(R.id.ConfirmMsg);


//        DpsControlApplication.exception_handler(this);
//        String user = session.getStringValues("userName");

        Typeface type = Typeface.createFromAsset(this.getAssets(), "arlekino.TTF");
        Txt_main_msg.setTypeface(type, Typeface.BOLD);

        DatePicker d = (DatePicker) findViewById(R.id.datePicker1);
        d.setDateChangedListener(this);

        ButtonConfirm.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                session.setIntroValues(1);
                Intent i = new Intent(AgeValidationActivity.this, HomeActivity.class);
                startActivity(i);
            }
        });

        try {
            d.setStartYear(1900);
            d.setEndYear(2014);
        } catch (Exception e) {
            Log.e("", e.toString());
        }

//        TimePicker t = (TimePicker) findViewById(R.id.timePicker2);
//        t.setTimeChangedListener(this);
//        t.setCurrentTimeFormate(TimePicker.HOUR_12);
//        t.setAMPMVisible(true);
    }

    @Override
    public void onDateChanged(Calendar c) {
        Log.e("",
                "" + c.get(Calendar.MONTH) + " " + c.get(Calendar.DAY_OF_MONTH)
                        + " " + c.get(Calendar.YEAR));
    }

//    @Override
//    public void onTimeChanged(int h, int m, int am_pm) {
//        Log.e("", "" + h + " " + m + " " + am_pm);
//    }



    /*@Override
    public boolean onOptionsItemSelected(MenuItem menuItem)
    {
        finish();
        Intent i = new Intent(this, WelcomeActivity.class);
        startActivity(i);
        return true;
    }*/

}