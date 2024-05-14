
package com.example.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fragment.R;

public class FragmentB extends Fragment {

    public static final String KEY_NAME = "STRING";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_b, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView = view.findViewById(R.id.textview);
        textView.setText(getArguments().getString(KEY_NAME));

    }


    public static FragmentB newInstance(String data) {
        Bundle args = new Bundle();
        args.putString(KEY_NAME, data);
        FragmentB fragment = new FragmentB();
        fragment.setArguments(args);
        return fragment;
    }


}
