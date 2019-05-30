package com.jxl.shabby_for_me.system.entity;

public class UserGrade {
    Integer id;
    Integer permission;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPermission() {
        return permission;
    }

    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    @Override
    public String toString() {
        return "UserGrade{" +
                "id=" + id +
                ", permission=" + permission +
                '}';
    }
}
