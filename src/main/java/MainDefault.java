
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.entity.Address;
import com.spring.core.entity.Department;
import com.spring.core.entity.Employee;

/**
 * This class marks as the entry point of this application. 
 * @author abharsa
 */
public class MainDefault {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

		// here, we've used InitializingBean & DisposableBean interfaces
		Employee employee = (Employee) applicationContext.getBean("employee");
		System.out.println("\nEmmployee Name: "+employee.getName());
		
		// here we've used BeanNameAware, BeanFactoryAware, ApplicaitonContextAware callback Interfaces
		Address address = (Address) applicationContext.getBean("address");
		System.out.println("Employee City name: "+address.getCity());
		
		// here, we've used the <init-method and destroy-method element attributes of bean element
		Department  department = (Department) applicationContext.getBean("department");

		((AbstractApplicationContext) applicationContext).registerShutdownHook();
	}
}
