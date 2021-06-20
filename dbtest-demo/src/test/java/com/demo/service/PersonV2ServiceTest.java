package com.demo.service;

import ch.vorburger.exec.ManagedProcessException;
import com.demo.ApplicationTest;
import com.demo.dao.model.Person;
import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseOperation;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DatabaseTearDown;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import java.util.List;

@SpringBootTest
@ActiveProfiles("unit")
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class,
        DirtiesContextTestExecutionListener.class,
        TransactionalTestExecutionListener.class,
        DbUnitTestExecutionListener.class})
class PersonV2ServiceTest extends ApplicationTest {
    @Autowired
    private PersonService personService;

    @Test
    @DatabaseSetup(value = "classpath:db/person_test_data.xml")
    @DatabaseTearDown(value = "classpath:db/person_test_data2.xml")
    void getById() {
        Person person = personService.getById("0");
        Assertions.assertEquals(person.getName(), "Mr");

        List<Person> people = personService.selectList();
        Assertions.assertEquals(1, people.size());
    }

    @Test
    void getByIdSecondTest() {
        Person person = personService.getById("0");
        Assertions.assertEquals(person.getName(), "Mrt");

        List<Person> people = personService.selectList();
        Assertions.assertEquals(2, people.size());
    }

    @BeforeAll
    static void setup() throws ManagedProcessException {
        setUpAll();
    }

    @AfterAll
    static void close() {
        shutdown();
    }
}