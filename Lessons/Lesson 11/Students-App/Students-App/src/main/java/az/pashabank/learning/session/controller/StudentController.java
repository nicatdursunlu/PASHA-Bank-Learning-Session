package az.pashabank.learning.session.controller;

import az.pashabank.learning.session.model.StudentDto;
import az.pashabank.learning.session.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<StudentDto>> getStudents() {
        return ResponseEntity.ok(studentService.getStudents());
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getStudent(@PathVariable Long id, @RequestParam String param) {
        StudentDto student = studentService.getStudent(id);
        return ResponseEntity.ok(student);
    }

    @PostMapping
    public ResponseEntity<Void> createStudent(@RequestBody StudentDto studentDto) {
        studentService.createStudent(studentDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
