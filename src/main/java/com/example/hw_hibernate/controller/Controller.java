package com.example.hw_hibernate.controller;

import com.example.hw_hibernate.repository.Repository;
import com.example.hw_hibernate.repository.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class Controller {
    @Autowired
    Repository repository;

    @GetMapping("/by-city")
    public List<Person> getPersonByCity(@RequestParam String city) {
        return repository.findByCityOfLiving(city);
    }

    @GetMapping("/by-age")
    public List<Person> getPersonByAge(@RequestParam int age) {
        return repository.findByAgeLessThanOrderByAgeDesc(age);
    }

    @GetMapping("/by-nameAndSurename")
    public Optional<Person> getPersonByNameAndSurename(@RequestParam String name, @RequestParam String surename){
        return repository.findByNameAndSurename(name,surename);
    }


}
