package com.quintrix;


public class Manager extends Employee {
	public Manager(long id, String name, String address, long phone, 
			double salary) {
		super(id,name,address,phone);
		setBasicSalary(salary);
	}
	
	@Override
	public void calculateTransportAllowance() {
		double transportAllowance=0.15*getBasicSalary();
		System.out.println("Transport Allowance: "+transportAllowance);
	}

}
