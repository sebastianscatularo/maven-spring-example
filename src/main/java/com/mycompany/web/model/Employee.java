package com.mycompany.web.model;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    private static int lastRecord = 0;
    private String name;
    private String surname;
    private int record;

    public Employee() {
        record = lastRecord++;
    }

    public int getRecord() {
        return record;
    }

    public void setRecord(int record) {
        this.record = record;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
