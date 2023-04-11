package com.example.hw_hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import repository.Repository;

@SpringBootApplication
public class HwHibernateApplication {
    public static void main(String[] args) {
        SpringApplication.run(HwHibernateApplication.class, args);
        Repository repository = new Repository();
    }
}
