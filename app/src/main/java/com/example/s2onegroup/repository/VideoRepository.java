package com.example.s2onegroup.repository;

import androidx.lifecycle.LiveData;

import com.bw.mvvm_library.model.Model;
import com.bw.mvvm_library.repository.BaseRepository;
import com.example.net.protocol.BaseRespEntry;
import com.example.s2onegroup.bean.TextBean;
import com.example.s2onegroup.bean.VideoBean;
import com.example.s2onegroup.model.VideoModel;

/*
 * @ClassName VideoRepository
 * @Description TODO
 * @Author 康泽林
 * @Date 2021/10/28 13:18
 * @Version 1.0
 */
public class VideoRepository extends BaseRepository {
    @Model
    VideoModel videoModel;

    public LiveData<BaseRespEntry<VideoBean>> Video(){
        return videoModel.Video();
    }
}
