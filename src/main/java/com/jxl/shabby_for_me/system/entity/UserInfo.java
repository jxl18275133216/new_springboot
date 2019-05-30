package com.jxl.shabby_for_me.system.entity;

import java.util.Date;

public class UserInfo {
    Integer id;
    String firstName;
    String lastName;
    String tel;
    String email;
    Integer contactType;
    String contactInfo;
    Integer documentType;
    String documentInfo;
    Integer gender;
    Date birthday;
    String language;
    String address_Country;
    String address_province;
    String address_City;
    Date createtime;
    Date modifytime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getContactType() {
        return contactType;
    }

    public void setContactType(Integer contactType) {
        this.contactType = contactType;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Integer getDocumentType() {
        return documentType;
    }

    public void setDocumentType(Integer documentType) {
        this.documentType = documentType;
    }

    public String getDocumentInfo() {
        return documentInfo;
    }

    public void setDocumentInfo(String documentInfo) {
        this.documentInfo = documentInfo;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAddress_Country() {
        return address_Country;
    }

    public void setAddress_Country(String address_Country) {
        this.address_Country = address_Country;
    }

    public String getAddress_province() {
        return address_province;
    }

    public void setAddress_province(String address_province) {
        this.address_province = address_province;
    }

    public String getAddress_City() {
        return address_City;
    }

    public void setAddress_City(String address_City) {
        this.address_City = address_City;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", contactType=" + contactType +
                ", contactInfo='" + contactInfo + '\'' +
                ", documentType=" + documentType +
                ", documentInfo='" + documentInfo + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", language='" + language + '\'' +
                ", address_Country='" + address_Country + '\'' +
                ", address_province='" + address_province + '\'' +
                ", address_City='" + address_City + '\'' +
                ", createtime=" + createtime +
                ", modifytime=" + modifytime +
                '}';
    }
}
