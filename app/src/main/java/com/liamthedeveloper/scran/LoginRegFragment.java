package com.liamthedeveloper.scran;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link LoginRegFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link LoginRegFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LoginRegFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    private static final String ARG_LOGIN = "loginreg";


    // TODO: Rename and change types of parameters
    private boolean mloginreg;
    private OnFragmentInteractionListener mListener;
    private TextView mtvTermsConditions;
    private CheckBox mcheckBox;
    private Button mBtnRegister;
    private Button mBtnLogin;

    public LoginRegFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *

     * @return A new instance of fragment LoginRegFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LoginRegFragment newInstance(boolean loginreg) {
        LoginRegFragment fragment = new LoginRegFragment();
        Bundle args = new Bundle();
        args.putBoolean(ARG_LOGIN, loginreg);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mloginreg = getArguments().getBoolean(ARG_LOGIN);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_login, container, false);

        mcheckBox = (CheckBox) root.findViewById(R.id.cbTermsConditions);
        mtvTermsConditions = (TextView) root.findViewById(R.id.tvTermsCondiontions);
        mBtnLogin = (Button) root.findViewById(R.id.btnLogin);
        mBtnRegister =  (Button) root.findViewById(R.id.btnRegister);


        if (mloginreg){
            mBtnRegister.setText("Register now");
            mBtnLogin.setText("Log in");
            mcheckBox.setVisibility(View.GONE);
            mtvTermsConditions.setVisibility(View.GONE);

        }
        else{
            mBtnRegister.setText("Sign in");
            mBtnLogin.setText("Register");
        }

        mBtnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mListener != null){
                    if(mloginreg){
                        mListener.goToReg();



                    }
                    else{
                        mListener.goToLogin();
                    }
                }

            }
        });

        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mloginreg) {
                    Utils.setIsLoggedIn(true);
                    Intent intent = new Intent(getActivity(), HomeActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getContext(),"Registration coming soon",Toast.LENGTH_SHORT).show();
                }
            }
        });


        return root;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
        void goToLogin();
        void goToReg();


    }

}
