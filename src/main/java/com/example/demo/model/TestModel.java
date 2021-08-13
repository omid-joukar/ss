package com.example.demo.model;

import java.util.List;

public class TestModel {

    private String name;
    private List<String> strings;

    public TestModel() {
    }

    public TestModel(String name, List<String> strings) {
        this.name = name;
        this.strings = strings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }
}
