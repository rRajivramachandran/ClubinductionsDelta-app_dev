package com.example.android.delta1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.File;
import java.nio.ShortBuffer;
import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.LogPrinter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.graphics.drawable.ColorDrawable;
import android.widget.TextView;
import java.io.FileOutputStream;
import static android.R.attr.x;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display();





    }


    public int Q,G,B;
    public void display() {
        RelativeLayout x = (RelativeLayout) findViewById(R.id.outer);
        ColorDrawable y = (ColorDrawable) x.getBackground();
        int z = y.getColor();
         Q = Color.red(z);
         G = Color.green(z);
         B = Color.blue(z);

        TextView t = (TextView) findViewById(R.id.redvalue);
        t.setText("" + Q);
        t = (TextView) findViewById(R.id.greenvalue);
        t.setText("" + G);
        t = (TextView) findViewById(R.id.bluevalue);
        t.setText("" + B);
    }
    public void colorbuild(int Q, int G,int B)
    {
        int color = Color.argb(255,Q,G,B);
        RelativeLayout x = (RelativeLayout) findViewById(R.id.outer);
        ColorDrawable y = (ColorDrawable) x.getBackground();
        y.setColor(color);

    }
    public void redinc(View view) {
        Q += 30;
        if(Q>=255)
            Q=0;
        colorbuild(Q,G,B);
        display();


    }

    public void blueinc(View view) {B += 30;
        if(B>=255)
            B=0;
        colorbuild(Q,G,B);
        display();
    }

    public void greeninc(View view) {G += 30;
        if(G>=255)
            G=0;
        colorbuild(Q,G,B);
        display();
    }

    public void reset(View view){
        Q=0;
        G=0;
        B=0;
        colorbuild(Q,G,B);
        display();
    }


}


