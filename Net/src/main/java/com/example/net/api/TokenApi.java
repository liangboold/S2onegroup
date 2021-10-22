package com.example.net.api;


import com.example.net.protocol.TokenRespEntry;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface TokenApi {
    @FormUrlEncoded
    @POST("token")
    Call<TokenRespEntry>getToken(@Field("grant_type")String grant_type, @Field("username")String username, @Field("password")String password);
}
