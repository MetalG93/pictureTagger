package com.example.domain.entitiy;

import java.util.ArrayList;
import java.util.List;

public class Tag {
    String name;
    List<Picture> pictures;

    public Tag() {
        pictures=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }

    public void addPicture(Picture picture) {
        this.pictures.add(picture);
    }
}
