import java.util.*;
class matrixadd{
    public static void main(String args[]){
    	int n,m,i,j;
    	int a[][]=new int[10][10];
    	System.out.println("Enter the size of row:");
    	Scanner sc=new Scanner(System.in);
    	m=sc.nextInt();
    	int b[][]=new int[10][10];
	System.out.println("Enter the size of column:");
	Scanner inp=new Scanner(System.in);
	n=inp.nextInt();
	System.out.println("Enter the elements of first array:");
	Scanner scc=new Scanner(System.in);
	for(i=0;i<m;i++){
	  for(j=0;j<n;j++){
	  	a[i][j]=scc.nextInt();
	  }
	}
	System.out.println("Enter the elements of second array:");
	Scanner sccc=new Scanner(System.in);
	for(i=0;i<m;i++){
	  for(j=0;j<n;j++){
	  	b[i][j]=sccc.nextInt();
	  }
	}
	System.out.println("First matrix is:");
	for(i=0;i<m;i++){
	  for(j=0;j<n;j++){
	  	System.out.print(a[i][j]+" ");
	  }
	   System.out.print("\n");
	}
	System.out.println("Second matrix is:");
	for(i=0;i<m;i++){
	  for(j=0;j<n;j++){
	  	System.out.print(b[i][j]+" ");
	  }
	  System.out.print("\n");
	}
	int c[][]=new int[10][10];
	System.out.println("Matrix addition:");
	for(i=0;i<m;i++){
	   for(j=0;j<n;j++){
		c[i][j]=a[i][j]+b[i][j];
		System.out.print(c[i][j]+"\t");
	   }
	   System.out.print("\n");
	}
   }
}
