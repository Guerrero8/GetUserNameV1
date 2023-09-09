package org.example.service;

import com.github.javafaker.Faker;
import org.example.entity.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    public void generateFakePersons() {
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            Faker faker = new Faker();
            Person person = new Person();
            person.setUserName(faker.name().fullName());
            person.setUserLogin(faker.leagueOfLegends().champion());
            persons.add(person);
        }
        int counter = 1;
        for (Person person : persons) {
            System.out.println(counter + " " + person + "\n");
            counter++;

        }
    }

}
