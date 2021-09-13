package az.pashabank.learning.session.service

import az.pashabank.learning.session.dao.entity.StudentEntity
import az.pashabank.learning.session.dao.repository.StudentRepository
import az.pashabank.learning.session.mapper.StudentMapper
import io.github.benas.randombeans.api.EnhancedRandom
import spock.lang.Specification

class StudentServiceImplTest extends Specification {

    private StudentRepository studentRepository;
    private StudentService studentService;

    def setup() {
        studentRepository = Mock()
        studentService = new StudentServiceImpl(studentRepository)
    }

    def "TestGetStudent success"() {
        given:
        def id = 1
        def student = EnhancedRandom.random(StudentEntity)

        when:
        def result = studentService.getStudent(id)

        then:
        1 * studentRepository.findById(id) >> student

        result == StudentMapper.mapEntityToDto(student)
    }

    def "TestGetStudent student not found"() {
        given:
        def id = 10

        when:
        def result = studentService.getStudent(id)

        then:
        1 * studentRepository.findById(id) >> Optional.empty()

        RuntimeException exception = thrown()
        exception.message == "STUDENT_NOT_FOUND"
    }

}
