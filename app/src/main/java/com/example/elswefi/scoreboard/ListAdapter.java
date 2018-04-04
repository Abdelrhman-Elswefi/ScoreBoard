package com.example.elswefi.scoreboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by elswe on 04-Apr-18 At 4:06 PM.
 */

public class ListAdapter extends BaseAdapter {

    private Context mContext;
    private Hole[] mHoles;

    public ListAdapter(Context context, Hole[] holes) {
        mContext = context;
        mHoles = holes;
    }

    @Override
    public int getCount() {
        return mHoles.length;
    }

    @Override
    public Object getItem(int i) {
        return mHoles[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        final ViewHolder holder;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.hole_list_item, null);
            holder = new ViewHolder();
            holder.holeNumber = view.findViewById(R.id.holeNumber);
            holder.strokeCount = view.findViewById(R.id.strokeLabel);
            holder.addButton = view.findViewById(R.id.plusButton);
            holder.removeButton = view.findViewById(R.id.minusButton);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        holder.strokeCount.setText(mHoles[i].getStrokeCount() + "");
        holder.holeNumber.setText(mHoles[i].getHoleNumber());
        holder.addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int updateStrokeCount = mHoles[i].getStrokeCount() + 1;
                mHoles[i].setStrokeCount(updateStrokeCount);
                holder.strokeCount.setText(updateStrokeCount + "");
            }
        });
        holder.removeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int updateStrokeCount = mHoles[i].getStrokeCount() - 1;
                if (updateStrokeCount < 0) updateStrokeCount = 0;
                mHoles[i].setStrokeCount(updateStrokeCount);
                holder.strokeCount.setText(updateStrokeCount + "");
            }
        });
        return view;
    }

    public static class ViewHolder {
        TextView holeNumber;
        TextView strokeCount;
        Button addButton;
        Button removeButton;
    }

}
