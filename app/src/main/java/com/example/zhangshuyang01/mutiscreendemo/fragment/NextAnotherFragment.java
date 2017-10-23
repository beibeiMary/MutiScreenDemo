package com.example.zhangshuyang01.mutiscreendemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zhangshuyang01.mutiscreendemo.R;

/**
 * Created by zhangshuyang01 on 2017/10/20 0020.
 */

public class NextAnotherFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_another_next_fragment, null);
    }
}
