package com.example.escreening3.ui.fragBioData;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FragBioDataViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FragBioDataViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Bio Data fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

}