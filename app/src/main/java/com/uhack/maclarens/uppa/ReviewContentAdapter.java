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

public class ReviewContentAdapter extends BaseAdapter{

    private Context mContext;
    private List<ItemContent> ReviewList;

    public ReviewContentAdapter(Context mContext, List<ItemContent> ReviewList) {
        this.mContext = mContext;
        this.ReviewList = ReviewList;
    }

    @Override
    public int getCount() {
        return ReviewList.size();
    }

    @Override
    public Object getItem(int position) {
        return ReviewList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View v = View.inflate(mContext, R.layout.item_main_menu, null);
//        TextView itemName = (TextView)v.findViewById(R.id.item_name);
//        TextView itemPrice = (TextView)v.findViewById(R.id.item_price);
//
//        itemName.setText(ReviewList.get(position).getName());
//        itemPrice.setText(ReviewList.get(position).getPrice());
//        Drawable drawableImage = getResources().getDrawable(RentItemList.drawable.getImage());
//        itemImage.setImageDrawable(drawableImage);

        v.setTag(ReviewList.get(position).getName());
        return v;
    }
}