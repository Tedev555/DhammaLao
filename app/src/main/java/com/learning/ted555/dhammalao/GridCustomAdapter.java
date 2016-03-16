package com.learning.ted555.dhammalao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Ted555 on 1/18/2016.
 */
public class GridCustomAdapter extends BaseAdapter {

    Context mContext;
    String[] textStr;
    int[] images;
    public static LayoutInflater mInflater = null;

    GridCustomAdapter(Context mContext, String[] textStr, int[] images){
        this.mContext = mContext;
        this.textStr = textStr;
        this.images = images;
        mInflater = (LayoutInflater)mContext.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public static class ViewHolder{
        public ImageView imageThumbnail;
        public TextView txtViewTitle;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder mViewHolder;
        if (convertView == null){
            mViewHolder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.custom_grid_item, null);

            mViewHolder.txtViewTitle = (TextView)convertView.findViewById(R.id.textView1);
            mViewHolder.imageThumbnail = (ImageView) convertView.findViewById(R.id.image_thumbnail);

            convertView.setTag(mViewHolder);
        }else {
            mViewHolder = (ViewHolder) convertView.getTag();
        }

        mViewHolder.txtViewTitle.setText(textStr[position]);
        mViewHolder.imageThumbnail.setImageResource(images[position]);
        return convertView;
    }
}
