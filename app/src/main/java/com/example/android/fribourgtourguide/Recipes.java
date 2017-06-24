package com.example.android.fribourgtourguide;

public class Recipes {

    // Drawable resource ID
    private int mImageResourceId;

    // Name of the recipe find in Fribourg county
    private String mRecipeName;

    // Information of the recipe
    private String mRecipeInfos;

    // Information about a restaurant to eat the recipe
    private String mRecipeRestos;

    /*
    * Create a new Recipe object.
    * @Params : image, name, descrioptionof the recipe, restaurant to eat the recipe
    */
    public Recipes(int imageResourceId, String vName, String vInfos, String vRestos) {
        mRecipeName = vName;
        mRecipeInfos = vInfos;
        mRecipeRestos = vRestos;
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
     * Information about the recipe
     */
    public String getRecipeInfos() {
        return mRecipeInfos;
    }

    /**
     * Adress of restaurant
     */
    public String getRecipeRestos() {
        return mRecipeRestos;
    }




}


