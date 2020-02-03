package com.example.domain.entitiy;

import java.util.ArrayList;
import java.util.List;


public class Picture {
    Long id;
    String url;
    List<Tag> tags;

    public Picture() {
        tags=new ArrayList<>();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public void addTag(Tag tag) {
        this.tags.add(tag);
    }
}
