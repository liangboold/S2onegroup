package com.example.s2onegroup.viewmodel;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.blankj.utilcode.util.ThreadUtils;
import com.bw.mvvm_library.viewmodel.BaseViewModel;
import com.example.net.protocol.BaseRespEntry;
import com.example.s2onegroup.bean.TextBean;
import com.example.s2onegroup.repository.TextRepository;

import java.util.ArrayList;

/*
 * @ClassName TextViewModel
 * @Description TODO
 * @Author 康泽林
 * @Date 2021/10/27 18:13
 * @Version 1.0
 */
public class TextViewModel extends BaseViewModel<TextRepository> {
    public MutableLiveData<TextBean> mutableLiveData = new MutableLiveData<>();

    public TextViewModel(LifecycleOwner owner) {
        super(owner);
        TextBean textBean = new TextBean();
        if (ThreadUtils.isMainThread()){
            mutableLiveData.setValue(textBean);
        }else {
            mutableLiveData.postValue(textBean);
        }
    }

    @Override
    protected TextRepository createRepository() {
        return new TextRepository();
    }

    public LiveData<BaseRespEntry<TextBean>> baseRespEntryLiveData(){
        return mRepository.Text();
    }
}
