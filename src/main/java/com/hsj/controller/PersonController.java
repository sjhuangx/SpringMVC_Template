package com.hsj.controller;

import com.hsj.model.Person;
import com.hsj.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author seji.huang on 2017/5/17.
 */
@Controller
@ResponseBody
public class PersonController {

    @Resource
    private PersonService personService;

    @RequestMapping(value = "/person/{id}", method = RequestMethod.GET)
    public Person getPerson(@PathVariable("id") Integer id) {
        return personService.getPersonById(id);
    }
}
