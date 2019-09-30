package com.example.retrofit1;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

        // Tällä luokalla otetaan yhteys REST API:n
        // Tässä annotaatio @GET("posts"), jolla kutsu ohjajataan
        // posts. URL:in alkuosa määritetään aktiviteetti-luokassa
        // kun luodaan uusi Retrofit ilmentymä new Retrofit.builder();

        @GET("posts")
        Call<List<Post>> getPosts();
    }

