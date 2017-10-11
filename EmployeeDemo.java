package emp;
//Creating a class EmployeeDemo
//Package is a grouping of related types providing access protection and name 
//space management
public class EmployeeDemo {
	//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
	//class defines instance and class fields,methods and inner classes as well as specifying the interfaces the class implements and the immediate superclass of the class
	//Employee is a class name
		
// Main method 

	public static void main(String[] args) {

		//Creating object of the permanentEmp and passing the arguments

		PermanentEmp pe= new PermanentEmp(0012,"Ram",17,30000.00);

		System.out.println("permanent employee detail");

		/* calling id,name,no of TotalLeaves */

		System.out.println("Id  =" + pe.empId);

		System.out.println("name =" + pe.empName);

		System.out.println("leave =" + pe.TotalLeaves);

		/* calling the method */

		pe.calculate_balanceLeaves();
//calculate the balances leaves and available leaves
		pe.avail_leave(17, (char)0);
//
		pe.calculate_salary();
//calculate the salary
		System.out.println("..................................");



		//Creating object of the permanentEmp and passing the arguments

		TemporaryEmp te= new TemporaryEmp(5643,"Neha",17,25000.00);

		System.out.println("Temprory employee detail");

		/* calling id,name,no of TotalLeaves */

		System.out.println("Id  =" + te.empId);

		System.out.println("name =" + te.empName);

		System.out.println("leave =" + te.TotalLeaves);

		/* calling the method */

		te.calculate_balanceLeaves();
		
		te.avail_leave(17, (char)0);

		te.calculate_salary();



	}



}
