package org.ramou.examace.service;

import org.ramou.examace.dto.StudentDTO;


public interface StudentService {
  public StudentDTO saveStudent(StudentDTO studentDTO);
  public StudentDTO getStudentByDateNaissance(String dateNaissance);



}
