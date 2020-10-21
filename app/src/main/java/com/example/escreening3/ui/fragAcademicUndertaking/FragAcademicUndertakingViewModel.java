package com.example.escreening3.ui.fragAcademicUndertaking;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FragAcademicUndertakingViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public FragAcademicUndertakingViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Academic Undertaking fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
