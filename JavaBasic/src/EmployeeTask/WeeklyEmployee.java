package EmployeeTask;

public class WeeklyEmployee  extends Employee {
	private int weeklySalary;
	private int noOfWeeksWorked;
	
	public WeeklyEmployee(String name, String jobTitle, String company, String department,int weeklySalary,int noOfWeeksWorked) {
		super(name,jobTitle,company,department);
		this.weeklySalary = weeklySalary;
		this.noOfWeeksWorked = noOfWeeksWorked;
	}
	
	
	
	


	public int getWeeklySalary() {
		return weeklySalary;
	}




	public int getNoOfWeeksWorked() {
		return noOfWeeksWorked;
	}





	public void empDetials() {
		super.empDetials();
		System.out.println("Weekly Salary : "+getWeeklySalary()+"\nNo Of Weeks Worked : "+getNoOfWeeksWorked()+
				"\nSalay : "+calcPay());
	}
	
	public int calcPay() {
		return getNoOfWeeksWorked()*getWeeklySalary();
	}
}

