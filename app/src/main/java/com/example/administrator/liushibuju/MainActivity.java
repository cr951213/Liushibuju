package com.example.administrator.liushibuju;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.library.AutoFlowLayout;

public class MainActivity extends AppCompatActivity {

    private ImageView   ssfh;
    private EditText    sssr;
    private TextView    ssss;
    private AutoFlowLayout mFlowLayout;
    private LayoutInflater mLayoutInflater;
    private String[] mData = {"英雄联盟职业赛","帝师","全民吃鸡贺岁杯","绝地求生","王者荣耀","小智","小莫","是小银呀","察萝莉","英雄联盟","隔壁老王","DNF","穿越火线"};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ssfh=findViewById(R.id.ss_fh);
        sssr=findViewById(R.id.ss_sr);
        ssss=findViewById(R.id.ss_ss);
        mFlowLayout=findViewById(R.id.afl_cotent);
        mLayoutInflater = LayoutInflater.from(this);

        for (int i = 0; i< 10; i ++ ){
            View item =View.inflate(this,R.layout.sub_item, null);
            TextView tvAttrTag =item.findViewById(R.id.tv_attr_tag);
            tvAttrTag.setText(mData[i]);
            mFlowLayout.addView(item);
        }



    }




}
