package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of employees: ");
		int n = sc.nextInt();
		
		List <Employee> list = new ArrayList<>();
		for (int i = 1; i<=n; i++) {
			System.out.println("Employee #"+ i + " data");
			System.out.print("Outsourced? (Y/N)");
			char ch = sc.next().charAt(0); 
			System.out.print("Name:");
			sc.nextLine(); 
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if (ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(emp); 
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}			
				
		}
		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee emp : list) {
			System.out.println(emp.getName() + "- $" + emp.payment());
		}
		
		sc.close();
	}
}
