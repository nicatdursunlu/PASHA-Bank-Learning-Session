package az.pashabank.learning.session.controller;

import az.pashabank.learning.session.model.StudentDto;
import az.pashabank.learning.session.service.StudentServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentServiceImpl studentServiceImpl;

    public StudentController(StudentServiceImpl studentServiceImpl) {
        this.studentServiceImpl = studentServiceImpl;
    }

    @GetMapping
    public List<StudentDto> getStudents() {
        return studentServiceImpl.getStudents();
    }

    @GetMapping("/{id}")
    public StudentDto getStudent(@PathVariable Long id) {
        return studentServiceImpl.getStudent(id);
    }

    @PostMapping
    public void createStudent(@RequestBody StudentDto studentDto) {
        studentServiceImpl.createStudent(studentDto);
    }

    @PutMapping("/{id}")
    public void updateStudent(@PathVariable long id, @RequestBody StudentDto studentDto) {
        studentServiceImpl.updateStudent(id, studentDto);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentServiceImpl.deleteStudent(id);
    }
}
