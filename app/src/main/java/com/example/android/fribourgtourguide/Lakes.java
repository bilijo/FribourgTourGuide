package com.example.android.fribourgtourguide;

public class Lakes {

    // Drawable resource ID
    private int mImageResourceId;

    // Name of the lake in Fribourg county
    private String mLakeName;

    // Area of the lake in meters square
    private String mLakeInfos;

    /*
    * Create a new Lake object.
    * @Params : image, name, area of the lake object
    */
    public Lakes(int imageResourceId, String vName, String vInfos) {
        mLakeName = vName;
        mLakeInfos = vInfos;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get the name of the lake
     */
    public String getmLakeName() {
        return mLakeName;
    }

    /**
     * Get the High of the lake
     */
    public String getLakeInfos() {
        return mLakeInfos;
    }


}


