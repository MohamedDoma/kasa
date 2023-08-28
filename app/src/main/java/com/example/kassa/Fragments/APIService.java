package com.example.kassa.Fragments;

import com.example.kassa.Notifications.MyResponse;
import com.example.kassa.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService
{
    @Headers({"Content-Type:application/json", "Authorization:key=AAAAsAJXeQQ:APA91bGrDOKBSXyxjEsipnwXrd3EYA4q4ioM5lyxb-TF3UVS2Dm7diqRDKbHcs5Q3hBFiNXdjz1wCWcX8_8H20etVm2qFNpFaukaBw29zPpWd1_e_0XxPN8aRWxji7k6bA0u0X4_sEGQ"})
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender var1);
}
