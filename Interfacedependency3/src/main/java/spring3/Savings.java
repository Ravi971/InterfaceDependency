package spring3;

import org.springframework.stereotype.Component;

@Component
public class Savings implements Account {

	public void withdraw() {
		 System.out.println("withdraw from savings");
		
	}

	public void deposit() {
		 
		 System.out.println(" deposit to savings");
	}

}
