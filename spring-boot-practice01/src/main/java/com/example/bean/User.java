package com.example.bean;

public class User {



    /**
     * id :
     * name :
     * telephone :
     */

    private int id;
    private String name;
    private String telephone;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }

    public User(int id, String name, String telephone) {
        this.id = id;
        this.name = name;
        this.telephone = telephone;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
