package com.example.uploadapirest.remote;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ImageInterface {

    @FormUrlEncoded
    @POST("/testeUpload")
    Call<String> uploadImage(
            @Field("file") String file,
            @Field("titulo") String titulo
    );
}
