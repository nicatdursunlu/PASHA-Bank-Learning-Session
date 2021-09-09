package az.pashabank.learning.session.controller;

import az.pashabank.learning.session.model.PageableGroupDto;
import az.pashabank.learning.session.service.GroupService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/groups")
public class GroupController {

    public final GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @GetMapping
    public PageableGroupDto getGroups(int page, int count) {
        return groupService.getGroups(page, count);
    }
}
