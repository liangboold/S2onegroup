package com.example.s2onegroup.repository;

import androidx.lifecycle.LiveData;

import com.bw.mvvm_library.model.Model;
import com.bw.mvvm_library.repository.BaseRepository;
import com.example.net.protocol.BaseRespEntry;
import com.example.s2onegroup.bean.TextBean;
import com.example.s2onegroup.model.TextModel;

import java.util.ArrayList;

/*
 * @ClassName TextRepository
 * @Description TODO
 * @Author 康泽林
 * @Date 2021/10/27 18:42
 * @Version 1.0
 */
public class TextRepository extends BaseRepository {
    @Model
    TextModel textModel;

    public LiveData<BaseRespEntry<TextBean>> Text(){
        return textModel.Text();
    }
}
