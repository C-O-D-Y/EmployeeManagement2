package com.EmployeeManager.Methods;

import java.util.Iterator;

import com.EmployeeManager.ShowOptions.EmployeeDetails;
/*
 *This Class have methods to delete an Employee.
 *Extending the CreateEmployee class to get Collection and all the objects of the Details.*/

public class DeleteEmployeeMethods extends CreateEmployee {
	int flag = 0;
	Iterator<EmployeeDetails> itr = al.iterator();
	public void delete() {
		al.removeAll(al);
		System.out.println("All Records Deleted");
	}

	public void delete(String name) {
		while (itr.hasNext()) {
			EmployeeDetails ed = itr.next();
			if (ed.name.equalsIgnoreCase(name) || ed.department.equalsIgnoreCase(name)) {
				flag = 1;
				itr.remove();
				System.out.println("Employee Removed");
			}
		}
		if (flag == 0) {
			System.out.println("No Records Found");
		}
	}

	public void delete(int id) throws Exception {
		try {
		while (itr.hasNext()) {
			EmployeeDetails ed = itr.next();
			if (ed.id == id) {
				flag = 1;
				itr.remove();
				System.out.println("Employee Removed");
			}
		}
		if (flag == 0) {
			System.out.println("No Records Found");
		}
		}
		catch(NullPointerException npe)
		{
			System.out.println("Please enter Integer Value");
		}
		catch(ClassCastException cce)
		{
			System.out.println("Error Please try Again");
		}
	}
}
