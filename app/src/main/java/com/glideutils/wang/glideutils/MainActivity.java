package com.glideutils.wang.glideutils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import com.glideutils.wang.glideutils.Utils.ImageLoader;

public class MainActivity extends AppCompatActivity {
    private String url="http://7xi8d6.com1.z0.glb.clouddn.com/20180115085556_8AeReR_taeyeon_ss_15_1_2018_7_58_51_833.jpeg";
    private ImageView img;
    private ImageView img1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initDatas();
    }

    private void initDatas() {
        ImageLoader.loadImage(MainActivity.this,url,img);
        ImageLoader.loadCircleImage(MainActivity.this,url,img1);
    }

    private void initViews() {
       img=findViewById(R.id.img);
        img1=findViewById(R.id.img1);
    }
}
