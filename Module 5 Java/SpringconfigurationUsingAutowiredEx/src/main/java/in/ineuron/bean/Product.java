package in.ineuron.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {

	@Value("10")
	private Integer pid;
	
	@Value("25000")
	private Integer pcost;

	@Autowired
	private Model model;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getPcost() {
		return pcost;
	}

	public void setPcost(Integer pcost) {
		this.pcost = pcost;
	}

	public Model getModel() {
		return model;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pcost=" + pcost + ", model=" + model + "]";
	}

}
