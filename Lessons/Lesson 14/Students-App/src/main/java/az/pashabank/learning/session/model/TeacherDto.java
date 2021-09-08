package az.pashabank.learning.session.model;

import az.pashabank.learning.session.dao.entity.GroupEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeacherDto {

    private Long id;

    private String name;

    private LocalDate birthDate;

    private String subject;

    private List<GroupDto> groups;
}
