package com.example.androidstudio.ui.Pantry;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.androidstudio.MainActivity;

public class PantryViewModel extends ViewModel {
    private MutableLiveData<String> mText;
    public PantryViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("This is your Pantry");
    }
    public LiveData<String> getText(){
        return mText;
    }
}