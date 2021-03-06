package az.pashabank.learning.session.controller;

import az.pashabank.learning.session.dao.entity.GroupEntity;
import az.pashabank.learning.session.model.GroupDto;
import az.pashabank.learning.session.model.PageableGroupDto;
import az.pashabank.learning.session.service.GroupService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/groups")
public class GroupController {

    public final GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @GetMapping
    public PageableGroupDto getGroups(@RequestParam("page") int page, @RequestParam("count") int count) {
        return groupService.getGroups(page, count);
    }
}
