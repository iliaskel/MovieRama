package com.example.movierama;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class Constants {

    public static final String MOVIES_BASE_URL = "https://api.themoviedb.org/3";
    public static final String IMAGE_URL_PREFIX = "https://image.tmdb.org/t/p/";

    public static final String API_KEY_REQUEST_PARAM = "api_key";
    public static final String API_KEY = "30842f7c80f80bb3ad8a2fb98195544d";

    public static final String QUERY_REQUEST_PARAM = "query";
    public static final String APPEND_TO_RESPONSE_PARAM = "append_to_response";

    public static final String CREDITS_APPEND_STRING = "credits";
    public static final String MOVIE_ID_STRING = "movie_id";



    // network
    public static final String MOVIES_ARRAY_DATA_TAG = "results";
    public static final String SMALL_IMAGE_URL_PREFIX = IMAGE_URL_PREFIX + "w300";
    public static final String BIG_IMAGE_URL_PREFIX = IMAGE_URL_PREFIX + "w500";
    public static final String LANGUAGE_REQUEST_PARAM = "language";
    public static final String PAGE_REQUEST_PARAM = "page";
    public static final String LANGUAGE = "en";
    public static final int LOADING_PAGE_SIZE = 20;
    // DB
    public static final String DATA_BASE_NAME = "movies.db";
    public static final int NUMBERS_OF_THREADS = 3;

}
