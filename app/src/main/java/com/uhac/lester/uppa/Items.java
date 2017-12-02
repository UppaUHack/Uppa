package com.uhac.lester.uppa;

import android.app.Application;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Random;

/**
 * Created by Lester on 12/1/2017.
 */

public class Items extends Application{

    private DatabaseReference mRef;

    public int itemId;
    public String itemName;
    public String itemDesc;
    public double itemLat;
    public double itemLong;
    public String itemPrice;
    public double itemRating;

    public Items(String name, String desc, double lat, double longi, String price, double rating){
        itemName = name;
        itemDesc = desc;
        itemLat = lat;
        itemLong = longi;
        itemPrice = price;
        itemRating = rating;
    }

    public void addItem(){
            mRef = FirebaseDatabase.getInstance().getReference();
            Random r = new Random();
            int id = r.nextInt();

            DatabaseReference mRootRef = mRef.child("Items").child("item" + id);
            mRootRef.child("iName").setValue(itemName);
            mRootRef.child("iDesc").setValue(itemDesc);
            mRootRef.child("iLat").setValue(Double.toString(itemLat));
            mRootRef.child("iLong").setValue(Double.toString(itemLat));
            mRootRef.child("iPrice").setValue(itemPrice);
            mRootRef.child("iRating").setValue(Double.toString(itemRating));
    }

    public void removeItem(){

    }

    public void rate(){

    }

    public void rent(){

    }

    public void returning(){

    }

    public void getItemName(){

    }

}
