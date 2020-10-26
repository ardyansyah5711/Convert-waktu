package com.ardyansyah.convertwaktu.model;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.lifecycle.ViewModel;

public class Time {
    private int jam ;
    private int menit ;
    private int total ;

    public Time() {
    }

    public Time(int jam, int menit, int total) {
        this.jam = jam;
        this.menit = menit;
        this.total = total;
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public int getMenit() {
        return menit;
    }

    public void setMenit(int menit) {
        this.menit = menit;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
