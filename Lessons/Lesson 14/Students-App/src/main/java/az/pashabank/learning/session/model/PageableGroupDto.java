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
public class PageableGroupDto {

    private List<GroupDto> groups;

    private int lastPageNumber;

    private boolean hasNextPage;

    private long totalElements;
}
