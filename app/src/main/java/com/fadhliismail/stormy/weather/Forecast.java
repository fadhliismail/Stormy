package com.fadhliismail.stormy.weather;

import com.fadhliismail.stormy.R;

/**
 * Created by Fadhli Ismail on 16/10/2016.
 */

public class Forecast {
    private Current mCurrentForecast;
    private Day[] mDaysForecast;
    private Hour[] mHoursForecast;

    public Current getCurrentForecast() {
        return mCurrentForecast;
    }

    public void setCurrentForecast(Current currentForecast) {
        mCurrentForecast = currentForecast;
    }

    public Day[] getDaysForecast() {
        return mDaysForecast;
    }

    public void setDaysForecast(Day[] daysForecast) {
        mDaysForecast = daysForecast;
    }

    public Hour[] getHoursForecast() {
        return mHoursForecast;
    }

    public void setHoursForecast(Hour[] hoursForecast) {
        mHoursForecast = hoursForecast;
    }

    public static int getIconId(String mIcon) {
        int iconId = R.drawable.clear_day;

        if (mIcon.equals("clear-day")) {
            iconId = R.drawable.clear_day;
        }
        else if (mIcon.equals("clear-night")) {
            iconId = R.drawable.clear_night;
        }
        else if (mIcon.equals("rain")) {
            iconId = R.drawable.rain;
        }
        else if (mIcon.equals("snow")) {
            iconId = R.drawable.snow;
        }
        else if (mIcon.equals("sleet")) {
            iconId = R.drawable.sleet;
        }
        else if (mIcon.equals("wind")) {
            iconId = R.drawable.wind;
        }
        else if (mIcon.equals("fog")) {
            iconId = R.drawable.fog;
        }
        else if (mIcon.equals("cloudy")) {
            iconId = R.drawable.cloudy;
        }
        else if (mIcon.equals("partly-cloudy-day")) {
            iconId = R.drawable.partly_cloudy;
        }
        else if (mIcon.equals("partly-cloudy-night")) {
            iconId = R.drawable.cloudy_night;
        }

        return iconId;
    }
}
