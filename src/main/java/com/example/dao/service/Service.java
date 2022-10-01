package com.example.dao.service;

import com.example.dao.entity.Person;
import com.example.dao.repository.PersonsRepository;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {
    private final PersonsRepository repository;

    public Service (PersonsRepository repository){
        this.repository = repository;
    }

    public List<Person> getPersonsByCity (String city) {
        return repository.findByCity(city);
    }

    public List<Person>getPersonsByAgeLessThanOrderBy (int age) {
        return repository.findByAgeLessThanOrderByAge(age);
    }

    public Optional<Person>getPersonsByNameAndSurname (String name, String surname) {
        return repository.findByNameAndSurname(name,surname);
    }

    public Person save (Person person) {
        return repository.save(person);
    }

    public Long count() {
        return repository.count();
    }

    public void deleteAllPersons(List<Person> personList) {
        repository.deleteAll(personList);
    }
}
