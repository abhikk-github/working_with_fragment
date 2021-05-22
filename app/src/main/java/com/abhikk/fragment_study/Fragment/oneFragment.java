package com.abhikk.fragment_study.Fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.abhikk.fragment_study.R;

import org.jetbrains.annotations.NotNull;

public class oneFragment extends Fragment implements View.OnClickListener {

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_one, container, false);

        Button btn_one = view.findViewById(R.id.btn_one);
        Button btn_two = view.findViewById(R.id.btn_two);
        Button btn_three = view.findViewById(R.id.btn_three);

        btn_one.setOnClickListener(this);
        btn_two.setOnClickListener(this);
        btn_three.setOnClickListener(this);


        return view;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_one:
                textToast("btn_one");

//                FragmentTransaction transaction_one = getFragmentManager().beginTransaction();
//                transaction_one.replace(R.id.frame_main,new oneFragment());
//                transaction_one.commit();

                break;
            case R.id.btn_two:
                textToast("btn_two");

                FragmentTransaction transaction_two = getFragmentManager().beginTransaction();
                transaction_two.replace(R.id.frame_main,new twoFragment());
                transaction_two.commit();

                break;
            case R.id.btn_three:
                textToast("btn_three");

                FragmentTransaction transaction_three = getFragmentManager().beginTransaction();
                transaction_three.replace(R.id.frame_main,new threeFragment());

                transaction_three.commit();

                break;
        }
    }

    private void textToast(String text) {
        Toast.makeText(getActivity(), text, Toast.LENGTH_SHORT).show();
    }
}