import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dao.StudentJdbcTemplate;
import com.spring.dao.Student;

public class MainApp {

	public static void main(String[] args) {
		
		//AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
		
		StudentJdbcTemplate studentJdbcTemplate = (StudentJdbcTemplate) context.getBean("studentJdbcTemplate");
		
		//create
		//studentJdbcTemplate.insertStudentRecord(2, "Arbin Babu", 54);
		/*studentJdbcTemplate.insertStudentRecord(3, "Pravin Sharma", 23);
		studentJdbcTemplate.insertStudentRecord(4, "Rabin Raju", 12);*/
		
		//update record
		//studentJdbcTemplate.updateStudentRecord(2, 67);
		
		//studentJdbcTemplate.deleteStudentRecord(1);
		
		List<com.spring.dao.Student> studentList = studentJdbcTemplate.getStudentList();
		studentJdbcTemplate.displayStudentList(studentList);
		
		Student student = studentJdbcTemplate.getStudentRecord(2);
		studentJdbcTemplate.displayStudent(student);
		
		context.close();
	}

}
