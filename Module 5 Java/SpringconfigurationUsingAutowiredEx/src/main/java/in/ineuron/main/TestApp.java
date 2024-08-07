package in.ineuron.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.ineuron.bean.Product;
import in.ineuron.config.AppConfig;

public class TestApp {

	public static void main(String[] args) {

		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		Product product = context.getBean("product",Product.class);
		System.out.println(product);
		((AbstractApplicationContext) context).close();
	}
}
