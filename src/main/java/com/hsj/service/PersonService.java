package com.hsj.service;

import com.hsj.model.Person;
import org.springframework.stereotype.Service;

/**
 * @author seji.huang on 2017/5/17.
 */
@Service("PersonService")
public class PersonService {

    public Person getPersonById(Integer id) {
        Person person = new Person();
        person.setId(id);
        person.setName("Allen");
        person.setAge(20);
        person.setEmail("Allen@gmail.com");
        return person;
    }
}
