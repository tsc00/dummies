package com.iesemilidarder.fordummies.core;

/**
 * dummies
 * com.iesemilidarder.fordummies.core
 * Created by ${User} in 19/12/2017
 * Description:
 **/
public class ReviewItem extends DBObject {
    private int id;
    private String name;
    private String location;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    protected void beforeSave() {
        doLog("todo!");
    }
}
