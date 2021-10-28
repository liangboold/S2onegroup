package com.example.s2onegroup.model;

import androidx.lifecycle.LiveData;

import com.bw.mvvm_library.model.IModel;
import com.example.net.RetrofitFactory;
import com.example.net.protocol.BaseRespEntry;
import com.example.s2onegroup.Api;
import com.example.s2onegroup.bean.VideoBean;

/*
 * @ClassName VideoModel
 * @Description TODO
 * @Author 康泽林
 * @Date 2021/10/28 13:19
 * @Version 1.0
 */
public class VideoModel implements IModel {
    public LiveData<BaseRespEntry<VideoBean>> Video(){
        LiveData<BaseRespEntry<VideoBean>> video = RetrofitFactory.getRetrofitFactory().createRetrofit().create(Api.class).getVideo();
        return video;
    }
}
