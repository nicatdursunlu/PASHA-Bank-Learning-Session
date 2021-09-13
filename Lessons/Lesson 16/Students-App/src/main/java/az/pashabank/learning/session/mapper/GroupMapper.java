package az.pashabank.learning.session.mapper;

import az.pashabank.learning.session.dao.entity.GroupEntity;
import az.pashabank.learning.session.model.GroupDto;
import az.pashabank.learning.session.model.PageableGroupDto;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class GroupMapper {

    public static PageableGroupDto buildEmptyResponse(int lastPageNumber, boolean hasNextPage) {
        return PageableGroupDto.builder()
                .lastPageNumber(lastPageNumber)
                .hasNextPage(hasNextPage)
                .build();
    }

    public static PageableGroupDto buildPageableResponse(
            List<GroupEntity> groups, int lastPageNumber, boolean hasNextPage, long totalElements) {
        return PageableGroupDto.builder()
                .groups(mapEntitiesToDtos(groups))
                .lastPageNumber(lastPageNumber)
                .hasNextPage(hasNextPage)
                .totalElements(totalElements)
                .build();
    }

    public static List<GroupDto> mapEntitiesToDtos(Iterable<GroupEntity> entities) {
        return StreamSupport.stream(entities.spliterator(), false)
                .map(GroupMapper::mapEntityToDto)
                .collect(Collectors.toList());
    }

    public static GroupDto mapEntityToDto(GroupEntity entity) {
        return GroupDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .faculty(entity.getFaculty())
//                .students(StudentMapper.mapEntitiesToDtos(entity.getStudents()))
//                .teachers(TeacherMapper.mapEntitiesToDtos(entity.getTeachers()))
                .build();
    }
}
