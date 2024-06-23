package salarioDosFuncionarios;

import java.util.Scanner;
import outroPack.Employee;
import outroPack.OutsourcedEmployee;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of employees: ");
		int quantityEmployees = sc.nextInt();
		
		
		for(int j = 0; j < quantityEmployees; j++) {
			System.out.print("Employee #" + (j + 1) + " data: ");
			System.out.print("Outsourced (y/n)? ");
			String x = sc.next();			
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.println("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			Double additionalCharge = null;
			
			Employee employees;
			if(x.equals("y")) {
				System.out.print("Additional charge: ");
				additionalCharge = sc.nextDouble();
				employees = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);	
				Double salary = employees.payments();
				employees.setSalary(salary);
			}else {
				employees = new Employee(name, hours, valuePerHour);
				Double salary = employees.payments();
				employees.setSalary(salary);
			}
			employees.addEmployee(employees);
		}
		
		System.out.println("PAYMENTS: ");
		for (int i = 0; i < Employee.Employees().size(); i++) {
            Employee e = Employee.Employees().get(i);
            System.out.print(e.getName());
            System.out.print(" - ");
            System.out.println(e.getSalary());
            
        }
		
		sc.close();
	}

}