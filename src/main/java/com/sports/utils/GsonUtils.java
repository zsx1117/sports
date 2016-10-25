package com.sports.utils;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Gundam on 2016/10/25.
 */
public class GsonUtils {
    private Gson gson = new Gson();

    public Gson getGson() {
        return gson;
    }

    public void setGson(Gson gson) {
        this.gson = gson;
    }

    public String toJson(List list){
        return gson.toJson(list);
    }

    public String toJson(Object obj){
        return gson.toJson(obj);
    }

    /**
     * 解析单个object
     * @param json
     * @param tClass
     * @param <T>
     * @return
     */
    public <T>T fromJson(String json,Class<T> tClass){
        return gson.fromJson(json, tClass);
    }

    /**
     * 输入包含多个objet的Json解析
     * @param jsonString
     * @param tClass
     * @param <T>
     * @return list
     */
    public  <T> List<T> fromJsonToList (String jsonString, Class<T> tClass) {
        JsonArray array= new JsonParser().parse(jsonString).getAsJsonArray();
        List<T> list = new ArrayList<T>();
        for (final JsonElement element :array){
            list.add(gson.fromJson(element,tClass));
        }
        return list;
    }

    /**
     * 输入包含多种类objet的Json解析
     * @param jsonString
     * @return
     */
    public  List<Map<String, Object>> fromJsonMapToList(String jsonString) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        list = gson.fromJson(jsonString,
                new TypeToken<List<Map<String, Object>>>() {
                }.getType());
        return list;
    }

    private GsonUtils(){
    }
    private static volatile GsonUtils instance = null;


    public static GsonUtils getInstance() {
        if (instance == null) {
            synchronized (GsonUtils.class) {
                if (instance  == null) {
                    instance  = new GsonUtils();
                }
            }
        }
        return instance;
    }

}
