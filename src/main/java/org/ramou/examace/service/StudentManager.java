package org.ramou.examace.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.ramou.examace.dto.StudentDTO;
import org.ramou.examace.entity.Student;
import org.ramou.examace.mappers.StudentMapper;
import org.ramou.examace.repositories.StudentRepository;

@Service
@AllArgsConstructor
public class StudentManager implements StudentService {
    StudentRepository studentRep;
    StudentMapper mapper;

    @Override
    public StudentDTO saveStudent(StudentDTO studentDTO) {
        Student student1 = mapper.fromStudentDTOtoStudent(studentDTO);
        student1 = studentRep.save(student1);
        return mapper.fromStudenttoStudentDTO(student1);
    }

    @Override
    public StudentDTO getStudentByDateNaissance(String dateNaissance) {
        return mapper.fromStudenttoStudentDTO(studentRep.getStudentByDateNaissance(dateNaissance));
    }
}
