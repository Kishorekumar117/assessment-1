package EmployeeTask;

public class HourlyEmployee extends Employee {
	private int hourlyRate;
	private int hoursWorked;
	
	public HourlyEmployee(String name, String jobTitle, String company, String department,int hourlyRate,int hoursWorked) {
		super(name,jobTitle,company,department);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	
	
	public int getHourlyRate() {
		return hourlyRate;
	}





	public int getHoursWorked() {
		return hoursWorked;
	}


	public void empDetials() {
		super.empDetials();
		System.out.println("Hourly Rate : "+getHourlyRate()+"\nHorus Worked : "+getHoursWorked()+
				"\nSalay : "+calcPay());
	}
	
	public int calcPay() {
		return getHoursWorked()*getHourlyRate();
	}
}
