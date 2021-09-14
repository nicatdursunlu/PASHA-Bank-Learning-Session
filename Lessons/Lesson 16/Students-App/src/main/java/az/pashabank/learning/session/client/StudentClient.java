package az.pashabank.learning.session.client;

import az.pashabank.learning.session.model.StudentDto;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
}
