package in.ineuron.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Product {

	private List<String> data;
	private Set<String> models;
	private Map<Integer, String> modes;
	private Properties context;

	public Product() {
		System.out.println("Product constructor is called...");
	}

	public List<String> getData() {
		return data;
	}

	public void setData(List<String> data) {
		this.data = data;
	}

	public Set<String> getModels() {
		return models;
	}

	public void setModels(Set<String> models) {
		this.models = models;
	}

	public Map<Integer, String> getModes() {
		return modes;
	}

	public void setModes(Map<Integer, String> modes) {
		this.modes = modes;
	}

	public Properties getContext() {
		return context;
	}

	public void setContext(Properties context) {
		this.context = context;
	}

	@Override
	public String toString() {
		return "Product [data=" + data + ", models=" + models + ", modes=" + modes + ", context=" + context + "]";
	}

}
