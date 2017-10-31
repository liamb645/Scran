package com.liamthedeveloper.scran;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RecipeActivity extends AppCompatActivity implements LoginRegFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // LoginRegFragment.newInstance("hello", "world");
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        // do stuff
    }

    @Override
    public void goToLogin() {

    }

    @Override
    public void goToReg() {

    }


}
