package com.example.s2onegroup;

import androidx.lifecycle.LiveData;

import com.example.net.protocol.BaseRespEntry;
import com.example.s2onegroup.bean.TextBean;
import com.example.s2onegroup.bean.VideoBean;

import java.util.ArrayList;

import retrofit2.http.GET;

/*
 * @ClassName Api
 * @Description TODO
 * @Author 康泽林
 * @Date 2021/10/27 18:46
 * @Version 1.0
 */
public interface Api {
    @GET("serverdemo/feeds/queryHotFeedsList?pageCount=12&feedType=text&feedId=0&userId=0")
    LiveData<BaseRespEntry<TextBean>> getText();

    @GET("serverdemo/feeds/queryHotFeedsList?pageCount=12&feedType=video&feedId=0&userId=0")
    LiveData<BaseRespEntry<VideoBean>> getVideo();
}
