package StudentRefferalPfoject.Refferal;

import StudentRefferalPfoject.Refferal.entity.Student;
import StudentRefferalPfoject.Refferal.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RefferalApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RefferalApplication.class, args);
	}
     @Autowired
	 private StudentRepository studentRepository;


	@Override
	public void run(String... args) throws Exception {
		/* Student student1=new Student("Ramesh","Computer Science and Engineering");
		studentRepository.save(student1);

		Student student2=new Student("Prem Prakash","Electronics and Communication Engineering");
		studentRepository.save(student2);

		Student student3=new Student("Deepraj Bhaidya","Computer Science and Engineering");
		studentRepository.save(student3);   */

	}
}
