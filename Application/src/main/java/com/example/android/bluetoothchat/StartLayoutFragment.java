package com.example.android.bluetoothchat;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Mak on 4/17/2017.
 */

public class StartLayoutFragment extends Fragment {
    Button enableBT;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.start_layout_fragment, container, false);


        enableBT = (Button)view.findViewById(R.id.buttonBT);
        enableBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction ();
// work here to change Activity fragments (add, remove, etc.).  Example here of adding.
                BluetoothChatFragment bluetoothChatFragment = new BluetoothChatFragment();
                fragmentTransaction.replace(R.id.activity_start,bluetoothChatFragment);
                fragmentTransaction.commit ();
            }
        });

        return view;
    }
}
