package com.example.net.retrofit;

import com.example.net.protocol.BaseRespEntry;
import com.example.net.protocol.TokenRespEntry;
import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Converter;


public class CustomResponseBodyConverter<T>implements Converter<ResponseBody,T> {
    @Override
    public T convert(ResponseBody value) throws IOException {
        String jsonContent = value.string();
        if(jsonContent.contains("access_")){
            return (T)new Gson().fromJson(jsonContent, TokenRespEntry.class);
        }
        BaseRespEntry entry = new Gson().fromJson(jsonContent, BaseRespEntry.class);

        return (T) entry;
    }
}
