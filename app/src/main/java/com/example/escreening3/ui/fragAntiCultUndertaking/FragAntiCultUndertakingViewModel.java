package com.example.escreening3.ui.fragAntiCultUndertaking;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FragAntiCultUndertakingViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FragAntiCultUndertakingViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Anti-Cult Undertaking fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

}
