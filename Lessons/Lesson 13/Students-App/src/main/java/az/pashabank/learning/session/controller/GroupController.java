package az.pashabank.learning.session.controller;

import az.pashabank.learning.session.model.PageableGroupDto;
import az.pashabank.learning.session.service.GroupService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/groups")
public class GroupController {

    public final GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @GetMapping
    public PageableGroupDto getGroups(@RequestParam int page, @RequestParam int count) {
        return groupService.getGroups(page, count);
    }
}
