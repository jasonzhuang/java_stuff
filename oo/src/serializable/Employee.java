package serializable;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Serializable {
	public Employee() {
		
	}

	public Employee(String name, double salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
		this.hireDay = calendar.getTime();
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public Date getHireDay() {
		return hireDay;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary*byPercent/100;
		salary += raise;
	}
	
	public String toString() {
		return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay ="
				+ hireDay + "]";
	}
	
	private String name;
	private double salary;
	private Date hireDay;
}
