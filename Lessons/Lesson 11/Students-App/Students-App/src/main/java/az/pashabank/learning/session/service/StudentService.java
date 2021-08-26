package az.pashabank.learning.session.service;

import az.pashabank.learning.session.model.StudentDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private List<StudentDto> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    public List<StudentDto> getStudents() {
        return students;
    }

    public StudentDto getStudent(Long id) {
        return students.stream()
                .filter(student ->student.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void createStudent(StudentDto studentDto) {
        students.add(studentDto);
    }
}
