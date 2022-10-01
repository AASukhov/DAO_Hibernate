package com.example.dao.repository;

import com.example.dao.entity.Person;
import com.example.dao.entity.PersonId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Repository
    public interface PersonsRepository extends JpaRepository<Person, PersonId>{
        List<Person> findByCity(String city);

        List<Person> findByAgeLessThanOrderByAge (int age);
        Optional<Person> findByNameAndSurname (String name, String surname);
    }
