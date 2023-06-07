package srpinglifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext c1 =

				new ClassPathXmlApplicationContext("NewFile.xml");

		System.out.println(c1.getBean("student"));

		Student s1 = (Student) c1.getBean("student1");
		System.out.println(s1);
		System.out.println(s1.hashCode()); // singleton class object different ref variable pointing to same object

		Student s2 = (Student) c1.getBean("student1");
		System.out.println(s2.hashCode()); // singleton class object different ref variable pointing to same object

		if (c1 != null) { // destroy()- destroy the bean object before closing the jvm explicitly
			c1.close();
		}

	}

}
