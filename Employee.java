import java.util.Scanner;
class Emp{
   int empno;
   String ename;
   double salary;
   
   Emp(int empno,String ename,double salary){
   	this.empno=empno;
   	this.ename=ename;
   	this.salary=salary;
   }
   void display(){
   	System.out.println("Employee number:"+empno);
   	System.out.println("Employee Name:"+ename);
   	System.out.println("Employee Salary:"+salary);
   }
}

public class Employee{
  public static void main(String args[]){
  	int i;
  	int n;
  	Scanner sc=new Scanner(System.in);
  	System.out.println("Enter the size:");
  	n=sc.nextInt();
	Emp[] emp=new Emp[n];
	for(i=0;i<n;i++){
	   System.out.println("Enter details for employee:"+(i+1));
	   System.out.println("Enter employee number:");
	   int empno=sc.nextInt();
	   System.out.println("Enter employee name:");
	   String ename=sc.next();
	   System.out.println("Enter employee Salary:");
	   double salary=sc.nextDouble();
	   emp[i]=new Emp(empno,ename,salary);
	}
	System.out.println("Enter the employee number to search:");
	int searchno=sc.nextInt();
	boolean found=false;
	for(i=0;i<n;i++){
		if(emp[i].empno == searchno){
		   System.out.println("Employee found");
		   emp[i].display();
		   found=true;
		   break;
		}
	}
  }
}
