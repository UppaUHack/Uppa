package com.uhack.maclarens.uppa;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public static String  selectedName;
    public static Double selectedPrice;
    public static String selectedDesc;
    public static String selectedLocation;
    private ListView lvRentList;
    private ItemContentAdapter adapter;
    private List<ItemContent> RentItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);

        // TOOLBAR
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       // DRAWER LAYOUT
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        // NAVIGATION VIEW
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

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

                Intent startItemInformation = new Intent(MainActivity.this, ItemInformationTab.class);
                startActivity(startItemInformation);
            }
        });

    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch (id){

            case R.id.nav_browse:
                Intent browse= new Intent(MainActivity.this,Browse.class);
                startActivity(browse);
                break;

            case R.id.nav_category:
                Intent category= new Intent(MainActivity.this,Category.class);
                startActivity(category);
                break;

            case R.id.nav_mapitems:
                Intent mapitems= new Intent(MainActivity.this,MapItems.class);
                startActivity(mapitems);
                break;

            case R.id.nav_mycart:
                Intent mycart= new Intent(MainActivity.this,MyCart.class);
                startActivity(mycart);
                break;

            case R.id.nav_settings:
                Intent settings= new Intent(MainActivity.this,Settings.class);
                startActivity(settings);
                break;

            case R.id.nav_aboutuppa:
                Intent about= new Intent(MainActivity.this,AboutUppa.class);
                startActivity(about);
                break;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
