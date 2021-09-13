package az.pashabank.learning.session.service;

import az.pashabank.learning.session.dao.repository.StudentRepository;
import az.pashabank.learning.session.mapper.StudentMapper;
import az.pashabank.learning.session.model.StudentDto;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<StudentDto> getStudents() {
        var students = studentRepository.findAll();

        return StudentMapper.mapEntitiesToDtos(students);
    }

    public StudentDto getStudent(Long id) {
        var student = studentRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("STUDENT_NOT_FOUND"));

        return StudentMapper.mapEntityToDto(student);
    }

    public void createStudent(StudentDto studentDto) {
        var entity = StudentMapper.mapDtoToEntity(studentDto);
        studentRepository.save(entity);
    }

    @Transactional
    public void updateStudent(long id, StudentDto studentDto) {
        studentRepository.updateStudent(id, studentDto.getName());
    }

    @Transactional
    public void deleteStudent(Long id) {
        var entity = studentRepository.findById(id).orElseThrow();
        studentRepository.delete(entity);
    }
}
