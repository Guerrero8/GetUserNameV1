package org.example.service;

import com.github.javafaker.Faker;
import lombok.SneakyThrows;
import netscape.javascript.JSObject;
import okhttp3.*;
import org.example.entity.Person;
import sun.rmi.server.UnicastRef;

import java.io.IOException;
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
        for (Person person : persons) {
            if (person.getSalary() > minSalary) {
                filteredPersons.add(person);
            }
        }
        return filteredPersons;
    }
    @SneakyThrows
    public List<Person> getPersonsFromApi() throws IOException {

        Request request = new Request.Builder()
                .url("https://randomuser.me/api/")
                .build();

        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();
        String responseBody = response.body().string();
        System.out.println(responseBody);


        Person person = new Person();
        person.setUserName(responseBody);
        System.out.println(person);

        return null;
        }
    }






