package com.iesemilidarder.fordummies.core;

/**
 * dummies
 * com.iesemilidarder.fordummies.web
 * Created by ${User} in 15/12/2017
 * Description:
 **/
public class User extends DBObject {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getName() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void beforeSave() {
        doLog(String.format("Saving %s", this.getClass().getCanonicalName()));
    }
}
