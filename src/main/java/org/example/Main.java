package org.example;

import org.example.entity.Person;
import org.example.service.PersonService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        person.setUserName(scanner.nextLine());
        person.setUserLogin(scanner.nextLine());
        System.out.println(person);
        PersonService personService = new PersonService();
        personService.generateFakePersons();
        }
    }
