package newmap;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext c1 =
				new ClassPathXmlApplicationContext("NewFile.xml");
		
		Company c2 = (Company) c1.getBean("abc");
		System.out.println(c2);
		System.out.println(c2.getEmployeeidandname().getClass());
	}

}
