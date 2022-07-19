package com.shubhankaranku.qualitywebs.Adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.shubhankaranku.qualitywebs.Fragment.LoginFragment;
import com.shubhankaranku.qualitywebs.Fragment.SignupFragment;

public class LoginAdapter extends FragmentPagerAdapter {
    private final int totalTabs;

    public LoginAdapter(@NonNull FragmentManager fm, int totalTabs) {
        super(fm);
        this.totalTabs = totalTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        if (position == 1) {
            return new SignupFragment();
        }
        return new LoginFragment();

    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
