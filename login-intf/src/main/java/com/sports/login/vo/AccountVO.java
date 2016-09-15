package com.sports.login.vo;

/**
 * Created by Gundam on 2016/9/14.
 */
import java.io.Serializable;
public class AccountVO implements Serializable{

    private String  name;
    private Integer sex;
    private String  icon;
    private String  signature;  //登录设备信息
    private String  sign;       // 用户个性签名
    private String  area;       // 用户所在区域
    private String  token;      // 用户与服务器交互的唯一标
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


}
