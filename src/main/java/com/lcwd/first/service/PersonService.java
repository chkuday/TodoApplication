package com.lcwd.first.service;

import com.lcwd.first.entity.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    List<Person> personList = new ArrayList<Person>();

    public List<Person> addPerson(Person p)
    {
        personList.add(p);
        return personList;
    }
}
