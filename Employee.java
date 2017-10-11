package emp;
//Creating a class Employee
//Package is a grouping of related types providing access protection and name 
//space management
public class Employee {
	//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
	//class defines instance and class fields,methods and inner classes as well as specifying the interfaces the class implements and the immediate superclass of the class
	//Employee is a class name
			
 int empId;//creating the properties  with different data types

 String empName;

 int TotalLeaves;

 double TotalSalary;

 //Creating the constructor of the Employee class

public Employee(int empId, String empName, int totalLeaves, double totalSalary) {
//The super keyword in java is a reference variable which is used to refer immediate parent
//class object.
//Whenever you create the instance of subclass, an instance of parent class is created 
	//implicitly which is referred by super reference variable.
	super();

	this.empId = empId;
//this refers to current object
	this.empName = empName;

	TotalLeaves = totalLeaves;

	TotalSalary = totalSalary;

	}

//Creating the abstract method calculate_balanceLeaves

void  calculate_balanceLeaves(){

}

//Creating the abstract method avail_leave

boolean avail_leave(int no_of_leaves, char type_of_leave){
//The return keyword is used to return from a method when its execution is complete
	//returns the boolean value
	return true;

}

//Creating the abstract method calculate_salary

void calculate_salary(){
}

}

//Creating a class PermanentEmp which is extending Employee class

class PermanentEmp extends Employee{

//here we are creating the variables and methods for PermanentEmp	

//Creating three variables

double basic,hra,pfa;

// constructor: it is from parent class

	public PermanentEmp(int empId, String empName, int totalLeaves, double totalSalary) {

		super(empId, empName, totalLeaves, totalSalary);

	//	

	}

	//initializing the variables

	int paid_leave=5,sick_leave=4,casual_leave=8;

	// Method to display leave details

	void print_leave_details() {

		//printline

		System.out.println("paid_leave" + paid_leave + "sick_leave" + sick_leave + "casual_leave" + casual_leave);

	}

	//overriding the calculate_balanceLeaves method

	@Override

	void calculate_balanceLeaves() {

		
//here we are calculating the total no.of leaves taken
		int balanceTotal=TotalLeaves-(paid_leave+sick_leave+casual_leave);

		System.out.println("Total leaves left= "+balanceTotal);

		}

	//overriding the avail_leave method

	@Override

	boolean avail_leave(int no_of_leaves, char type_of_leave) {

		if( no_of_leaves< TotalLeaves){

			return true;

		}else{

			return false;

		}

		

	}

	//Overriding the calculate_salary method

	@Override

	void calculate_salary() {

		double hra=0.5f* basic;

		double da= .2f * basic;

		double totalSalary = TotalSalary + (hra + da) - pfa;

		System.out.println("Salary of the employee is = "+ totalSalary);

	}

	

}

//Creating a class TemporaryEmp which is extending Employee class

class TemporaryEmp extends Employee{

	//Creating three variables

	double basic,hra,pfa;

	//Creating the constructor of the Employee class

	public TemporaryEmp(int empId, String empName, int totalLeaves, double totalSalary) {

		super(empId, empName, totalLeaves, totalSalary);

		

	}

	//initializing the variables

	int paid_leave=5,sick_leave=4,casual_leave=8;

	// Method to display leave details

	void print_leave_details() {

		System.out.println("paid_leave" + paid_leave + "sick_leave" + sick_leave + "casual_leave" + casual_leave);

	

	}

	//overriding the calculate_balanceLeaves method

	@Override

	void calculate_balanceLeaves() {

		

		int balanceTotal=TotalLeaves-(paid_leave+sick_leave+casual_leave);

		System.out.println("Total leaves left= "+balanceTotal);

		}

	//Overriding the calculate_salary method

	@Override

	boolean avail_leave(int no_of_leaves, char type_of_leave) {

		if( no_of_leaves< TotalLeaves){

			return true;

		}else{

			return false;

		}

		

		}

	

	@Override

	//Overriding the calculate_salary method

	void calculate_salary() {
//The double data type is a double-precision 64-bit IEEE 754 floating point
		double hra=0.5f* basic;

		double da= .2f * basic;

		double totalSalary = TotalSalary + (hra + da) - pfa;
//here we are getting total salary  value
		System.out.println("Salary of the employee is = "+ totalSalary);
//prints the total salary
		//System is a final class in java.lang package
		//out is a static member field of system class and it's type PrintStream
		//println is a method of PrintStream class and it means print in next line
		//Inside the brackets is value which to be printed			    

	}

}

