package com.iesemilidarder.fordummies.web;

import com.iesemilidarder.fordummies.core.User;

import java.util.ArrayList;
import java.util.List;

import static spark.Spark.*;

public class Launcher {
    private static List<User> IUser = new ArrayList<User>();

    public static void init() {
        for (int i=0;i<10; i++){
            User user = new User();
            user.setId(i);
            user.setName("a" + i);
            user.save();
            IUser.add(user);
        }
    }
    public static void  main (String... args){
        init();
        port(8080);
        get("/hello", (req, res) -> "Hello World");
    }
}
