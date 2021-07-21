package com.maven.module;

import org.apache.log4j.Logger;

public class Person {

    final static Logger logger = Logger.getLogger("App");

    private final String name;

    private final String surname;

    private final String phone;

    public Person(String name, String surname, String phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public void printPerson(){
        logger.info(String.format("%s,%s,%s%n", this.name, this.surname, this.phone));
    }
}
