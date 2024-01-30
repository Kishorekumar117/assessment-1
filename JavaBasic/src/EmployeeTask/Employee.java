package EmployeeTask;

public class Employee {
	private String name;
	private String jobTitle;
	private String company;
	private String department;
	
	public Employee(String name, String jobTitle, String company, String department) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.company = company;
		this.department = department;
	}
	
	
	
	
	public String getName() {
		return name;
	}


	public String getJobTitle() {
		return jobTitle;
	}

	public String getCompany() {
		return company;
	}


	public String getDepartment() {
		return department;
	}



	public void empDetials() {
		System.out.println("Employee Deteials");
		System.out.println("=================");
		System.out.println("Name : "+getName()+"\njob-Title : "+getJobTitle()+"\nCompany : "
		+getCompany()+"\nDepartment : "+getDepartment());
	}
	
	public int calcPay() {
		return 0;
	}
	
}
