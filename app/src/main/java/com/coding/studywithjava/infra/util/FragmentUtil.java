package com.coding.studywithjava.infra.util;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class FragmentUtil {
    private static AppCompatActivity appCompatActivity;

    public FragmentUtil(AppCompatActivity appCompatActivity) {
        this.appCompatActivity = appCompatActivity;
    }

    public static void replaceFragment(int id, Fragment fragment, boolean push) {
        FragmentTransaction fragmentTransaction = appCompatActivity.
                getSupportFragmentManager().beginTransaction();
        if(fragmentTransaction != null) {
            fragmentTransaction.replace(id, fragment).commitAllowingStateLoss();
            // Add present fragment to back stack if push is true
            if(push) { fragmentTransaction.addToBackStack(null); }
        }
    }
}
