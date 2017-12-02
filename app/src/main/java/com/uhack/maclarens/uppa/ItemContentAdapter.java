package com.uhack.maclarens.uppa;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

/**
 * Created by user on 12/02/2017.
 */

public class ItemContentAdapter extends BaseAdapter{

    private Context mContext;
    private List<ItemContent> RentItemList;

    public ItemContentAdapter(Context mContext, List<ItemContent> RentItemList) {
        this.mContext = mContext;
        this.RentItemList = RentItemList;
    }

    @Override
    public int getCount() {
        return RentItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return RentItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View v = View.inflate(mContext, R.layout.item_main_menu, null);
        ImageView itemImage = (ImageView)v.findViewById(R.id.item_image);
        TextView itemName = (TextView)v.findViewById(R.id.item_name);
        TextView itemPrice = (TextView)v.findViewById(R.id.item_price);
        TextView itemDesc = (TextView)v.findViewById(R.id.item_desc);
        TextView itemLocation = (TextView)v.findViewById(R.id.item_location);

        itemName.setText(RentItemList.get(position).getName());
        NumberFormat f = new DecimalFormat("#0.00");
        itemPrice.setText("Price: "+String.valueOf("P"+f.format(RentItemList.get(position).getPrice())));
        itemDesc.setText("Description: "+RentItemList.get(position).getDescription());
        itemLocation.setText("Location: "+RentItemList.get(position).getLocation());
//        Drawable drawableImage = getResources().getDrawable(RentItemList.drawable.getImage());
//        itemImage.setImageDrawable(drawableImage);

        v.setTag(RentItemList.get(position).getName());
        return v;
    }
}