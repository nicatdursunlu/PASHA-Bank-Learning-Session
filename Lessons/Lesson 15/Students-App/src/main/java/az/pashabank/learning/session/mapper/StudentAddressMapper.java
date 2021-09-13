package az.pashabank.learning.session.mapper;

import az.pashabank.learning.session.dao.entity.StudentAddressEntity;
import az.pashabank.learning.session.model.StudentAddressDto;

public class StudentAddressMapper {

    public static StudentAddressDto mapAddressEntityToDto(StudentAddressEntity entity) {
        return StudentAddressDto.builder()
                .id(entity.getId())
                .country(entity.getCountry())
                .city(entity.getCity())
                .zipCode(entity.getZipCode())
                .apartment(entity.getApartment())
                .build();
    }
}
