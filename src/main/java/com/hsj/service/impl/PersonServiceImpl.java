package com.hsj.service.impl;

import com.hsj.dao.PersonMapper;
import com.hsj.model.Person;
import com.hsj.service.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author seji.huang on 2017/6/7.
 */
@Service("PersonService")
public class PersonServiceImpl implements PersonService{

    @Resource
    private PersonMapper personMapper;

    @Override
    public Person getPersonById(Integer id) {
        return personMapper.getPersonById(id);
    }

    @Override
    public Person getPersonByName(String name) {
        return personMapper.getPersonByName(name);
    }

    @Override
    public int insert(Person p) {
        return personMapper.create(p);
    }

    @Override
    public int update(Person p) {
        return personMapper.update(p);
    }

    @Override
    public int deleteById(int id) {
        return personMapper.deleteById(id);
    }
}
