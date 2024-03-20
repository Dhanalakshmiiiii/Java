import java.util.*;
class Person{
   String name;
   String gender;
   String address;
   int age;
   Person(String n,String g,String a,int ag){
      name=n;
      gender=g;
      address=a;
      age=ag;
   }
}
class Employee extends Person{
    int empid;
    String comname;
    String quali;
    int salary;
    Employee(String n,String g,String a,int ag,int eid,String cn,String q,int s){
    	super(n,g,a,ag);
    	empid=eid;
    	comname=cn;
    	quali=q;
    	salary=s;
    }
}

class Teacher extends Employee{
    String subject;
    String department;
    String teaid;
    Teacher(String n,String g,String a,int ag,int eid,String cn,String q,int s,String sub,String dept,String tid){
    	super(n,g,a,ag,eid,cn,q,s);
    	subject=sub;
    	department=dept;
    	teaid=tid;
    }
    void display(){
    	System.out.println("Name:"+name);
    	System.out.println("Gender:"+gender);
    	System.out.println("Address:"+address);
    	System.out.println("Age:"+age);
    	System.out.println("Employee id:"+empid);
    	System.out.println("Company name:"+comname);
    	System.out.println("Qualification:"+quali);
    	System.out.println("Salary:"+salary);
    	System.out.println("Subject:"+subject);
    	System.out.println("Department:"+department);
    	System.out.println("Teacher id:"+teaid);
    }
}

class Main{
   public static void main(String args[]){
   	System.out.println("Enter the number of teachers:");
   	Scanner sc=new Scanner(System.in);
   	int n=sc.nextInt();
   	Teacher[] teachers=new Teacher[n];
   	for(int i=0;i<n;i++){
   		System.out.println(\n"Enter details of teacher:"+(i+1)+":");
   		System.out.print("Name:");
   		String name=sc.next();
   		System.out.print("Gender:");
   		String gender=sc.next();
   		System.out.print("Address:");
   		String address=sc.next();
   		System.out.print("Age:");
   		int age=sc.nextInt();
   		System.out.print("Employee Id:");
   		int empid=sc.nextInt();
   		System.out.print("Company Name:");
   		String comname=sc.next();
   		System.out.print("Qualification:");
   		String quali=sc.next();
   		System.out.print("Salary:");
   		int salary=sc.nextInt();
   		System.out.print("Subject:");
   		String subject=sc.next();
   		System.out.print("Department:");
   		String department=sc.next();
   		System.out.print("Teacher Id:");
   		String teaid=sc.next();
   		
   		teachers[i]=new Teacher(name,gender,address,age,empid,comname,quali,salary,subject,department,teaid);
   	}
   	System.out.println("---Details of teachers---");
   	for(int i=0;i<teachers.length;i++){
   		teachers[i].display();
   		System.out.println();
   	}
   }
}
