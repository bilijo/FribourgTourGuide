package com.example.android.fribourgtourguide;

public class Musees {


    // Name of the Musee in Fribourg county
    private String mMuseeName;

    // High of the Musee in meters
    private String mMuseeInfos;

    /*
    * Create a new Musee object.
    */
    public Musees(String vName, String vInfos) {
        mMuseeName = vName;
        mMuseeInfos = vInfos;
     }

    /**
     * Get the name of the Musee
     */
    public String getMuseeName() {
        return mMuseeName;
    }

    /**
     * Get the High of the Musee
     */
    public String getMuseeInfos() {
        return mMuseeInfos;
    }


}


