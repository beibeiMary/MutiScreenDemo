package com.example.zhangshuyang01.mutiscreendemo;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;

/**
 * Created by zhangshuyang01 on 2017/10/19 0019.
 */

public class BasePadFragment extends Fragment{
    public Context mContext;

    public void startToFragment(Context context,int container,Fragment newFragment){

        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(container,newFragment);
        transaction.addToBackStack(context.getClass().getName());
        transaction.commit();
    }
}
