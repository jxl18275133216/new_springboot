package com.jxl.shabby_for_me.system.entity;

import java.util.Map;

public class User {
    Integer userid;
    String username;
    String userdep;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserdep() {
        return userdep;
    }

    public void setUserdep(String userdep) {
        this.userdep = userdep;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userdep='" + userdep + '\'' +
                '}';
    }
}
