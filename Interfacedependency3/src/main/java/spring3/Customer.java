package spring3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component      // instead of create the object by using bean ,just use the annotation 
public class Customer
{
	@Value("111")      // inject the primitive dependency
    private int  customerid;
	@Value("jhon")
    private String customername;
	@Value("7353257907")
    private long phnum;
	@Autowired    
	@Qualifier("savings")        //interface having multiple implement class
    private Account account;
	
	@Autowired    
	@Qualifier("current") 
	private Account account1; //one ref variable we can store only one class
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public long getPhnum() {
		return phnum;
	}
	public void setPhnum(long phnum) {
		this.phnum = phnum;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	 
	public Account getAccount1() {
		return account1;
	}
	public void setAccount1(Account account1) {
		this.account1 = account1;
	}
//	@Override
//	public String toString() {
//		return "Customer [customerid=" + customerid + ", customername=" + customername + ", phnum=" + phnum
//				+ ", account=" + account + ", account1=" + account1 + "]";
//	}
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customername=" + customername + ", phnum=" + phnum + "]";
	}
    
}
