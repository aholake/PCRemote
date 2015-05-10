package com.example.tanloc.pcremote.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.tanloc.pcremote.R;

/**
 * Created by tanloc on 5/3/15.
 */
public class MouseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_mouse);
    }
    public void onLeftClick(View view){
        Toast.makeText(this,"Left Click",Toast.LENGTH_SHORT).show();
    }
    public void onRightClick(View view){
        Toast.makeText(this,"Right Click", Toast.LENGTH_SHORT).show();
    }
}
