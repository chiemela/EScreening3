package com.example.escreening3.ui.fragCourseRegistration;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FragCourseRegistrationViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FragCourseRegistrationViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Course Registration fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

}
