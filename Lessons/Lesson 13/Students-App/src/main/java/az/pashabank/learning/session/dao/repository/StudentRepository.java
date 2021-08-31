package az.pashabank.learning.session.dao.repository;

import az.pashabank.learning.session.dao.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentEntity, Long>  {

}
