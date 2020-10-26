package com.ardyansyah.convertwaktu;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ardyansyah.convertwaktu.databinding.FragmentTimeBinding;
import com.ardyansyah.convertwaktu.viewModel.ViewModelsTime;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class timeFragment extends Fragment {

    public ViewModelsTime mViewModels;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final FragmentTimeBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_time,container,false);

        mViewModels = new ViewModelProvider(this).get(ViewModelsTime.class);
        binding.button.setOnClickListener((view){
            mViewModels.time.setJam(Integer.parseInt(binding.txtJam.getText().toString()));
            mViewModels.time.setMenit(Integer.parseInt(binding.txtMenit.getText().toString()));
            mViewModels.hitungTotal();

            binding.texthasil.setText(Integer.toString(mViewModels.time.getTotal()));
        });
        binding.setLifecycleOwner(this);
        return binding.getRoot();
    }
}