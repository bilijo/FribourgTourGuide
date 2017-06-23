package com.example.android.fribourgtourguide;

public class Recipes {

    // Drawable resource ID
    private int mImageResourceId;

    // Name of the recipe in Fribourg county
    private String mRecipeName;

    // Area of the recipe in meters square
    private String mRecipeInfos;

    /*
    * Create a new Recipe object.
    * @Params : image, name, area of the recipe object
    */
    public Recipes(int imageResourceId, String vName, String vInfos) {
        mRecipeName = vName;
        mRecipeInfos = vInfos;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get the name of the recipe
     */
    public String getRecipeName() {
        return mRecipeName;
    }

    /**
     * Get the High of the recipe
     */
    public String getRecipeInfos() {
        return mRecipeInfos;
    }


}


