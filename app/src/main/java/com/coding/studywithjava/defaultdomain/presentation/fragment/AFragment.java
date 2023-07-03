package com.coding.studywithjava.defaultdomain.presentation.fragment;

import static com.coding.studywithjava.infra.util.FragmentUtil.replaceFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.studywithjava.R;

public class AFragment extends Fragment implements View.OnClickListener {

    private Button buttonA;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        initComponentsAndSetListener(view);
        return view;
    }

    private void initComponentsAndSetListener(View view) {
        buttonA = view.findViewById(R.id.button_a_welcome);
        buttonA.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if(id == R.id.button_a_welcome) {
            replaceFragment(
                    R.id.frame_layout_default_container, new BFragment(), false);
        }
    }
}