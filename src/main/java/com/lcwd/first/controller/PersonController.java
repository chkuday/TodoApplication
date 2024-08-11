package com.lcwd.first.controller;


import com.lcwd.first.entity.Person;
import com.lcwd.first.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/add")
    public List<Person> add(@RequestBody Person p)
    {
       List<Person> list= personService.addPerson(p);
       System.out.println("change in controller");
        System.out.println("some enhancement controller");

    //changes from github
        // changes from local
        // some enhancement
       return list;
    }

}
