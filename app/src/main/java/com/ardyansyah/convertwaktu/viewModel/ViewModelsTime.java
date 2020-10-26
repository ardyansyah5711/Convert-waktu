package com.ardyansyah.convertwaktu.viewModel;

import androidx.lifecycle.ViewModel;

import com.ardyansyah.convertwaktu.model.Time;

public class ViewModelsTime extends ViewModel {
    public Time time = new Time();

    public void hitungTotal() {

        time.setTotal(time.getMenit()+(time.getMenit()*60)+(time.getJam()*3600));
    }
}
