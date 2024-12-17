package org.ramou.examace;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.ramou.examace.entity.Student;
import org.ramou.examace.repositories.StudentRepository;

import java.util.List;

@SpringBootApplication
public class ExamAceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamAceApplication.class, args);
    }
@Bean
    CommandLineRunner start(StudentRepository studentRepository){
return args -> {
    List<Student> students =List.of(
            Student.builder().name("zyad").email("zyad@zyad.com").dateNaissance("123").build(),
            Student.builder().name("badr").email("badr@badr.com").dateNaissance("456").build(),
            Student.builder().name("anas").email("anas@anas.com").dateNaissance("789").build(),
            Student.builder().name("ahmed").email("ahmed@ahmed.com").dateNaissance("000").build()
    );
    studentRepository.saveAll(students);
};
}
}
