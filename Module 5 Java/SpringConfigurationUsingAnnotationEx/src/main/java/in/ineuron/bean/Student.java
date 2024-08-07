package in.ineuron.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {

	static {
		System.out.println("Student.class file is loading...");
	}

	public Student() {
		System.out.println("Student object is instantiated...");
	}

	@Value("10")
	private Integer sid;

	@Value("sachin")
	private String sname;

	@Value("MI")
	private String saddress;

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + "]";
	}

}
