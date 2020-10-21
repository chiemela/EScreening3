package com.example.escreening3.ui.fragHndProgramme;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FragHndProgrammeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FragHndProgrammeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("HND Programme fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

}
