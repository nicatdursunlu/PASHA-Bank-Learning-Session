package az.pashabank.learning.session.service;

import az.pashabank.learning.session.model.StudentDto;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceMock implements StudentService {

    private List<StudentDto> students;

    public StudentServiceMock() {
        this.students = new ArrayList<>();
    }

    @Override
    public List<StudentDto> getStudents() {
        return students;
    }

    @Override
    public StudentDto getStudent(Long id) {
        return students.stream()
                .filter(student -> student.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void createStudent(StudentDto studentDto) {
        students.add(studentDto);
    }

    @Override
    public void updateStudent(long id, StudentDto studentDto) {
        System.out.println("Update student");
    }

    @Override
    public void deleteStudent(Long id) {
        System.out.println("Delete student");
    }
}
