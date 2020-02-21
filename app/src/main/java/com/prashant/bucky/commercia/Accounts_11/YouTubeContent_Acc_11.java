package com.prashant.bucky.commercia.Accounts_11;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YouTubeContent_Acc_11 {

    /**
     * An array of YouTube videos
     */
    public static List<YouTubeVideo> ITEMS = new ArrayList<>();

    /**
     * A map of YouTube videos, by ID.
     */
    public static Map<String, YouTubeVideo> ITEM_MAP = new HashMap<>();

    static {
        addItem(new YouTubeVideo("aM2ojgjQkws", "XIth Accounting basics & Journal entries"));
        addItem(new YouTubeVideo("gQiPneXEYHs&t=38s", "Bank Reconciliation Statement - BRS Simplified - XIth, CPT - CA Pardeep Jha, Part - 2"));
        addItem(new YouTubeVideo("aM2ojgjQkws", "XIth Accounting basics & Journal entries"));
        addItem(new YouTubeVideo("0R0SNfYgmjc&t=14s", "Introduction to accounting [Journal- Ledger & Trial balance] simple method(by kauserwise) []"));
        addItem(new YouTubeVideo("-VNavTRLJAE", "Bills of Exchange Accounting Entries Drawer and Drawee 15.1 (T S Grewal)"));
        addItem(new YouTubeVideo("962Az84Tb1c", "Introduction to Bills of Exchange15.1 (T S Grewal)"));
        addItem(new YouTubeVideo("aM2ojgjQkws", "XIth Accounting basics & Journal entries"));
        addItem(new YouTubeVideo("-bTURrayLDE", "1 1 Introduction to Accounting 2015"));


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