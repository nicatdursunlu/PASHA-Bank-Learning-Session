package az.pashabank.learning.session.controller;

import az.pashabank.learning.session.model.StudentDto;
import az.pashabank.learning.session.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<StudentDto> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping("/{id}")
    public StudentDto getStudent(@PathVariable Long id) {
        return studentService.getStudent(id);
    }

    @PostMapping
    public void createStudent(@RequestBody StudentDto studentDto) {
        studentService.createStudent(studentDto);
    }

    @PutMapping("/{id}")
    public void updateStudent(@PathVariable long id, @RequestBody StudentDto studentDto) {
        studentService.updateStudent(id, studentDto);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
}
