package com.innerglow.dosugnavigator.picker;

import android.app.Activity;
import android.os.Bundle;
import com.innerglow.dosugnavigator.picker.DatePicker.DateWatcher;
import com.innerglow.dosugnavigator.picker.TimePicker.TimeWatcher;
import android.util.Log;
import com.innerglow.dosugnavigator.R;

import java.util.Calendar;

public class DateTimePickerActivity extends Activity implements DateWatcher, TimeWatcher {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		DatePicker d = (DatePicker) findViewById(R.id.datePicker1);
		d.setDateChangedListener(this);

		try {
			d.setStartYear(1900);
			d.setEndYear(2014);
		} catch (Exception e) {
			Log.e("", e.toString());
		}

		TimePicker t = (TimePicker) findViewById(R.id.timePicker2);
		t.setTimeChangedListener(this);
		t.setCurrentTimeFormate(TimePicker.HOUR_12);
		t.setAMPMVisible(true);
	}

	@Override
	public void onDateChanged(Calendar c) {
		Log.e("",
                "" + c.get(Calendar.MONTH) + " " + c.get(Calendar.DAY_OF_MONTH)
                        + " " + c.get(Calendar.YEAR));
	}

	@Override
	public void onTimeChanged(int h, int m, int am_pm) {
		Log.e("", "" + h + " " + m + " " + am_pm);
	}

}
