package com.uhack.maclarens.uppa;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class RentMainMenu extends AppCompatActivity {

    public static String  selectedName;
    public static Double selectedPrice;
    public static String selectedDesc;
    public static String selectedLocation;
    private ListView lvRentList;
    private ItemContentAdapter adapter;
    private List<ItemContent> RentItems;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_browse);

        lvRentList = (ListView)findViewById(R.id.rent_list);
        RentItems = new ArrayList<>();
        RentItems.add(new ItemContent(1, "Toothbrush", 69, "Slightly used.", "Mabait St."));
        RentItems.add(new ItemContent(2, "Brief", 69, "Ginagamit lagi.", "Lester st."));
        RentItems.add(new ItemContent(3, "Bike", 69, "From Tian", "nip st."));
        RentItems.add(new ItemContent(4, "Leather Jacket", 69, "???", "Ple st."));
        RentItems.add(new ItemContent(5, "Studio Lights", 69, "Sponsored by Meralco","Meralco st."));
        RentItems.add(new ItemContent(6, "Canon Projector", 69, "Canon BALLlll!","Drew's Street"));
        RentItems.add(new ItemContent(7, "Bigas", 2, "2 pcs.", "Sesame street"));
        RentItems.add(new ItemContent(8, "WalangMaisip", 69, "Whuuuut?","Street street"));
        RentItems.add(new ItemContent(9, "AnoPaBa?", 69, "Wala na!","asdasdas street"));
        RentItems.add(new ItemContent(10, "Hmm...", 69, "Hidden Markov Model?", "123 bla st. woohoo"));
        adapter = new ItemContentAdapter(getApplicationContext(), RentItems);
        lvRentList.setAdapter(adapter);

//        lvRentList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                Toast.makeText(getApplicationContext(),"Shoplifting! Nasa cart mo na ang "+view.getTag(), Toast.LENGTH_SHORT).show();
//            }
//        });

        lvRentList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //long sample  = (lvRentList.getItemIdAtPosition(position));
                selectedName = RentItems.get(position).getName();
                selectedPrice = RentItems.get(position).getPrice();
                selectedDesc = RentItems.get(position).getDescription();
                selectedLocation = RentItems.get(position).getLocation();

                Intent startItemInformation = new Intent(RentMainMenu.this, ItemInformationTab.class);
                startActivity(startItemInformation);
            }
        });

    }//protected void onCreate(Bundle savedInstanceState) {
}//public class RentMainMenu extends Activity {
