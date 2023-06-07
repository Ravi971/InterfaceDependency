package newlist;

import java.util.List;
import java.util.Set;

public class Employee {

	private int empid;
	private String empname;
//	private List<String> projects;
	
	private Set<String>projects;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
//	public List<String> getProjects() {
//		return projects;
//	}
//	public void setProjects(List<String> projects) {
//		this.projects = projects;
//	}
//	@Override
//	public String toString() {
//		return "Employee [empid=" + empid + ", empname=" + empname + ", projects=" + projects + "]";
//	}
	public Set<String> getProjects() {
		return projects;
	}
	public void setProjects(Set<String> projects) {
		this.projects = projects;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", projects=" + projects + "]";
	}
	 
	 
	
	
	
}
