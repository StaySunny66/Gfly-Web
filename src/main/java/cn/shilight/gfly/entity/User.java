package cn.shilight.gfly.entity;

public class User {
    private String userid;
    private  String username;
    private String password;
    private String nickname;

    public User(String userid, String user, String password, String nickname) {
        this.userid = userid;
        this.username = user;
        this.password = password;
        this.nickname = nickname;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUser() {
        return userid;
    }

    public void setUser(String user) {
        this.userid = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
