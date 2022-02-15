package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    //bean
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student anki = new Student(
                    "Anki",
                    "a",
                    LocalDate.of(2000, Month.JANUARY, 1)
            );

            repository.saveAll(
                    List.of(anki)
            ) ;
        };
    }
}
