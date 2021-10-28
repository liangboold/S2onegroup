package com.example.s2onegroup.model;

import androidx.lifecycle.LiveData;

import com.bw.mvvm_library.model.IModel;
import com.example.net.RetrofitFactory;
import com.example.net.protocol.BaseRespEntry;
import com.example.s2onegroup.Api;
import com.example.s2onegroup.bean.TextBean;

import java.util.ArrayList;

/*
 * @ClassName TextModel
 * @Description TODO
 * @Author 康泽林
 * @Date 2021/10/27 18:43
 * @Version 1.0
 */
public class TextModel implements IModel {
    public LiveData<BaseRespEntry<TextBean>> Text(){
        LiveData<BaseRespEntry<TextBean>> text = RetrofitFactory.getRetrofitFactory().createRetrofit().create(Api.class).getText();
        return text;
    }
}
