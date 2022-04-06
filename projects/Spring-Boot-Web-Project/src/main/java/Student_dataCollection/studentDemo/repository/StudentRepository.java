package Student_dataCollection.studentDemo.repository;

import Student_dataCollection.studentDemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
