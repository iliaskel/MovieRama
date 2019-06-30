package com.example.movierama.model.databasemodel;

import static com.example.movierama.Constants.DATA_BASE_NAME;

import android.content.Context;
import com.example.movierama.model.databasemodel.daos.MoviesDao;
import com.example.movierama.model.databasemodel.entities.Favourite;
import com.example.movierama.model.databasemodel.entities.Movie;


import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;


@Database(
        entities = {Movie.class,
                Favourite.class},
        version = 1,
        exportSchema = false)
public abstract class MoviesDatabase extends RoomDatabase {

    private static MoviesDatabase instance;

    public abstract MoviesDao moviesDao();
    public abstract Favourite favourite();

    public static MoviesDatabase getInstance(Context context){
        if(instance==null){
            synchronized (MoviesDatabase.class){
                instance =
                        Room.
                        databaseBuilder(context.getApplicationContext(),
                                MoviesDatabase.class,
                                DATA_BASE_NAME)
                        .fallbackToDestructiveMigration()
                        .build();
            }
        }
        return instance;
    }

}
