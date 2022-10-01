package com.example.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "persons")
@IdClass(PersonId.class)
@Entity
public class Person implements Serializable {
    @Id
    private String name;
    @Id
    private String surname;
    @Id
    private int age;
    private int phone_number;
    @Column (name = "city_of_living")
    private String city;
}