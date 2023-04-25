package com.example.hw_hibernate.repository;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Repository
public interface Repository extends CrudRepository<Person,String> {
    List<Person> findByCityOfLiving(String cityOfLiving);
    List<Person> findByAgeLessThanOrderByAgeDesc(int age);
    Optional<Person> findByNameAndSurename(String name, String surename);
}
