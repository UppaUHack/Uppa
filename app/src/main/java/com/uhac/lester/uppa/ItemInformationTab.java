package com.uhack.maclarens.uppa;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class ItemInformationTab extends AppCompatActivity {

    private ListView lvRentList;
    private ItemContentAdapter adapter;
    private List<ItemContent> RentItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_information);

        TextView item_name2 = (TextView)findViewById(R.id.item_name2);
        item_name2.setText(MainActivity.selectedName);
        TextView item_price2 = (TextView)findViewById(R.id.item_price2);
        NumberFormat fo = new DecimalFormat("#0.00");
        item_price2.setText("Price: P"+String.valueOf(fo.format(MainActivity.selectedPrice)));
        TextView item_location2 = (TextView)findViewById(R.id.item_location2);
        item_location2.setText("Location: "+MainActivity.selectedLocation);
        TextView item_desc2 = (TextView)findViewById(R.id.item_desc2);
        item_desc2.setText("Description: "+MainActivity.selectedDesc);


    }//protected void onCreate(Bundle savedInstanceState) {


}//public class RentMainMenu extends Activity {
