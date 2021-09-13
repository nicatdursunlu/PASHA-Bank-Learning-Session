package az.pashabank.learning.session.service;

import az.pashabank.learning.session.dao.repository.TeacherRepository;
import az.pashabank.learning.session.mapper.StudentMapper;
import az.pashabank.learning.session.mapper.TeacherMapper;
import az.pashabank.learning.session.model.StudentDto;
import az.pashabank.learning.session.model.TeacherDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public List<TeacherDto> getTeachers() {
        var teachers = teacherRepository.findAll();

        return TeacherMapper.mapEntitiesToDtos(teachers);
    }

    public TeacherDto getTeacher(Long id) {
        var teacher = teacherRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("TEACHER_NOT_FOUND"));

        return TeacherMapper.mapEntityToDto(teacher);
    }
}
