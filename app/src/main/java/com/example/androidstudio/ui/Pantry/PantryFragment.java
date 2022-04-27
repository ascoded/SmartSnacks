package com.example.androidstudio.ui.Pantry;


import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidstudio.R;

import java.util.ArrayList;

public class PantryFragment extends Fragment {

    private PantryViewModel mViewModel;

    public PantryFragment(ArrayList<String> list) {
    }

    public static PantryFragment newInstance(ArrayList<String> list) {
        return new PantryFragment(list);
    }



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_pantry, container, false);
        //add code for view string in list here
        


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(PantryViewModel.class);
        // TODO: Use the ViewModel
    }

}