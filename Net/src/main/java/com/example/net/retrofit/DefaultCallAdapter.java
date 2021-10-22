package com.example.net.retrofit;

import java.lang.reflect.Type;

import retrofit2.Call;
import retrofit2.CallAdapter;


public class DefaultCallAdapter<R>implements CallAdapter<R,Object> {
    Type mType = null;

    public DefaultCallAdapter(Type mType) {
        this.mType = mType;
    }

    @Override
    public Type responseType() {
        return mType;
    }

    @Override
    public Object adapt(Call<R> call) {
        return call;
    }
}
