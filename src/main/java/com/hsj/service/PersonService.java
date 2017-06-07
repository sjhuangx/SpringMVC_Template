package com.hsj.service;

import com.hsj.model.Person;

/**
 * @author seji.huang on 2017/5/17.
 */
public interface PersonService {

    Person getPersonById(Integer id);

    Person getPersonByName(String name);

    int insert(Person p);

    int update(Person p);

    int deleteById(int id);
}
