package com.example.tanloc.pcremote.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.tanloc.pcremote.R;

/**
 * Created by tanloc on 5/5/15.
 */
public class StartupActivity extends Activity {
    private final int SPLASH_DISPLAY_LENGTH = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_startup);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(StartupActivity.this, MainActivity.class);
                StartupActivity.this.startActivity(i);
                StartupActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);

    }
}
