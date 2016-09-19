package utils;
import com.google.gson.Gson;

import java.util.List;

/**
 * Created by Gundam on 2016/9/19.
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
