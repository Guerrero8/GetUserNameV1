package org.example.service;

import com.github.javafaker.Faker;
import org.example.entity.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

public class PersonService {
    public List<Person> generateFakePersons() {
        List<Person> persons = new ArrayList<>();
        Faker faker = new Faker();
        for (int i = 0; i < 1000; i++) {
            Person person = new Person();
            person.setUserName(faker.name().fullName());
            person.setUserLogin(faker.leagueOfLegends().champion());
            person.setSalary(RandomGenerator.getDefault().nextLong());
            persons.add(person);
        }
        int counter = 1;
        for (Person person : persons) {
            System.out.println(counter + " " + person + "\n");
            counter++;
        }
        return persons;
    }
    public List<Person> getFilteredFakePersonsOnSalary(List<Person> persons, long minSalary) {
        List<Person> filteredPersons = new ArrayList<>();
        for (Person person: persons){
            if (person.getSalary() > minSalary){
                filteredPersons.add(person);
            }
        }
        return filteredPersons;
    }

}
