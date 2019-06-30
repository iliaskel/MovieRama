package com.example.movierama.model.databasemodel.daos;

import com.example.movierama.model.databasemodel.entities.Favourite;

import androidx.room.Delete;
import androidx.room.Insert;

public interface FavouritesDao {

    @Insert
    void insertFavouriteMovie(Favourite favourite);

    @Delete
    void deleteFavouriteMovie(Favourite favourite);
}
