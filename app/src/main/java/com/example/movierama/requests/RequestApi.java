package com.example.movierama.requests;

import com.example.movierama.Constants;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import static com.example.movierama.Constants.API_KEY;
import static com.example.movierama.Constants.API_KEY_REQUEST_PARAM;
import static com.example.movierama.Constants.APPEND_TO_RESPONSE_PARAM;
import static com.example.movierama.Constants.MOVIE_ID_STRING;
import static com.example.movierama.Constants.PAGE_REQUEST_PARAM;
import static com.example.movierama.Constants.QUERY_REQUEST_PARAM;

public interface RequestApi {

    @GET("/movie/popular")
    Observable<Response> getPopularMovies(
            @Query(API_KEY_REQUEST_PARAM) String apiKey,
            @Query(PAGE_REQUEST_PARAM) int page);

    @GET("/movie/{movie_id}")
    Observable<Response> getMovie(
            @Path(MOVIE_ID_STRING) int movieId,
            @Query(API_KEY_REQUEST_PARAM) String apiKey
    );

    @GET("/movie/{movie_id}")
    Observable<Response> getMovieWithDetails(
            @Path(MOVIE_ID_STRING) int movieId,
            @Query(API_KEY_REQUEST_PARAM) String apiKey,
            @Query(APPEND_TO_RESPONSE_PARAM) String appendType
            );

    @GET("/search/movie")
    Observable<Response> getMovieFromQuery(
            @Query(API_KEY_REQUEST_PARAM) String apiKey,
            @Query(QUERY_REQUEST_PARAM) String query,
            @Query(Constants.PAGE_REQUEST_PARAM) int page
    );

    @GET("movie/{movie_id}/similar")
    Observable<Response> getSimilarMovies(
            @Path(MOVIE_ID_STRING) int movieId,
            @Query(API_KEY_REQUEST_PARAM) String apiKey,
            @Query(PAGE_REQUEST_PARAM) int page
    );

    @GET("movie/{movie_id}/reviews")
    Observable<Response> getMovieReviews(
            @Path(MOVIE_ID_STRING) int movieId,
            @Query(API_KEY_REQUEST_PARAM) String apiKey,
            @Query(PAGE_REQUEST_PARAM) int page
    );
}
