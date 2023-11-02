package com.company.project.lesson14;

public class User<T> {
    private T id;
    private String userName;

    public User(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}

/*class Admin extends User<Integer> {}
class Admin<T>  extends User<T> {}
class Admin<T, K> extends User<T> {
    private K code;*/
