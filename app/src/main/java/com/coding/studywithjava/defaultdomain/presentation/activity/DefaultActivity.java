package com.coding.studywithjava.defaultdomain.presentation.activity;

import static com.coding.studywithjava.infra.util.FragmentUtil.replaceFragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.coding.studywithjava.defaultdomain.presentation.fragment.AFragment;
import com.coding.studywithjava.infra.util.FragmentUtil;
import com.example.studywithjava.R;

public class DefaultActivity extends AppCompatActivity {

    private FragmentUtil fragmentUtil;

    public DefaultActivity() {
        fragmentUtil = new FragmentUtil(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default);
        replaceFragment(R.id.frame_layout_default_container, new AFragment(), false);
    }
}