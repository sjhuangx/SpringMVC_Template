package com.hsj.controller;

import com.hsj.model.Person;
import com.hsj.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/person", method = RequestMethod.POST)
    public Person insertPerson(@RequestBody Person person) {
        personService.insert(person);
        return personService.getPersonByName(person.getName());
    }

    @RequestMapping(value = "/person/{id}", method = RequestMethod.PUT)
    public Person updatePersonById(@PathVariable("id") Integer id,
                                   @RequestBody Person person) {
        personService.update(person);
        return personService.getPersonById(id);
    }

    @RequestMapping(value = "/person/{id}", method = RequestMethod.DELETE)
    public int deletePersonById(@PathVariable("id") Integer id) {
        return personService.deleteById(id);
    }
}
