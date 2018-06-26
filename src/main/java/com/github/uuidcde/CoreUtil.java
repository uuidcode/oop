package com.github.uuidcde;

import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CoreUtil {
    private static Gson gson = new GsonBuilder().setPrettyPrinting()
        .create();

    public static String toJson(Object object) {
        return gson.toJson(object);
    }

    public static String createUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
