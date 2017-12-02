package com.testapp.user.uppa;

import android.media.Image;

import java.io.File;

/**
 * Created by user on 12/02/2017.
 */

public class ReviewContent {
    private int id;
    private String name;
    private String review;

    public ReviewContent(int id, String name, String review){
        this.id = id;
        this.name = name;
        this.review = review;
    }//public ItemContent(int id, String name, String review){

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}//public class ItemContent {
