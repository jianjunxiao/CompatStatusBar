package com.xiao.compatstatusbar;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.xiao.compatstatusbar.base.CompatStatusBarActivity;

public class MainActivity extends CompatStatusBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        int color = 0xffaa66cc;
        toolbar.setBackgroundColor(color);
        setImmersiveStatusBar(false, color);
    }

    public void go(View view) {
        startActivity(new Intent(this, NextActivity.class));
    }
}
