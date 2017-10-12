package com.liamthedeveloper.scran;

import android.app.FragmentTransaction;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RecipeActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        BlankFragment.newInstance("hello", "world");
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        // do stuff
    }
}
