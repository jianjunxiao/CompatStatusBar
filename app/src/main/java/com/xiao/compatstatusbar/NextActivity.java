package com.xiao.compatstatusbar;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.xiao.compatstatusbar.base.CompatStatusBarActivity;

public class NextActivity extends CompatStatusBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_next);
        int color = 0xffffffff;
        toolbar.setBackgroundColor(color);
        setImmersiveStatusBar(true, color);
    }
}
