package az.pashabank.learning.session.mapper;

import az.pashabank.learning.session.dao.entity.TeacherEntity;
import az.pashabank.learning.session.model.TeacherDto;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class TeacherMapper {

    public static List<TeacherDto> mapEntitiesToDtos(Iterable<TeacherEntity> entities) {
        return StreamSupport.stream(entities.spliterator(), false)
                .map(TeacherMapper::mapEntityToDto)
                .collect(Collectors.toList());
    }

    public static TeacherDto mapEntityToDto(TeacherEntity entity) {
        return TeacherDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .birthDate(entity.getBirthDate())
                .subject(entity.getSubject())
                .groups(GroupMapper.mapEntitiesToDtos(entity.getGroups()))
                .build();
    }
}
