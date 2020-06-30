package com.example.oop02062020;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    abstract int getLayoutId();
    abstract void anhxa();
    abstract void initView();
    abstract void setListener();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        anhxa();
        initView();
        setListener();
    }
}
