package com.example.zhangshuyang01.mutiscreendemo.fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.zhangshuyang01.mutiscreendemo.MainActivity;
import com.example.zhangshuyang01.mutiscreendemo.PatrolActivity;
import com.example.zhangshuyang01.mutiscreendemo.R;

/**
 * Created by zhangshuyang01 on 2017/10/19 0019.
 */

public class RightFragment extends Fragment implements View.OnClickListener{
    private Button btnTomain,btnToNext;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.layout_right,null);
        btnTomain = (Button)view.findViewById(R.id.btn_to_main);
        btnToNext = (Button)view.findViewById(R.id.btn_to_nextactivity);
        btnTomain.setOnClickListener(this);
        btnToNext.setOnClickListener(this );
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_to_main:
                Intent intent  = new Intent(getActivity(),MainActivity.class);
                getActivity().startActivity(intent);
                break;
            case R.id.btn_to_nextactivity:
                Intent intent1 = new Intent(getActivity(), PatrolActivity.class);
                getActivity().startActivity(intent1);
                break;
            default:
                break;
        }
    }
}
