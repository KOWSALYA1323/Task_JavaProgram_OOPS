package javaprogram;

public class Employee {
	
	
	int id;
	String firstname;
	String lastname;
	double salary;
	
	
	public Employee (int id, String firstname, String lastname, double salary)
	
	{
		
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.salary=salary;
		
	}
	
	public int getId()
	
	{
		return id;
		
	}
	
	
public String getFirstName()
	
	{
	return firstname;
	}

public String getLastName()

{
	return lastname;
	
}


public double getSalary()

{
	return salary;
	
}

public void raiseSalary(double percent)

{
	salary = salary * (percent/100);
}

	public static void main(String[] args) {
		Employee E1 = new Employee(14906, "Kowsalya","V" , 20000);
     System.out.println("ID : "+E1.getId());
     System.out.println("FirstName : "+E1.getFirstName());
     System.out.println("LastName : "+E1.getLastName());
     System.out.println("Salary : "+E1.getSalary());
     E1.raiseSalary(12);
     
     System.out.println("RaisedSalary "+E1.getSalary());
	}
	
	

}
