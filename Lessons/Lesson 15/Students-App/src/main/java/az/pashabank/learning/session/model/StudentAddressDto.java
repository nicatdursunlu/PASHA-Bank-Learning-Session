package az.pashabank.learning.session.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentAddressDto {

    private Long id;

    private String country;

    private String city;

    private String zipCode;

    private String apartment;
}
