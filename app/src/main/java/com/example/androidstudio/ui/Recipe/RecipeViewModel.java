package com.example.androidstudio.ui.Recipe;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RecipeViewModel extends ViewModel {
    private MutableLiveData<String> mText;
    public RecipeViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("This is your Recipe");
    }
    public LiveData<String> getText(){
        return mText;
    }
}
