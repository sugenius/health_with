package com.example.healthwith.ui.pedometer;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PedometerViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PedometerViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is pedometer fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}