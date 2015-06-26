package com.inomera.kasap.androidrottentomatoesapp.network;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Menaf on 17.06.2015
 */
public class Movie implements Parcelable {
    String title;
    int id;

    public int getYear() {
        return year;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    int year;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeInt(this.id);
        dest.writeInt(this.year);
    }

    protected Movie(Parcel in) {
        this.title = in.readString();
        this.id = in.readInt();
        this.year = in.readInt();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        public Movie createFromParcel(Parcel source) {
            return new Movie(source);
        }

        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };
}