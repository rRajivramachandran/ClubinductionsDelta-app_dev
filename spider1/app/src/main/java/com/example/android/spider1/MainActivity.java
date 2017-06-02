package com.example.android.spider1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private int a=0;
    public void inc(View view)
    {   a+=1;
        TextView t = (TextView)findViewById(R.id.val);
        t.setText(""+a);

    }
}
