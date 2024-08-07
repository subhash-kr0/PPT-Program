package in.ineuron.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.ineuron.bean.Product;
import in.ineuron.config.AppConfig;

public class TestApp {

	public static void main(String[] args) {

		System.out.println("STARTING THE CONTAINER");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("CONTAINER STARTED");
		Product product = context.getBean("prodObj", Product.class);
		System.out.println(product);
		((AbstractApplicationContext) context).close();
		System.out.println("STOPPING THE CONTAINER");
	}
}
