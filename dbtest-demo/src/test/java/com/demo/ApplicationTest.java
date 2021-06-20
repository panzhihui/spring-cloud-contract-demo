package com.demo;

import ch.vorburger.exec.ManagedProcessException;
import ch.vorburger.mariadb4j.springframework.MariaDB4jSpringService;


public class ApplicationTest {

    private static MariaDB4jSpringService db;

    public static void setUpAll() throws ManagedProcessException {
        System.out.println("-----------------------db test set up--------------------------");
        db = new MariaDB4jSpringService();
        db.setDefaultPort(3307);
        db.start();
        db.getDB().createDB("testdb");
    }

    public static void shutdown(){
        db.stop();
    }
}