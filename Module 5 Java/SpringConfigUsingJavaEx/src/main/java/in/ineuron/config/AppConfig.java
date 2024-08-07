package in.ineuron.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.ineuron.bean.Product;

@Configuration
public class AppConfig {

	// 1 method = 1 bean
	@Bean
	public Product prodObj() {

		Product product = new Product();
		product.setData(list());
		product.setModels(set());
		product.setModes(map());
		product.setContext(props());
		return product;
	}

	public List<String> list() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("p1");
		list.add("p2");
		list.add("p3");
		list.add("p4");
		return list;
	}

	public Set<String> set() {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("S1");
		set.add("S2");
		set.add("S3");
		set.add("S4");
		return set;
	}

	public Map<Integer, String> map() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "A");
		map.put(20, "B");
		map.put(30, "C");
		return map;
	}

	public Properties props() {
		Properties props = new Properties();
		props.put("A1", "B1");
		props.put("A2", "B2");
		props.put("A3", "B3");
		return props;
	}

}
