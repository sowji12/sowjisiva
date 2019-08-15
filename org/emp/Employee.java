package org.emp;

public class Employee {
	//Depends on datatype
private void database(int empId) {
	System.out.println(empId);
}
//Depends on datatype order
private void database(int regId,String Name) {
	System.out.println("regId and empNmae is:"+regId+"\t"+Name);
}
private void database(long mobNo,float salary) {
	System.out.println("my mobno and Salary is:"+mobNo+"\t"+salary);
}
private void database(char block) {
	System.out.println(" block is:"+"\t"+"\t"+block);
}
public static void main(String[] args) {
	Employee e =new Employee();
	e.database(32455);
	e.database(23456, "sowji");
	e.database(9887878954l, 25f);
    e.database( 'a');

}

	

}


	
	




