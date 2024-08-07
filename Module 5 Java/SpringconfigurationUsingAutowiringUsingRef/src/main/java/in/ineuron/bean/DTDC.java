package in.ineuron.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DTDC implements Courier {

	@Override
	public String deliver(int oid) {
		return null;
	}

}
