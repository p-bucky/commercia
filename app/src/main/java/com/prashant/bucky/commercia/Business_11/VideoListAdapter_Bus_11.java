package com.prashant.bucky.commercia.Business_11;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubeThumbnailLoader;
import com.google.android.youtube.player.YouTubeThumbnailView;

import com.prashant.bucky.commercia.R;

import java.util.HashMap;
import java.util.Map;

public class VideoListAdapter_Bus_11 extends BaseAdapter implements YouTubeThumbnailView.OnInitializedListener {

    private Context mContext;
    private Map<View, YouTubeThumbnailLoader> mLoaders;

    public VideoListAdapter_Bus_11(final Context context) {
        mContext = context;
        mLoaders = new HashMap<>();
    }

    @Override
    public int getCount() {
        return YouTubeContent_Bus_11.ITEMS.size();
    }

    @Override
    public Object getItem(int position) {
        return YouTubeContent_Bus_11.ITEMS.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        VideoListAdapter_Bus_11.VideoHolder holder;

        //The item at the current position
        final YouTubeContent_Bus_11.YouTubeVideo item = YouTubeContent_Bus_11.ITEMS.get(position);

        if (convertView == null) {
            //Create the row
            final LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.row_layout, parent, false);
            //Create the video holder
            holder = new VideoListAdapter_Bus_11.VideoHolder();

            //Set the title
            holder.title = (TextView) convertView.findViewById(R.id.textView_title);
            holder.title.setText(item.title);

            //Initialise the thumbnail
            holder.thumb = (YouTubeThumbnailView) convertView.findViewById(R.id.imageView_thumbnail);
            holder.thumb.setTag(item.id);
            holder.thumb.initialize(mContext.getString(R.string.DEVELOPER_KEY), this);

            convertView.setTag(holder);
        } else {
            //Create it again
            holder = (VideoListAdapter_Bus_11.VideoHolder) convertView.getTag();
            final YouTubeThumbnailLoader loader = mLoaders.get(holder.thumb);

            if (item != null) {
                //Set the title
                holder.title.setText(item.title);

                //Setting the video id can take a while to actually change the image
                //in the meantime the old image is shown.
                //Removing the image will cause the background color to show instead, not ideal
                //but preferable to flickering images.
                holder.thumb.setImageBitmap(null);

                if (loader == null) {
                    //Loader is currently initialising
                    holder.thumb.setTag(item.id);
                } else {
                    //The loader is already initialised
                    //Note that it's possible to get a DeadObjectException here
                    try {
                        loader.setVideo(item.id);
                    } catch (IllegalStateException exception) {
                        //If the Loader has been released then remove it from the map and re-init
                        mLoaders.remove(holder.thumb);
                        holder.thumb.initialize(mContext.getString(R.string.DEVELOPER_KEY), this);

                    }
                }

            }
        }
        return convertView;
    }


    @Override
    public void onInitializationSuccess(YouTubeThumbnailView view, YouTubeThumbnailLoader loader) {
        mLoaders.put(view, loader);
        loader.setVideo((String) view.getTag());
    }

    @Override
    public void onInitializationFailure(YouTubeThumbnailView thumbnailView, YouTubeInitializationResult errorReason) {
        final String errorMessage = errorReason.toString();
        Toast.makeText(mContext, errorMessage, Toast.LENGTH_LONG).show();
    }


    static class VideoHolder {
        YouTubeThumbnailView thumb;
        TextView title;
    }
}
