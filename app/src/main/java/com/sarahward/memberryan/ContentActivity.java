package com.sarahward.memberryan;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.security.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class ContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acivity_content);

        // Convert time to week number-++++++
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        int weekOfYear = calendar.get(GregorianCalendar.WEEK_OF_YEAR);
        Log.v("test", "week of year = " + weekOfYear);

        TextView show = (TextView) findViewById(R.id.showstory);
        String toDisplay;
        if (weekOfYear == 52) {
            toDisplay = getResources().getString(R.string.tomone);
        } else if (weekOfYear == 1) {
            toDisplay = getResources().getString(R.string.palione);
        } else if (weekOfYear == 2) {
            toDisplay = getResources().getString(R.string.joeone);
        } else if (weekOfYear == 3) {
            toDisplay = getResources().getString(R.string.jadeone);
        } else if (weekOfYear == 4) {
            toDisplay = getResources().getString(R.string.amyone);
        } else if (weekOfYear == 5) {
            toDisplay = getResources().getString(R.string.barryone);
        } else if (weekOfYear == 6) {
            toDisplay = getResources().getString(R.string.ianone);
        } else if (weekOfYear == 7) {
            toDisplay = getResources().getString(R.string.palitwo);
        } else if (weekOfYear == 8) {
            toDisplay = getResources().getString(R.string.jadetwo);
        } else if (weekOfYear == 9) {
            toDisplay = getResources().getString(R.string.joetwo);
        } else if (weekOfYear == 10) {
            toDisplay = getResources().getString(R.string.shabs);
        } else if (weekOfYear == 11) {
            toDisplay = getResources().getString(R.string.barrytwo);
        } else if (weekOfYear == 12) {
            toDisplay = getResources().getString(R.string.tomtwo);
        } else if (weekOfYear == 13) {
            toDisplay = getResources().getString(R.string.jadethree);
        } else if (weekOfYear == 14) {
            toDisplay = getResources().getString(R.string.sarahone);
        } else if (weekOfYear == 15) {
            toDisplay = getResources().getString(R.string.james);
        } else if (weekOfYear == 16) {
            toDisplay = getResources().getString(R.string.mikeone);
        } else if (weekOfYear == 17) {
            toDisplay = getResources().getString(R.string.wardakone);
        } else if (weekOfYear == 18) {
            toDisplay = getResources().getString(R.string.jadefour);
        } else if (weekOfYear == 19) {
            toDisplay = getResources().getString(R.string.palithree);
        } else if (weekOfYear == 20) {
            toDisplay = getResources().getString(R.string.joethree);
        } else if (weekOfYear == 21) {
            toDisplay = getResources().getString(R.string.mumone);
        } else if (weekOfYear == 22) {
            toDisplay = getResources().getString(R.string.sarahtwo);
        } else if (weekOfYear == 23) {
            toDisplay = getResources().getString(R.string.tomthree);
        } else if (weekOfYear == 24) {
            toDisplay = getResources().getString(R.string.jadefive);
        } else if (weekOfYear == 25) {
            toDisplay = getResources().getString(R.string.wardaktwo);
        } else if (weekOfYear == 26) {
            toDisplay = getResources().getString(R.string.miketwo);
        } else if (weekOfYear == 27) {
            toDisplay = getResources().getString(R.string.sarahthree);
        } else if (weekOfYear == 28) {
            toDisplay = getResources().getString(R.string.joefour);
        } else if (weekOfYear == 29) {
            toDisplay = getResources().getString(R.string.palifour);
        } else if (weekOfYear == 30) {
            toDisplay = getResources().getString(R.string.mumtwo);
        } else if (weekOfYear == 31) {
            toDisplay = getResources().getString(R.string.tomfour);
        } else if (weekOfYear == 32) {
            toDisplay = getResources().getString(R.string.mumthree);
        } else if (weekOfYear == 33) {
            toDisplay = getResources().getString(R.string.wardakthree);
        } else if (weekOfYear == 34) {
            toDisplay = getResources().getString(R.string.jackone);
        } else if (weekOfYear == 35) {
                toDisplay = getResources().getString(R.string.jacktwo);
        } else if (weekOfYear == 36) {
            toDisplay = getResources().getString(R.string.jackthree);
        } else if (weekOfYear == 37) {
            toDisplay = getResources().getString(R.string.jackfour);
        } else if (weekOfYear == 38) {
            toDisplay = getResources().getString(R.string.jackfive);
        } else if (weekOfYear == 39) {
            toDisplay = getResources().getString(R.string.jacksix);
        } else if (weekOfYear == 35) {
            toDisplay = getResources().getString(R.string.jackseven);
        } else {
            toDisplay = "Wahoo";
        }

        show.setText(toDisplay);
    }

}

