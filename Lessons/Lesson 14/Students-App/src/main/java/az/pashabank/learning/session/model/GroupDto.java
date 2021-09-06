package az.pashabank.learning.session.model;

import az.pashabank.learning.session.dao.entity.StudentEntity;
import az.pashabank.learning.session.dao.entity.TeacherEntity;
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

    private List<TeacherEntity> teachers;
}
