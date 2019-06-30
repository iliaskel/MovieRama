package com.example.movierama.model.databasemodel.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Favourite {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private int tmdb_id;

    public Favourite(int tmdb_id) {
        this.tmdb_id = tmdb_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTmdb_id() {
        return tmdb_id;
    }

    public void setTmdb_id(int tmdb_id) {
        this.tmdb_id = tmdb_id;
    }
}
