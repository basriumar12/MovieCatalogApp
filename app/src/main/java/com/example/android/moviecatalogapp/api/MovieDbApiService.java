package com.example.android.moviecatalogapp.api;

import com.example.android.moviecatalogapp.model.movie.search.SearchMovie;

import io.reactivex.Observable;


import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Lenovo on 9/18/2017.
 */


public interface MovieDbApiService {
    @GET("search/movie")
    Observable<SearchMovie> searchMovie(
           @Query("api_key")String apiKey,
           @Query("language") String language,
           @Query("query") String query
    );

    @GET("movie/{MovieId}")
    void getDetailMovie(
            @Path("MovieId") String movieId,
            @Query("api_key") String apiKey,
            @Query("language") String language
    );


    @GET("movie/upcoming")
    void getUpcomingMovie(
            @Query("api_key") String apiKey,
            @Query("language") String language
    );
}