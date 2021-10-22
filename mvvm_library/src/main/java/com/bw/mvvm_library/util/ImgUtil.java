package com.bw.mvvm_library.util;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;

/*
 * @ClassName ImgUtil
 * @Description TODO
 * @Author 康泽林
 * @Date 2021/10/15 19:09
 * @Version 1.0
 */
public class ImgUtil {
        
    public static void imgLoad(Context context,Object path, ImageView img){
        Glide.with(context).load(path).into(img);
    }
    public static void  imgLoadCircle(Context context,Object path,ImageView img){
        Glide.with(context).load(path).transform(new CircleCrop()).into(img);
    }
    public static void  imgLoadRounded(Context context,Object path,ImageView img,int corners){
        Glide.with(context).load(path).transform(new RoundedCorners(corners)).into(img);
    }
}
