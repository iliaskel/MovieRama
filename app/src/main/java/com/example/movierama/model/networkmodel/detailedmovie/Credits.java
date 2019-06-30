package com.example.movierama.model.networkmodel.detailedmovie;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Credits {

    @SerializedName("cast")
    @Expose
    private List<Cast> cast = new ArrayList<>();

    @SerializedName("crew")
    @Expose
    private List<Crew> crew = null;

    public List<Cast> getCast() {
        return cast;
    }

    public void setCast(List<Cast> cast) {
        this.cast = cast;
    }

    public List<Crew> getCrew() {
        return crew;
    }

    public void setCrew(List<Crew> crew) {
        this.crew = crew;
    }

}
