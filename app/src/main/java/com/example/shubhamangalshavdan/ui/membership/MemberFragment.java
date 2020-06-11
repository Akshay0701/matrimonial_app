package com.example.shubhamangalshavdan.ui.membership;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.shubhamangalshavdan.R;


public class MemberFragment extends Fragment {

    public MemberFragment() {
        // Required empty public constructor
    }


    ImageView registerLink,loginLink,callNO;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_member, container, false);

        //register link
        registerLink=view.findViewById(R.id.registerLink);
        registerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRegisterLink();
            }
        });
        //login link
        loginLink=view.findViewById(R.id.loginLink);
        loginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLoginLink();
            }
        });
        //callNO link
        callNO=view.findViewById(R.id.callNO);
        callNO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCallPhone();
            }
        });
        return view;
    }

    void openRegisterLink(){
        String url = "http://www.subhamangal.com/Registration.aspx";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    void openLoginLink(){
        String url = "http://www.subhamangal.com/LogIn.aspx";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    void openCallPhone(){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:7021147871"));
        startActivity(intent);
    }
}
