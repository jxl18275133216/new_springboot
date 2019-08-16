package com.jxl.shabby_for_me.customer.entity;

import java.util.Calendar;

public class Customer {
    int id;
    String cname;
    String cpassword;
    //用户级别 0-root 1-manager 8-member 9-visitor
    int grade;
    //真实姓名
    String name;
    /*
        性别:1-男 0-女
     */
    int gender;
    Calendar birth;
    /*身份证件
        0-身份证
        9-其他
     */
    int identifyType;
    String identifyDoc;
    /*
        联系方式 0-固话 1-移动电话 2-QQ 3-微信 9-其他
     */
    int notifyType;
    String notifyDoc;
    //住址
    String address;
    /*
    安全问题
     */
    int protectionType;
    String protectionDoc;
    //创建及修改事件，创建事件不允许修改
    Calendar createTime;
    Calendar modifyTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Calendar getBirth() {
        return birth;
    }

    public void setBirth(Calendar birth) {
        this.birth = birth;
    }

    public int getIdentifyType() {
        return identifyType;
    }

    public void setIdentifyType(int identifyType) {
        this.identifyType = identifyType;
    }

    public String getIdentifyDoc() {
        return identifyDoc;
    }

    public void setIdentifyDoc(String identifyDoc) {
        this.identifyDoc = identifyDoc;
    }

    public int getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(int notifyType) {
        this.notifyType = notifyType;
    }

    public String getNotifyDoc() {
        return notifyDoc;
    }

    public void setNotifyDoc(String notifyDoc) {
        this.notifyDoc = notifyDoc;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getProtectionType() {
        return protectionType;
    }

    public void setProtectionType(int protectionType) {
        this.protectionType = protectionType;
    }

    public String getProtectionDoc() {
        return protectionDoc;
    }

    public void setProtectionDoc(String protectionDoc) {
        this.protectionDoc = protectionDoc;
    }

    public Calendar getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Calendar createTime) {
        this.createTime = createTime;
    }

    public Calendar getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Calendar modifyTime) {
        this.modifyTime = modifyTime;
    }
}
