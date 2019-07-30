package com.EmployeeManager.Methods;

import java.util.Iterator;

import com.EmployeeManager.ShowOptions.EmployeeDetails;
/*
 * This Class contains method for fetching an employee which get the data of the employee from Collection.
 */

public class FetchEmployeeMethods extends CreateEmployee {
	int flag = 0;
	Iterator<EmployeeDetails> itr = al.iterator();

	/*
	 * Methods below takes Parameters from the user_input and being called to
	 * according method
	 */
	public void fetch() {
		for (EmployeeDetails ed : al) {
			flag = 1;
			System.out.println("\nPersonal Details of an Employee Are:\n");
			System.out.println(ed.name + "\n" + ed.age + "\n" + ed.gender + "\n" + ed.address + "\n");
			System.out.println("\nProfessional Details of an Employee Are:\n");
			System.out.println(
					ed.id + "\n" + ed.name + "\n" + ed.salary + "\n" + ed.department + "\n" + ed.skills + "\n");
		}
		if (flag == 0) {
			System.out.println("No Records Found");
		}
	}

	public void fetch(String name) {
		for (EmployeeDetails ed : al) {
			if (ed.name.equalsIgnoreCase(name) || ed.department.equalsIgnoreCase(name)) {
				flag = 1;
				System.out.println("\nPersonal Details of an Employee Are:\n");
				System.out.println(ed.name + "\n" + ed.age + "\n" + ed.gender + "\n" + ed.address + "\n");
				System.out.println("\nProfessional Details of an Employee Are:\n");
				System.out.println(
						ed.id + "\n" + ed.name + "\n" + ed.salary + "\n" + ed.department + "\n" + ed.skills + "\n");
			}
		}
		if (flag == 0) {
			System.out.println("No Records Found");
		}
	}

	public void fetch(int id) {
		for (EmployeeDetails ed : al) {
			if (ed.id == id) {
				flag = 1;
				System.out.println("\nPersonal Details of an Employee Are:\n");
				System.out.println(ed.name + "\n" + ed.age + "\n" + ed.gender + "\n" + ed.address + "\n");
				System.out.println("\nProfessional Details of an Employee Are:\n");
				System.out.println(
						ed.id + "\n" + ed.name + "\n" + ed.salary + "\n" + ed.department + "\n" + ed.skills + "\n");
			}
		}
		if (flag == 0) {
			System.out.println("No Records Found");
		}
	}
}
