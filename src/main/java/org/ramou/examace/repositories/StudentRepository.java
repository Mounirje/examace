package org.ramou.examace.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.ramou.examace.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    public Student getStudentByDateNaissance(String dateNaissance);
}
