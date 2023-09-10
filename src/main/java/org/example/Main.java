package org.example;

import org.example.entity.Person;
import org.example.service.PersonService;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        person.setUserName(scanner.nextLine());
        person.setUserLogin(scanner.nextLine());
        System.out.println(person);
        PersonService personService = new PersonService();
        List<Person> people = personService.generateFakePersons();
        List<Person> filteredFakePersonsOnSalary = personService.getFilteredFakePersonsOnSalary(people, 10000000);
        int counter = 1;
        for (Person filteredPerson: filteredFakePersonsOnSalary) {
            System.out.println(counter + " " + filteredPerson + "\n");
            counter++;
        }
        personService.getPersonsFromApi();

    }
}
