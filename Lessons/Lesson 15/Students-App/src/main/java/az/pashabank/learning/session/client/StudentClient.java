package az.pashabank.learning.session.client;

import az.pashabank.learning.session.model.StudentDto;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class StudentClient {

    private final RestTemplate restTemplate;

    public StudentClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<StudentDto> getStudents() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<List<StudentDto>> httpEntity = new HttpEntity<>(headers);

        StudentDto[] studentDtos = restTemplate.exchange("http://localhost:8080/students",
                HttpMethod.GET,
                httpEntity,
                StudentDto[].class).getBody();
        return Arrays.asList(studentDtos);
    }

    public StudentDto getStudent(Long id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<List<StudentDto>> httpEntity = new HttpEntity<>(headers);

        ResponseEntity<StudentDto> response = restTemplate.exchange("http://localhost:8080/students/{id}",
                HttpMethod.GET,
                httpEntity,
                StudentDto.class,
                id
        );
        return response.getBody();
    }

    public void createStudent(StudentDto student) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<StudentDto> httpEntity = new HttpEntity<>(student, headers);

        restTemplate.postForObject(
                "http://localhost:8080/students",
                httpEntity,
                Void.class
        );
    }
}
