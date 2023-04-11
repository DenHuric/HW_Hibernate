package repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@org.springframework.stereotype.Repository
public class Repository {
    @PersistenceContext
    private EntityManager em;


    public Repository() {
        generatePersons();
    }

/*    public Person getPersonsByCity(String city) {

    }*/
    @Transactional
    public void generatePersons() {
        Person person1 = Person.builder()
                .name("Vasya")
                .surename("Testovyy")
                .age(11)
                .phoneNumber(8_999_666_12_34L)
                .cityOfLiving("Moscow")
                .build();
        Person person2 = Person.builder()
                .name("Max")
                .surename("Ivanov")
                .age(33)
                .cityOfLiving("Kazan")
                .build();
        em.persist(person1);
        em.persist(person2);
    }
}
