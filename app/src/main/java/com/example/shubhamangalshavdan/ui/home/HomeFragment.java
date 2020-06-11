package com.example.shubhamangalshavdan.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.shubhamangalshavdan.R;

public class HomeFragment extends Fragment {


    ImageView supportMail,callNO;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

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