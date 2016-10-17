package com.fadhliismail.stormy.weather;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Fadhli Ismail on 16/10/2016.
 */

public class Hour implements Parcelable {
    private long mTime;
    private String mSummary;
    private double mTemperature;
    private String mIconId;
    private String mTimezone;

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public double getTemperature() {
        return mTemperature;
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    public String getIconId() {
        return mIconId;
    }

    public void setIconId(String iconId) {
        mIconId = iconId;
    }

    public String getTimezone() {
        return mTimezone;
    }

    public void setTimezone(String timezone) {
        mTimezone = timezone;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(mTime);
        dest.writeString(mSummary);
        dest.writeDouble(mTemperature);
        dest.writeString(mIconId);
        dest.writeString(mTimezone);
    }

    private Hour(Parcel in){
        mTime = in.readLong();
        mSummary = in.readString();
        mTemperature = in.readDouble();
        mIconId = in.readString();
        mTimezone = in.readString();
    }

    public Hour(){}

    public static final Creator<Hour> CREATOR = new Creator<Hour>() {
        @Override
        public Hour createFromParcel(Parcel source) {
            return new Hour(source);
        }

        @Override
        public Hour[] newArray(int size) {
            return new Hour[size];
        }
    };
}
