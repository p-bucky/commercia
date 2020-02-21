package com.prashant.bucky.commercia.Business_11;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YouTubeContent_Bus_11 {

    /**
     * An array of YouTube videos
     */
    public static List<YouTubeContent_Bus_11.YouTubeVideo> ITEMS = new ArrayList<>();

    /**
     * A map of YouTube videos, by ID.
     */
    public static Map<String, YouTubeContent_Bus_11.YouTubeVideo> ITEM_MAP = new HashMap<>();

    static {
        addItem(new YouTubeContent_Bus_11.YouTubeVideo("vsU4yNuW3LI", "Small Business lecture business studies"));
        addItem(new YouTubeContent_Bus_11.YouTubeVideo("Hq7ka3HM9VM", "Private,public and global enterprises Cl XI Bussiness Studies by Ruby Singh"));
        addItem(new YouTubeContent_Bus_11.YouTubeVideo("NIVK5-w0_vg", "Types of Shares Their Merits and Demerits Cl XI Bussiness Studies by Ruby Singh"));
        addItem(new YouTubeContent_Bus_11.YouTubeVideo("ut3m5d7wOiU", "Debentures and Retained Earnings Merits and Demerits Cl XI Bussiness Studies by Ruby Singh"));
        addItem(new YouTubeContent_Bus_11.YouTubeVideo("w8V60S7lO60", "International Financing Cl XI Bussiness Studies by Ruby Singh"));
        addItem(new YouTubeContent_Bus_11.YouTubeVideo("DoJYM1oG9JI", "Banking Services Cl XI Bussiness Studies by Ruby Singh"));
        addItem(new YouTubeContent_Bus_11.YouTubeVideo("Gtufhvsklcg", "Insurance Services Cl XI Bussiness Studies by Ruby Singh"));
        addItem(new YouTubeContent_Bus_11.YouTubeVideo("mqF7TiVOFPs", "Postal and Communication Services Cl XI Bussiness Studies by Ruby Singh"));
        addItem(new YouTubeContent_Bus_11.YouTubeVideo("SKha2sekaOg", "Outsourcing Cl XI Bussiness Studies by Ruby Singh"));
        addItem(new YouTubeContent_Bus_11.YouTubeVideo("o8MLFUG6Oto", "Introduction & Scope of E Business and Diffrence Between Traditional Business & E Business Cl XI Bus"));


    }

    private static void addItem(final YouTubeContent_Bus_11.YouTubeVideo item) {
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