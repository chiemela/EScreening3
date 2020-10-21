package com.example.escreening3.ui.fragMyStatus;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FragMyStatusViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FragMyStatusViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("My Status fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

}
