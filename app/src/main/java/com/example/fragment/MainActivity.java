package com.example.fragment;

import static com.example.fragment.FragmentB.KEY_NAME;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.fragment.R;

public class MainActivity extends AppCompatActivity {


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn_send_data);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString(KEY_NAME , "some Text From Acivity Main");
                com.example.fragment.FragmentB fragmentB  = new com.example.fragment.FragmentB();
                fragmentB.setArguments(bundle);


                FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
                fragmentTransaction2.replace(R.id.fragmentContainerView, fragmentB );
                fragmentTransaction2.addToBackStack(null);
                fragmentTransaction2.commit();

            }
        });

    }
}