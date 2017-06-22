package com.example.android.fribourgtourguide;

public class Lakes {

    // Drawable resource ID
    private int mImageResourceId;

    // Name of the lake in Fribourg county
    private String mLakeName;

    // High of the lake in meters
    private String mLakeInfos;

    /*
    * Create a new AndroidFlavor object.
    * @Params : image, name, high of the lake object
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


