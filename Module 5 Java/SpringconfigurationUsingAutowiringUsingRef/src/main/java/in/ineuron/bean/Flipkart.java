package in.ineuron.bean;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Flipkart {

	@Autowired(required = false)
	@Qualifier("firstFlight")
	private Courier courier;

	@Autowired
	private Date myDate;

	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + ", myDate=" + myDate + "]";
	}

}
