package com.liamthedeveloper.scran;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by liamblack on 06/10/2017.
 */

public class LoginActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BlankFragment blankFragment = BlankFragment.newInstance(null,null);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.content_fragment, blankFragment);
        fragmentTransaction.commit();
        


    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        Toast.makeText(LoginActivity.this, "test1", Toast.LENGTH_SHORT).show();





    }
}

