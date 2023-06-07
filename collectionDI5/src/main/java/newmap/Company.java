package newmap;

import java.util.Map;

public class Company {

	private int companyid;
	private String companyname;
	private Map<Integer,String> employeeidandname;
	public int getCompanyid() {
		return companyid;
	}
	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public Map<Integer, String> getEmployeeidandname() {
		return employeeidandname;
	}
	public void setEmployeeidandname(Map<Integer, String> employeeidandname) {
		this.employeeidandname = employeeidandname;
	}
	@Override
	public String toString() {
		return "Company [companyid=" + companyid + ", companyname=" + companyname + ", employeeidandname="
				+ employeeidandname + "]";
	}
	
	
	
}
