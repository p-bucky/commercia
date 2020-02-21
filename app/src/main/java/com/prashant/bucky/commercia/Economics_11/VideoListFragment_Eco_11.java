package com.prashant.bucky.commercia.Economics_11;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ListView;

import com.google.android.youtube.player.YouTubeIntents;
import com.google.android.youtube.player.YouTubeStandalonePlayer;
import com.prashant.bucky.commercia.CustomLightboxActivity;
import com.prashant.bucky.commercia.R;

public class VideoListFragment_Eco_11 extends ListFragment  {


    public VideoListFragment_Eco_11() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new VideoListAdapter_Eco_11(getActivity()));
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        final Context context = getActivity();
        final String DEVELOPER_KEY = getString(R.string.DEVELOPER_KEY);
        final YouTubeContent_Eco_11.YouTubeVideo video = YouTubeContent_Eco_11.ITEMS.get(position);

        switch (position) {
            case 0:
                final Intent lightboxIntent = new Intent(context, CustomLightboxActivity.class);
                lightboxIntent.putExtra(CustomLightboxActivity.KEY_VIDEO_ID, video.id);
                startActivity(lightboxIntent);

                break;
            case 1:
                final Intent lightboxIntent1 = new Intent(context, CustomLightboxActivity.class);
                lightboxIntent1.putExtra(CustomLightboxActivity.KEY_VIDEO_ID, video.id);
                startActivity(lightboxIntent1);

                break;
            case 2:
                final Intent lightboxIntent2 = new Intent(context, CustomLightboxActivity.class);
                lightboxIntent2.putExtra(CustomLightboxActivity.KEY_VIDEO_ID, video.id);
                startActivity(lightboxIntent2);

                break;
            case 3:
                final Intent lightboxIntent3 = new Intent(context, CustomLightboxActivity.class);
                lightboxIntent3.putExtra(CustomLightboxActivity.KEY_VIDEO_ID, video.id);
                startActivity(lightboxIntent3);

                break;

            case 4:
                final Intent lightboxIntent4 = new Intent(context, CustomLightboxActivity.class);
                lightboxIntent4.putExtra(CustomLightboxActivity.KEY_VIDEO_ID, video.id);
                startActivity(lightboxIntent4);

                break;
            case 5:
                final Intent lightboxIntent5 = new Intent(context, CustomLightboxActivity.class);
                lightboxIntent5.putExtra(CustomLightboxActivity.KEY_VIDEO_ID, video.id);
                startActivity(lightboxIntent5);

                break;
            case 6:
                final Intent lightboxIntent6 = new Intent(context, CustomLightboxActivity.class);
                lightboxIntent6.putExtra(CustomLightboxActivity.KEY_VIDEO_ID, video.id);
                startActivity(lightboxIntent6);

                break;
            case 7:
                final Intent lightboxIntent7 = new Intent(context, CustomLightboxActivity.class);
                lightboxIntent7.putExtra(CustomLightboxActivity.KEY_VIDEO_ID, video.id);
                startActivity(lightboxIntent7);

                break;
            case 8:
                final Intent lightboxIntent8 = new Intent(context, CustomLightboxActivity.class);
                lightboxIntent8.putExtra(CustomLightboxActivity.KEY_VIDEO_ID, video.id);
                startActivity(lightboxIntent8);

                break;
            case 9:
                final Intent lightboxIntent9 = new Intent(context, CustomLightboxActivity.class);
                lightboxIntent9.putExtra(CustomLightboxActivity.KEY_VIDEO_ID, video.id);
                startActivity(lightboxIntent9);

                break;

        }
    }

}
