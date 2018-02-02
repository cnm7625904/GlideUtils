package com.glideutils.wang.glideutils.Utils;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.glideutils.App.MyApplication;

/**
 * Created by Administrator。 on 2018/1/22.
 */

public class ImageLoader {
    /**
     * 普通加载图片无任何修改
     * @param url
     * @param view
     */
    public static void loadImage(Context context,String url, ImageView view){
        Glide.with(context)
                .load(url)
                .into(view);
    }
    public static void loadCircleImage(Context context,String url, ImageView view){
        RequestOptions requestOptions = RequestOptions.circleCropTransform();
        Glide.with(context)
                .load(url)
                .apply(requestOptions)
                .into(view);
    }
}
