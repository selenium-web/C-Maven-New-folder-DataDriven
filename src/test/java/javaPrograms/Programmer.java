package javaPrograms;

public class Programmer extends Employee {
	
 String city="pune";
 String country;
 static int sum;
 static int totalsalary;
 
// Employee e;
 
 public static void main(String[] args)
 {
//	 Employee e = new Employee();
//	 sum=e.salary=5656;
//	 totalsalary= e.calculations(478, 8956);
//	 System.out.println("salary is " + sum + "     calculation is  "+totalsalary + "   name is "+e.name);	 
	 
	 Programmer p = new Programmer(); 
	 sum=p.salary=4569;
	 totalsalary= p.calculations(147, 789);
	 System.out.println("salary is " + sum + "     calculation is  "+totalsalary + "   name is "+p.name);
	 System.out.println("city is  " + p.city);   
	 
 }

}
