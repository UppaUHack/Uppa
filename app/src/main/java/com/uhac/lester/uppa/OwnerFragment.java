package com.enterprise.uppa.com.mainwindow;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class OwnerFragment extends Fragment {
    private static final String TAG = "OwnerFragment";

    private Button btnTEST;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.owner_fragment,container,false);
        btnTEST = (Button) view.findViewById(R.id.ownerRegister);
        return view;
    }
}