package com.example.hw_hibernate;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HwHibernateApplication implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(HwHibernateApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
    }


}
