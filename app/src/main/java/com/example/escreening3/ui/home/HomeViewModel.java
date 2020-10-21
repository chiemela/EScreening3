package com.example.escreening3.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Welcome to the student mobile screening. In order to become a " +
                "regular student you must complete all the different sections " +
                "in the screening process. On completion click the save button " +
                "to submit to the admin board then wait for five working days. " +
                "To check your screening status simply go to \"My Status\" section." +
                "\n\nDECLARATION \n" +
                "By filling and sending this student screening application. You declare that the above Data are true. " +
                "You hereby agree to comply with the rules and regulation of this Institution, " +
                "and that your enrolment may be terminated at any time for any disobedience of " +
                "these rules and regulations, and if in the opinion of this Institution, " +
                "you are unsuited for the course.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}