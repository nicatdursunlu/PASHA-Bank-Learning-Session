package az.pashabank.learning.session.scheduler;

import az.pashabank.learning.session.service.StudentServiceImpl;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class StudentScheduler {

    private final StudentServiceImpl studentServiceImpl;

    public StudentScheduler(StudentServiceImpl studentServiceImpl) {
        this.studentServiceImpl = studentServiceImpl;
    }

    @Scheduled(fixedDelayString = "${scheduler.student.fixedDelay}")
    public void printStudentName() {
        studentServiceImpl.getStudents()
                .forEach(
                        student -> System.out.println(student.getName())
                );
    }
}
