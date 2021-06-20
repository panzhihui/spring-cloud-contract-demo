package com.demo.service;

import com.demo.dao.mapper.PersonMapperExt;
import com.demo.dao.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonV2Service {
    @Autowired
    private PersonMapperExt personMapper;

    public Person getById(String id) {
        return personMapper.selectByPrimaryKey(id);
    }
}
