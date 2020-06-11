package com.example.shubhamangalshavdan.ui.slideshow;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.shubhamangalshavdan.R;

public class PaymentFragment extends Fragment {


    ImageView supportMail,callNO;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_payment, container, false);
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
    void openPhone(){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:7021147871"));
        startActivity(intent);
    }
}
