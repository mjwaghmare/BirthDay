package com.example.mj5waghmare.birthday;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mj5Waghmare on 24-Feb-18.
 */

public class BuddyListAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<Buddy> buddyList;

    public BuddyListAdapter(Context context, int layout, ArrayList<Buddy> buddyList) {
        this.context = context;
        this.layout = layout;
        this.buddyList = buddyList;
    }

    @Override
    public int getCount() {
        return buddyList.size();
    }

    @Override
    public Object getItem(int position) {
        return buddyList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private class ViewHolder{
        ImageView imgbuddy;
        TextView buddyname,buddydob;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        View row = view;
        ViewHolder holder = new ViewHolder();

        if (row == null){
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(layout,null);

            holder.buddyname = (TextView) row.findViewById(R.id.buddyname);
            holder.buddydob = (TextView) row.findViewById(R.id.buddydob);
            holder.imgbuddy = (ImageView) row.findViewById(R.id.imgbuddy);
            row.setTag(holder);
        }
        else {
            holder = (ViewHolder)row.getTag();
        }

        Buddy buddy = buddyList.get(position);

        holder.buddyname.setText(buddy.getName());
        holder.buddydob.setText(buddy.getDob());


        byte[] buddyImage = buddy.getImage();
        Bitmap bitmap = BitmapFactory.decodeByteArray(buddyImage,0,buddyImage.length);
        holder.imgbuddy.setImageBitmap(bitmap);

        return row;
    }
}
