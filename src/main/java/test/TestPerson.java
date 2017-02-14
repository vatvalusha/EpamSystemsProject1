package test;

import people.Person;

/**
 * Created by vatva on 14.02.2017.
 */
public class TestPerson {
    public static void main(String[] args) {
        Person person = Person.createPerson();
        System.out.println(person);
    }
}
