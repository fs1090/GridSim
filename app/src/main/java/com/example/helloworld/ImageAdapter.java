package com.example.helloworld;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    // this will be the reference to our mainActivity app env
    private Context context;
    private int imageRID;

    // constructor to get the image and put it with the context (env)
    public ImageAdapter(Context context, int imageRID) {
        this.context = context;
        this.imageRID = imageRID;
    }

    public int getCount() { //return the amount of images
        return 256;
    }

    public Object getItem(int position) {
        return imageRID;
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView(context);

            // Use WRAP_CONTENT so spacing works
            imageView.setLayoutParams(new GridView.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT));

            // Center images inside their cell
            imageView.setAdjustViewBounds(true);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);

            // Padding = spacing inside each cell
            imageView.setPadding(4, 4, 4, 4);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(imageRID);
        return imageView;
    }
}
