package com.bw.mvvm_library.viewmodel;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;

import com.bw.mvvm_library.repository.BaseRepository;



public abstract class BaseViewModel <Repo extends BaseRepository> extends ViewModel implements LifecycleObserver {
    protected Repo mRepository;
    private LifecycleOwner mOwner;
    public BaseViewModel(LifecycleOwner owner){
        mRepository=createRepository();
        mOwner=owner;
        mOwner.getLifecycle().addObserver(this);
    }


    // 创建并初始化Repository

    protected abstract Repo createRepository();

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void uiConnection(){
        initResource();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void disConnection(){
        releaseResource();
        mOwner.getLifecycle().removeObserver(this);
    }

    //释放资源

    protected  void releaseResource(){}

    //资源的初始化

    protected void initResource(){}


}
