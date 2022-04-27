package com.example.androidstudio.ui.Necessities;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NecessitiesViewModel extends ViewModel {
    private MutableLiveData<String> mText;
    public NecessitiesViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("This is your Necessities");
    }
    public LiveData<String> getText(){
        return mText;
    }
}
