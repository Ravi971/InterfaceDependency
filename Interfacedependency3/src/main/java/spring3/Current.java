package spring3;

import org.springframework.stereotype.Component;

@Component
public class Current implements Account {

	public void withdraw() {
		 System.out.println("withdraw from current");

	}

	public void deposit() {
		 System.out.println(" deposit to current");


	}

}
