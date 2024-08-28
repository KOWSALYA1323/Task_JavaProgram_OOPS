package javaprogram;

public class Person {
	
	 String name;
	 int age;
	
	public Person (String name, int age)
	{
		
		
		this.name = name;
		this.age = age;
		
	}
     public String getName()
     
     {
    	 return name;
     }
     
   public int getAge()
     
     {
    	 return age;
     }
    
	public static void main(String[] args) {
		
		Person P1 = new Person("Kowsalya", 28);
		System.out.println("Name " +P1.getName());
		System.out.println("Age " +P1.getAge());

	}

}
