package com.example.zhangshuyang01.mutiscreendemo.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.zhangshuyang01.mutiscreendemo.BasePadFragment;
import com.example.zhangshuyang01.mutiscreendemo.R;


/**
 * Created by zhangshuyang01 on 2017/10/20 0020.
 */

public class AnotherFragment extends BasePadFragment implements View.OnClickListener{
    private Button btnToThirdPage;
    private EditText mEdtName;
    private Spinner mSpinText;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_another, null);
        mContext = getActivity();
        btnToThirdPage = (Button) view.findViewById(R.id.btn_another);
        mEdtName = (EditText)view.findViewById(R.id.edt_name);
        mSpinText = (Spinner)view.findViewById(R.id.spi_text);
        String [] textArray = getResources().getStringArray(R.array.text);
        ArrayAdapter<String> textAdapter = new ArrayAdapter<String>(mContext,R.layout.myspinner,textArray);
        textAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinText.setAdapter(textAdapter);
        btnToThirdPage.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_another:
                ThirdFragment thirdFragment = new ThirdFragment();
                String name = mEdtName.getText().toString();
                Bundle bundle = new Bundle();
                if(name != null){
                    bundle.putString("name",name);
                }
                bundle.putString("password","12345678");
                thirdFragment.setArguments(bundle);
                startToFragment(getActivity(), R.id.layout_container, thirdFragment);
                break;
            default:
                break;
        }
    }
}
