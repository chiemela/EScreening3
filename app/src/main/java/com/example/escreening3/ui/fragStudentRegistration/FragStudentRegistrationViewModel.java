package com.example.escreening3.ui.fragStudentRegistration;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FragStudentRegistrationViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FragStudentRegistrationViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Student Registration fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

}
