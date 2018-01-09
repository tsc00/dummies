package com.iesemilidarder.fordummies.web;

import com.iesemilidarder.fordummies.core.DBObject;
import com.iesemilidarder.fordummies.core.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Request;

import java.util.ArrayList;
import java.util.List;

import static spark.Spark.*;

public class Launcher {
    private static List<User> IUser = new ArrayList<User>();
    private static final Logger log = LoggerFactory.getLogger(Launcher.class);

    public static void init() {
        for (int i=0;i<10; i++){
            User user = new User();
            user.setId(i);
            user.setName("a" + i);
            user.save();
            IUser.add(user);
        }
        DBObject dbo = IUser.get(0);
        log.info("Loading finished");
    }

    private static boolean shouldReturnHtml(Request request) {
        String accept = request.headers("Accept");
        return accept != null && accept.contains("text/html");
    }
    public static void  main (String... args){
        init();
        port(8080);
        get("/hello", (req, res) -> "Hello World");
    }
}
