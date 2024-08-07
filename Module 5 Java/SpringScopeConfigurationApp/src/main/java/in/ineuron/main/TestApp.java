package in.ineuron.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.ineuron.bean.Student;
import in.ineuron.config.AppConfig;

public class TestApp {

	public static void main(String[] args) {
		System.out.println("STARTING THE CONTAINER...");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("CONTAINER STARTED.....");
		
		System.out.println("ASKING CONTAINER TO GIVE STUDENT BEAN");
		Student student1 = context.getBean("student", Student.class);
		System.out.println("student1:: "+student1.hashCode());
		
		
		Student student2 = context.getBean("student", Student.class);
		System.out.println("student2:: "+student2.hashCode());
		
	
		System.out.println("CLOSING  THE CONTAINER...");
		((AbstractApplicationContext) context).close();

	}

}
