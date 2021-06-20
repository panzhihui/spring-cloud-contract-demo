package com.demo.service;

import com.demo.dao.mapper.PersonMapper;
import com.demo.dao.mapper.PersonMapperExt;
import com.demo.dao.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonMapperExt personMapper;

    public Person getById(String id) {
        return personMapper.selectByPrimaryKey(id);
    }

    public void createPerson(Person person) {
        personMapper.insert(person);
    }

    public List<Person> selectList() {
        return personMapper.selectAll();
    }

}
