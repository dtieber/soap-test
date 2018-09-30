package com.rbmh.soap;

import com.rbmh.model.Person;

import javax.jws.WebService;

@WebService(endpointInterface = "com.rbmh.soap.PersonService")
public class PersonServiceImpl implements PersonService {
    public boolean addPerson(Person p) {
        return false;
    }

    public boolean deletePerson(int id) {
        return false;
    }

    public Person getPerson(int id) {
        return null;
    }

    public Person[] getAllPersons() {
        return new Person[0];
    }
}
