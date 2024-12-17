package org.ramou.examace.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.ramou.examace.dto.StudentDTO;
import org.ramou.examace.entity.Student;

@Component
public class StudentMapper {
    ModelMapper mapper = new ModelMapper();
    public Student fromStudentDTOtoStudent(StudentDTO studentDTO){
 return mapper.map(studentDTO, Student.class);
    }
    public StudentDTO fromStudenttoStudentDTO(Student student){
        return mapper.map(student,StudentDTO.class);
    }
}
