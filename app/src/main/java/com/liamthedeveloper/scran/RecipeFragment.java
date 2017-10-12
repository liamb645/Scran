package com.liamthedeveloper.scran;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by liamblack on 28/09/2017.
 */

public class RecipeFragment extends Fragment {

    public static RecipeFragment newInstance(boolean isLogin, int age) {
        RecipeFragment fragment = new RecipeFragment();
        Bundle args = new Bundle();
        args.putBoolean("IS_LOGIN", isLogin);
        args.putInt("AGE", age);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Bundle args = getArguments();
        boolean isLogin = args.getBoolean("IS_LOGIN");
        int age = args.getInt("AGE");


        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
