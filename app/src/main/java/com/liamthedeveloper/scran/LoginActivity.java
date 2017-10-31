package com.liamthedeveloper.scran;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;
import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by liamblack on 06/10/2017.
 */

public class LoginActivity extends AppCompatActivity implements LoginRegFragment.OnFragmentInteractionListener {


    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private static final String TAG = "MainActivity";
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoginRegFragment loginRegFragment = LoginRegFragment.newInstance(true);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        btnLogin = (Button) findViewById(R.id.btnLogin);


        fragmentTransaction.replace(R.id.content_fragment, loginRegFragment);
        fragmentTransaction.commit();


    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        Toast.makeText(LoginActivity.this, "test1", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void goToLogin() {

        LoginRegFragment loginRegFragment = LoginRegFragment.newInstance(true);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.content_fragment, loginRegFragment);
        fragmentTransaction.commit();


    }

    @Override
    public void goToReg() {

        LoginRegFragment loginRegFragment = LoginRegFragment.newInstance(false);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.content_fragment, loginRegFragment);
        fragmentTransaction.commit();

    }



}

