package com.example.movierama.model.databasemodel.daos;

import com.example.movierama.model.databasemodel.entities.Movie;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import io.reactivex.Maybe;
import io.reactivex.Observable;

@Dao
public interface MoviesDao {

    @Insert
    void insertMovies(List<Movie> movies);

    @Query("SELECT * FROM movie")
    Observable<List<Movie>> getMovies();

}
