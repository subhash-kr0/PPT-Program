package in.ineuron.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.ineuron.bean.Flipkart;
import in.ineuron.config.AppConfig;

public class TestApp {

	public static void main(String[] args) {

		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
	
		Flipkart flipkart = context.getBean("flipkart", Flipkart.class);
		System.out.println(flipkart);
		
		((AbstractApplicationContext) context).close();
	}
}
