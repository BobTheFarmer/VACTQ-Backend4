package com.nighthawk.spring_portfolio.mvc.playersTest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

// JPA is an object-relational mapping (ORM) to persistent data, originally relational databases (SQL). Today JPA implementations has been extended for NoSQL.
public interface PTestJpaRepository extends JpaRepository<PTest, Long> {
    /* JPA has many built in methods: https://www.tutorialspoint.com/spring_boot_jpa/spring_boot_jpa_repository_methods.htm
    The below custom methods are prototyped for this application
    */
    void save(String Joke);
    List<PTest> findAllByOrderByJokeAsc();
    List<PTest> findByJokeIgnoreCase(String joke);
}
