package com.example.demo;

import io.swagger.annotations.ApiModelProperty;

public class Contact {
    @ApiModelProperty(notes="unique id only")
    private String id;
    private String name;
    private String phone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Contact(String id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

}
