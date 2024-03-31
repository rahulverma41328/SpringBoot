package com.rahul.springbootproject1.controllers;

import com.rahul.springbootproject1.config.LCWDConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HomeController {

    @Value("${lcwr.profile.image.path}")
    private String profilePath;

    @Autowired
    private LCWDConfig lcwrConfig;
    @RequestMapping("/todos")
    public static List<String> justTest(){
        List<String> todos = Arrays.asList("Learn java","learn spring boo","I'm rahul");
        return todos;
    }

    @RequestMapping("/profile-path")
    public String getProfilePath(){
        return this.profilePath;
    }


    @RequestMapping("/lcwrConfig")
    public LCWDConfig getLcwrConfig(){
        System.out.println(this.lcwrConfig);
        return this.lcwrConfig;
    }
}
