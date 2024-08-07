package in.ineuron.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Model {
	
	@Value("100")
	private Integer mid;
	
	@Value("chronography")
	private String type;

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Model [mid=" + mid + ", type=" + type + "]";
	}

}
