package com.liamthedeveloper.scran;

/**
 * Created by liamblack on 30/10/2017.
 */

public class Data {

    private String description;

    private String imagePath;

    public Data(String imagePath, String description) {
        this.imagePath = imagePath;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getImagePath() {
        return imagePath;
    }

}
