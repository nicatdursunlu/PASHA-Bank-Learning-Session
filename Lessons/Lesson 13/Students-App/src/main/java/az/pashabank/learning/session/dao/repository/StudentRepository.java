package az.pashabank.learning.session.dao.repository;

import az.pashabank.learning.session.dao.entity.StudentEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentEntity, Long> {

    @Modifying
    @Query(nativeQuery = true,
            value = "UPDATE student SET name =:name WHERE id =:id")
    void updateStudent(Long id, String name);
}
