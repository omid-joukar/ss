package com.example.demo.controllers;

import com.example.demo.model.TestModel;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {
    private TestModel testModel;

    public TestController() {
        this.testModel = new TestModel();
        List<String> strings = new ArrayList<>();
        testModel.setName("omid");
        testModel.setStrings(strings);
    }

    @GetMapping("/")
    public TestModel returnValue(){
        if (this.testModel.getStrings().size() == 0){
            this.testModel.setStrings(null);
        }
        return testModel;
    }
}
