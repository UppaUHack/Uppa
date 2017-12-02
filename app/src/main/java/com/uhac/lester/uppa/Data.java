package com.testapp.user.uppa;

import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 12/2/2017.
 */

public class Data {

    public List<ItemContent> RentItemsData;

    public Data(){
        RentItemsData = new ArrayList<>();
        RentItemsData.add(new ItemContent(1, "Toothbrush", 69, "Slightly used.", "Mabait St."));
        RentItemsData.add(new ItemContent(2, "Brief", 69, "Ginagamit lagi.", "Lester st."));
        RentItemsData.add(new ItemContent(3, "Bike", 69, "From Tian", "nip st."));
        RentItemsData.add(new ItemContent(4, "Leather Jacket", 69, "???", "Ple st."));
        RentItemsData.add(new ItemContent(5, "Studio Lights", 69, "Sponsored by Meralco","Meralco st."));
        RentItemsData.add(new ItemContent(6, "Canon Projector", 69, "Canon BALLlll!","Drew's Street"));
        RentItemsData.add(new ItemContent(7, "Bigas", 2, "2 pcs.", "Sesame street"));
        RentItemsData.add(new ItemContent(8, "WalangMaisip", 69, "Whuuuut?","Street street"));
        RentItemsData.add(new ItemContent(9, "AnoPaBa?", 69, "Wala na!","asdasdas street"));
        RentItemsData.add(new ItemContent(10, "Hmm...", 69, "Hidden Markov Model?", "123 bla st. woohoo"));
    }//public void Holder(){

    public List<ItemContent> getRentItemsData(){
        return RentItemsData;
    }

}//public class Data {
