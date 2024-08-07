package in.ineuron.bean;

import org.springframework.stereotype.Component;

@Component
public class FirstFlight implements Courier {

	@Override
	public String deliver(int oid) {
		return null;
	}

}
