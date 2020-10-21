package com.example.escreening3.ui.fragStudentRegistration;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.escreening3.R;

public class FragStudentRegistration extends Fragment {

    private FragStudentRegistrationViewModel fragStudentRegistrationViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        fragStudentRegistrationViewModel =
                ViewModelProviders.of(this).get(FragStudentRegistrationViewModel.class);
        View root = inflater.inflate(R.layout.fragment_student_registration, container, false);
        final TextView textView = root.findViewById(R.id.text_fragThree);
        fragStudentRegistrationViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

}
