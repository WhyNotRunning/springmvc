package com.iwooto.entity.weichat.response;


/**
 * Created by Administrator on 14-3-2.
 */
public class WeiChatUser {
    private byte subscribe;
    private String openid;
    private String nickname;
    private byte sex;
    private String city;
    private String country;
    private String province;
    private String language;
    private String headimgurl;
    private long subscribe_time;

    public long getSubscribe_time () {
        return subscribe_time;
    }

    public void setSubscribe_time (long subscribe_time) {
        this.subscribe_time = subscribe_time;
    }

    public String getOpenid () {
        return openid;
    }

    public void setOpenid (String openid) {
        this.openid = openid;
    }

    public String getNickname () {
        return nickname;
    }

    public void setNickname (String nickname) {
        this.nickname = nickname;
    }

    public byte getSex () {
        return sex;
    }

    public void setSex (byte sex) {
        this.sex = sex;
    }

    public String getCity () {
        return city;
    }

    public void setCity (String city) {
        this.city = city;
    }

    public String getCountry () {
        return country;
    }

    public void setCountry (String country) {
        this.country = country;
    }

    public String getProvince () {
        return province;
    }

    public void setProvince (String province) {
        this.province = province;
    }

    public String getLanguage () {
        return language;
    }

    public void setLanguage (String language) {
        this.language = language;
    }

    public String getHeadimgurl () {
        return headimgurl;
    }

    public void setHeadimgurl (String headimgurl) {
        this.headimgurl = headimgurl;
    }

    public byte getSubscribe () {
        return subscribe;
    }

    public void setSubscribe (byte subscribe) {
        this.subscribe = subscribe;
    }
}
