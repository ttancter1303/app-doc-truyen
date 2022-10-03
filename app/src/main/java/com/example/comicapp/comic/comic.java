package com.example.comicapp.comic;

public class comic {
    private int id;
    private String imgResouce;
    private String name;
    private String describe;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgResouce() {
        return imgResouce;
    }

    public void setImgResouce(String imgResouce) {
        this.imgResouce = imgResouce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String content;

    public comic(int id, String imgResouce, String name, String describe, String content) {
        this.id = id;
        this.imgResouce = imgResouce;
        this.name = name;
        this.describe = describe;
        this.content = content;
    }
}
