package az.pashabank.learning.session.service;

import az.pashabank.learning.session.dao.entity.GroupEntity;
import az.pashabank.learning.session.dao.repository.GroupRepository;
import az.pashabank.learning.session.mapper.GroupMapper;
import az.pashabank.learning.session.model.GroupDto;
import az.pashabank.learning.session.model.PageableGroupDto;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

import static az.pashabank.learning.session.mapper.GroupMapper.buildPageableResponse;
import static az.pashabank.learning.session.mapper.GroupMapper.buildEmptyResponse;

@Service
public class GroupService {

    private final GroupRepository groupRepository;

    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public PageableGroupDto getGroups(int page, int count) {
        Pageable pageable = PageRequest.of(page, count, Sort.by("updatedAt").descending());

        var pages = groupRepository.findAll(pageable);

        var groups = pages.getContent();

        int lastPageNumber = pages.getTotalPages();

        if (lastPageNumber != 0) lastPageNumber -= 1;

        if (groups.isEmpty())
            return buildEmptyResponse(lastPageNumber, pages.hasNext());

        return buildPageableResponse(groups, lastPageNumber, pages.hasNext(), pages.getTotalElements());
    }

}
