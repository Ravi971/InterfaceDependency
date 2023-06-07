package spring3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1 = 
				new ClassPathXmlApplicationContext("spring3/NewFile.xml");
		
		
		Customer  c2= (Customer) c1.getBean("customer");
		System.out.println(c2);
		
		c2.getAccount().withdraw();
		c2.getAccount().deposit();
		
		c2.getAccount1().withdraw();
		c2.getAccount1().deposit();
		
		
	}

}
 