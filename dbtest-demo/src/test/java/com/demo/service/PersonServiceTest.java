package com.demo.service;

import ch.vorburger.exec.ManagedProcessException;
import com.demo.ApplicationTest;
import com.demo.dao.model.Person;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;
import java.util.UUID;

@SpringBootTest
@ActiveProfiles("unit")
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PersonServiceTest extends ApplicationTest {
    @Autowired
    private PersonService personService;

    private static final String uid = UUID.randomUUID().toString();

    @Test
    @Order(2)
    void getById() {
        Person person = personService.getById("60ade394-10d7-477d-8aa6-384f59a53ddi");
        Assertions.assertEquals(person.getName(), "PZH");
    }

    @Test
    @Order(1)
    void createPerson() {
        Person person = new Person(uid, "PZH", 18, "HOME HOME", "15215003060", (float) 183.0, (float) 55.0, Boolean.TRUE);
        personService.createPerson(person);
    }

    @Test
    @Order(3)
    void selectList() {
        List<Person> people = personService.selectList();
        Assertions.assertEquals(5, people.size());
    }

    @BeforeAll
    static void setup() throws ManagedProcessException {
        setUpAll();
    }

    @AfterAll
    static void destory(){
        shutdown();
    }

}