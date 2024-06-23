package outroPack;

import java.util.ArrayList;

public class Employee {
	
	private String name;
	protected Integer hours;
	protected Double valuePerHour;
	protected Double salary;
	private static ArrayList<Employee> Employees = new ArrayList<Employee>();
	
	public Employee() {	
		
	}
	
	public Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	
	public String getName() {
		return name;
	}	
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	
	// Metedo para pagamento de colaboradores
	public Double payments() {
		return hours * valuePerHour;
		
	}
	
	// Metodos AyyaList<Employees>
	
	public void addEmployee(Employee Employee) {
		Employees.add(Employee);
	}
	public Employee verEmployee(int posicao) {
		return Employees.get(posicao);
	}
	public static ArrayList<Employee> Employees(){
		return Employees;
	}
	
}