package com.testapp.user.uppa;

import android.media.Image;

import java.io.File;

/**
 * Created by user on 12/02/2017.
 */

public class ItemContent {
    private int id;
    private String name;
    private double price;
    private Image image;
    private String description;
    private String location;

    public ItemContent(int id/*, Image image*/, String name, double price, String description, String location){
        this.id = id;
      //  this.image = image;
        this.name = name;
        this.price = price;
        this.description = description;
        this.location = location;
    }//public ItemContent(int id,String name, double price, String description){

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public Image getImage() {
//        return image;
//    }
//
//    public void setImage(Image image) {
//        this.image = image;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}//public class ItemContent {
