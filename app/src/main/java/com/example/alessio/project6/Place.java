package com.example.alessio.project6;

public class Place {

    /*Fields*/
    private String mName;
    private String mAddress;
    private String mDescription;
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    /*Constant definition*/
    private static final int NO_IMAGE_PROVIDED = -1;

    /*Constructor Method*/
    public Place(String name, String address, String description, int imageResourceID){
        mName = name;
        mAddress = address;
        mDescription = description;
        mImageResourceID = imageResourceID;
    }

    /*Helper Methods*/
    public String getName(){
        return mName;
    }
    public String getAddress(){
        return mAddress;
    }
    public String getDescription(){
        return mDescription;
    }
    public int getImageResourceID(){
        return mImageResourceID;
    }
    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }
}
