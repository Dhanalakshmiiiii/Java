import java.util.Arrays;
import java.util.Scanner;
public class Sort{
   public static void main(String args[]){
   	int n1;
   	Scanner read=new Scanner(System.in);
   	System.out.println("Enter the size of array:");
   	n1=read.nextInt();
   	System.out.println("Enter the values:");
   	String[] arr=new String[n1];
   	for(int i=0;i<n1;i++){
   	  arr[i]=read.next();
   	}
   	Arrays.sort(arr);
   	System.out.println(Arrays.toString(arr));
   	for(int i=0;i<n1;i++){
   	    System.out.print(arr[i]+",");
   	}
   }
}
