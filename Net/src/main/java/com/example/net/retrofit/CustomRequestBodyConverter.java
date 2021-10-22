package com.example.net.retrofit;

import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Converter;


public class CustomRequestBodyConverter<T>implements Converter<T, RequestBody> {

    private static final MediaType MEDIA_TYPE = MediaType.parse("application/json;charset=UTF-8");
    @Override
    public RequestBody convert(T value) throws IOException {
        String jsonContent = new Gson().toJson(value);
        return RequestBody.create(MEDIA_TYPE,jsonContent);
    }
}
