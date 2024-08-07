package in.ineuron.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.ineuron.bean.Student;
import in.ineuron.config.AppConfig;

public class TestApp {

	public static void main(String[] args) {
		System.out.println("CONTAINER STARTED....");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println("ASKING CONTAINER TO GIVE STUDENT BEAN");
		Student student = context.getBean("student", Student.class);
		System.out.println(student);
		System.out.println("CLOSING  THE CONTAINER...");
		((AbstractApplicationContext) context).close();

	}

}
