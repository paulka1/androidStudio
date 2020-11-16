package com.example.samic_charensol;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDatService {

    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();
}
