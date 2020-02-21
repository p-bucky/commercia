package com.prashant.bucky.commercia.Economics_11;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YouTubeContent_Eco_11 {

    /**
     * An array of YouTube videos
     */
    public static List<YouTubeVideo> ITEMS = new ArrayList<>();

    /**
     * A map of YouTube videos, by ID.
     */
    public static Map<String, YouTubeVideo> ITEM_MAP = new HashMap<>();

    static {
        addItem(new YouTubeVideo("O1RuKz19UB4&t=10s", "Economics - Indian Economy on the eve of Independence, XIth, Part - 1"));
        addItem(new YouTubeVideo("iWMLnS58qRg", "Economics - Indian Economy on the eve of Independence, XIth, Part - 2"));
        addItem(new YouTubeVideo("265YNMrUlDQ", "Economics - Economic Planning, XIth, by CA. Pardeep Jha, Part - 1"));
        addItem(new YouTubeVideo("LaRUStGyejk&t=30s", "Economics - Economic Planning, XIth, by CA. Pardeep Jha, Part - 2"));
        addItem(new YouTubeVideo("dsYflqmCEns&t=60s", "Economics - Human Capital Formation- XIth, By CA Pardeep Jha"));
        addItem(new YouTubeVideo("X8u_g4ReTDA", "Correlation Part-1"));
        addItem(new YouTubeVideo("TAPZfCjRv8I&t=29s", "Correlation Part-2"));
        addItem(new YouTubeVideo("jd_KUEUt4Dg&t=35s", "Index Numbers"));
        addItem(new YouTubeVideo("sKPqKl95PKU&t", "Mean Deviation Part-1"));
        addItem(new YouTubeVideo("TR1moWuWVrs&t=40s", "Mean Deviation part-2"));

    }

    private static void addItem(final YouTubeVideo item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A POJO representing a YouTube video
     */
    public static class YouTubeVideo  {
        public String id;
        public String title;

        public YouTubeVideo(String id, String content) {
            this.id = id;
            this.title = content;
        }

        @Override
        public String toString() {
            return title;
        }
    }
}