package com.example.incred_dev.contentprovider;

import java.util.List;

/**
 * Created by incred-dev on 4/6/18.
 */

public class ContactModel {

    public String name;

    public List<String> number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getNumber() {
        return number;
    }

    public void setNumber(List<String> number) {
        this.number = number;
    }
}
