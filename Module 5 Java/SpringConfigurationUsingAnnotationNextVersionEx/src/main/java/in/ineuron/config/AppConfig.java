package in.ineuron.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import in.ineuron.bean.Product;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {
	
	@Autowired
	private Environment environment;
	

	// 1 bean = 1 method
	@Bean
	public Product pobj() {
		Product product = new Product();
		product.setPid(environment.getProperty("pid", Integer.class, null));
		product.setPname(environment.getProperty("pname"));
		product.setPtype(environment.getProperty("ptype"));
		return product;
	}

}
