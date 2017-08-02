package com.ycl.spring.pojo;

/**
 * Created by Admin on 2017/8/2.
 */
public class UserEntity {
    private String id;

    private String uname;

    private String ucreatetime;

    private String age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUcreatetime() {
        return ucreatetime;
    }

    public void setUcreatetime(String ucreatetime) {
        this.ucreatetime = ucreatetime;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id='" + id + '\'' +
                ", uname='" + uname + '\'' +
                ", ucreatetime='" + ucreatetime + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
