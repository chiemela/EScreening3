package com.example.escreening3.ui.fragMyStatus;

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
import com.example.escreening3.ui.fragHndProgramme.FragHndProgrammeViewModel;

public class FragMyStatus extends Fragment {

    private FragMyStatusViewModel fragMyStatusViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragMyStatusViewModel = ViewModelProviders.of(this).get(FragMyStatusViewModel.class);
        View root = inflater.inflate(R.layout.fragment_my_status, container, false);
        final TextView textView = root.findViewById(R.id.text_fragMyStatus);
        fragMyStatusViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
