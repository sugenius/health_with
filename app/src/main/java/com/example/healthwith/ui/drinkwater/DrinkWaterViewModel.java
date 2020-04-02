package com.example.healthwith.ui.drinkwater;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DrinkWaterViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DrinkWaterViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is drinkwater fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}