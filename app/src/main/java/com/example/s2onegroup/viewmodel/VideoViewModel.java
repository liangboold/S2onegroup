package com.example.s2onegroup.viewmodel;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.blankj.utilcode.util.ThreadUtils;
import com.bw.mvvm_library.viewmodel.BaseViewModel;
import com.example.net.protocol.BaseRespEntry;
import com.example.s2onegroup.bean.TextBean;
import com.example.s2onegroup.bean.VideoBean;
import com.example.s2onegroup.repository.VideoRepository;

/*
 * @ClassName VideoViewModel
 * @Description TODO
 * @Author 康泽林
 * @Date 2021/10/28 13:14
 * @Version 1.0
 */
public class VideoViewModel extends BaseViewModel<VideoRepository> {
    public MutableLiveData<TextBean> mutableLiveData = new MutableLiveData<>();

    public VideoViewModel(LifecycleOwner owner) {
        super(owner);
        TextBean textBean = new TextBean();
        if (ThreadUtils.isMainThread()){
            mutableLiveData.setValue(textBean);
        }else {
            mutableLiveData.postValue(textBean);
        }
    }

    @Override
    protected VideoRepository createRepository() {
        return new VideoRepository();
    }

    public LiveData<BaseRespEntry<VideoBean>> baseRespEntryLiveData(){
        return mRepository.Video();
    }
}
