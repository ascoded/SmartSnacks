package com.example.androidstudio.ui.Pantry;


import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.androidstudio.MainActivity;
import com.example.androidstudio.R;

import java.util.ArrayList;

public class PantryFragment extends Fragment {

    private PantryViewModel mViewModel;

    public static PantryFragment newInstance(ArrayList<Integer> list) {
        PantryFragment pantryFragment = new PantryFragment();
        Bundle bundle = new Bundle();
        bundle.putIntegerArrayList("pantryList",list);
        pantryFragment.setArguments(bundle);
        return pantryFragment;
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_pantry, container, false);

        TextView textView = v.findViewById(R.id.pantry_list);
        ArrayList<Integer> pantryList = this.getArguments().getIntegerArrayList("pantryList");
        String s = "";
        for(int i = 0; i<pantryList.size(); i++){
            String temp = pantryList.get(i).toString();
            s += temp + "\n";
        }

        textView.setText(s);



        return v;


    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(PantryViewModel.class);
        // TODO: Use the ViewModel
    }

}