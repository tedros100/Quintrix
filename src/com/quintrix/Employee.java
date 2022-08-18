package com.quintrix;


public class Employee {
	private long employeeId;
	private String employeeName;
	private String employeeAddress;
	private long employeePhone;
	private double basicSalary;
	private double specialAllowance=250.80;
	private double hra=1000.50;
	
	public Employee(long id, String name, String address, 
			long phone) {
		employeeId=id;
		employeeName=name;
		employeeAddress=address;
		employeePhone=phone;	
	}
	
	public Employee(){
		this(0, "","",0);
		specialAllowance = 0;
		hra = 0;
	}
	
	public void calculateSalary() {
		double salary = basicSalary + ( basicSalary * specialAllowance/100) +
				( basicSalary *
				hra/100);
		System.out.println("Your salary is "+salary);
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public long getEmployeePhone() {
		return employeePhone;
	}

	public void setEmployeePhone(long employeePhone) {
		this.employeePhone = employeePhone;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getSpecialAllowance() {
		return specialAllowance;
	}

	public void setSpecialAllowance(double specialAllowance) {
		this.specialAllowance = specialAllowance;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}
	
	public void calculateTransportAllowance() {
		double transportAllowance=0.1*basicSalary;
		System.out.println("Transport Allowance: "+transportAllowance);
	}
}
