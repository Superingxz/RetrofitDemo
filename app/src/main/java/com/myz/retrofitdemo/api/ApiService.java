package com.myz.retrofitdemo.api;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Administrator on 2017/5/11.
 */

public interface ApiService {
    @GET("classify")
    Call<ResponseBody> locationList();
}
