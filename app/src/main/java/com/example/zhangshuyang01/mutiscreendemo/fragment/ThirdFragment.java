package com.example.zhangshuyang01.mutiscreendemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.zhangshuyang01.mutiscreendemo.R;

/**
 * Created by zhangshuyang01 on 2017/10/20 0020.
 */

public class ThirdFragment extends Fragment {
    private TextView tvName;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_third_fragment, null);
        tvName = (TextView)view.findViewById(R.id.tv_name);
        Bundle bundle  = getArguments();
        String name =bundle.getString("name");
        String password = bundle.getString("password");
        if(null != name){
            tvName.setText(name+"    "+password);
        }
        return view;
    }
}
