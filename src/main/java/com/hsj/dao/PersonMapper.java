package com.hsj.dao;


import com.hsj.model.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonMapper {

    Person getPersonById(Integer id);

    Person getPersonByName(String name);

    int create(Person person);

    int update(Person person);

    int deleteById(Integer id);
}
