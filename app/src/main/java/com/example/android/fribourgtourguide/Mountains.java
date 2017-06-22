package com.example.android.fribourgtourguide;

public class Mountains {

    // Drawable resource ID
    private int mImageResourceId;

    // Name of the mountain in Fribourg county
    private String mMountainName;

    // High of the mountain in meters
    private String mMountainHigh;

    /*
    * Create a new AndroidFlavor object.
    * @Params : image, name, high of the mountain object
    */
    public Mountains(int imageResourceId, String vName, String vHigh) {
        mMountainName = vName;
        mMountainHigh = vHigh;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get the name of the mountain
     */
    public String getmMountainName() {
        return mMountainName;
    }

    /**
     * Get the High of the mountain
     */
    public String getMountainHigh() {
        return mMountainHigh;
    }


}


