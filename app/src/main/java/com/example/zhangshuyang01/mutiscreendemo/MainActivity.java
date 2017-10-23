package com.example.zhangshuyang01.mutiscreendemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.btn_to_index);
        btn.setOnClickListener(this);
        btn = (Button)findViewById(R.id.btn_to_room);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_to_index:
                Intent intent = new Intent(this,IndexActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_to_room:
                Intent intent1 = new Intent(this,Main2Activity.class);
                startActivity(intent1);
            default :
                break;
        }
    }
}
