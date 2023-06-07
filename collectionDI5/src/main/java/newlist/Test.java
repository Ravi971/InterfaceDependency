package newlist;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		 
		ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext("NewFile.xml");

//		Employee e1= (Employee) c1.getBean("employee");
//		System.out.println(e1);
//		System.out.println(e1.getProjects().getClass());
		
		Employee e2= (Employee) c1.getBean("employee1");
		System.out.println(e2);
		System.out.println(e2.getProjects().getClass());
		
		
	}

}
