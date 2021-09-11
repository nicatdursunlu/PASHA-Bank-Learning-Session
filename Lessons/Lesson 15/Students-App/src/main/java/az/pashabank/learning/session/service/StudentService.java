package az.pashabank.learning.session.service;

import az.pashabank.learning.session.model.StudentDto;

import java.util.List;

public interface StudentService {

    List<StudentDto> getStudents();

    StudentDto getStudent(Long id);

    void createStudent(StudentDto studentDto);

    void updateStudent(long id, StudentDto studentDto);

    void deleteStudent(Long id);
}
