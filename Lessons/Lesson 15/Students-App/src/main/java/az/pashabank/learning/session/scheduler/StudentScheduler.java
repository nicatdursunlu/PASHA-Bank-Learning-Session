package az.pashabank.learning.session.scheduler;

import az.pashabank.learning.session.service.GroupService;
import az.pashabank.learning.session.service.StudentService;
import az.pashabank.learning.session.service.TeacherService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class StudentScheduler {

    private final TeacherService teacherService;

    public StudentScheduler(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @Scheduled(fixedDelayString = "3000")
    public void print() {
        teacherService.getTeachers().forEach(
                teacher -> System.out.println(teacher.getName())
        );
    }
}
