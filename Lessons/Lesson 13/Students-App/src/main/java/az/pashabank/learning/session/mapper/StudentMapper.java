package az.pashabank.learning.session.mapper;

import az.pashabank.learning.session.dao.entity.StudentEntity;
import az.pashabank.learning.session.model.StudentDto;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class StudentMapper {

    public static List<StudentDto> mapEntitiesToDtos(Iterable<StudentEntity> entities) {
        return StreamSupport.stream(entities.spliterator(), false)
                .map(StudentMapper::mapEntityToDto)
                .collect(Collectors.toList());
    }

    public static StudentDto mapEntityToDto(StudentEntity entity) {
        return StudentDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .birthDate(entity.getBirthDate())
                .build();
    }

    public static StudentEntity mapDtoToEntity(StudentDto studentDto) {
        return StudentEntity.builder()
                .name(studentDto.getName())
                .birthDate(studentDto.getBirthDate())
                .build();
    }
}
