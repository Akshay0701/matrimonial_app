package com.example.shubhamangalshavdan.ui.ContactUs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.shubhamangalshavdan.R;


public class ContactFragment extends Fragment {

    public ContactFragment() {
        // Required empty public constructor
    }
    ImageView supportMail,callNO;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_contact, container, false);
        //open mail
        supportMail=root.findViewById(R.id.supportMail);
        supportMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMail();
            }
        });
        //call no
        callNO=root.findViewById(R.id.callNO);
        callNO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPhone();
            }
        });
        return root;
    }

    void  openMail(){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("plain/text");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "support@subhamangal.com" });
        intent.putExtra(Intent.EXTRA_SUBJECT, "Your Subject");
        intent.putExtra(Intent.EXTRA_TEXT, "Your Message..");
        startActivity(Intent.createChooser(intent, ""));
    }

    void openPhone(){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:7021147871"));
        startActivity(intent);
    }
}
