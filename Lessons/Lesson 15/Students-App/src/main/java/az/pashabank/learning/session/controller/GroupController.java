package az.pashabank.learning.session.controller;

import az.pashabank.learning.session.model.PageableGroupDto;
import az.pashabank.learning.session.service.GroupService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/groups")
@Api("Controller to handle group related operations")
public class GroupController {

    public final GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @GetMapping
    @ApiOperation("Get group list by population")
    public PageableGroupDto getGroups(@RequestParam int page, @RequestParam int count) {
        return groupService.getGroups(page, count);
    }
}
