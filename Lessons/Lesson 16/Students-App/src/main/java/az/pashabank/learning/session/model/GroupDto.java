package az.pashabank.learning.session.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GroupDto {

    private Long id;

    private String name;

    private String faculty;

    private List<StudentDto> students;

    private List<TeacherDto> teachers;
}
