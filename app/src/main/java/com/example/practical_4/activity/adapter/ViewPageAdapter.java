package com.example.practical_4.activity.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.practical_4.activity.fragment.SignInFragment;
import com.example.practical_4.activity.fragment.SignUpFragment;

public class ViewPageAdapter extends FragmentStateAdapter{

public ViewPageAdapter(FragmentManager fragmentManager, Lifecycle lifecycle){
    super(fragmentManager, lifecycle);
}
    public Fragment createFragment(int position) {
        if(position == 1){
            return new SignInFragment();
        }
        return new SignUpFragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
