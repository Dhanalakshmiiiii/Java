import java.util.*;
class TwoD{
   public static void main(String args[]){
   	int[][] a=new int[2][3];
   	int i,j;
   	Scanner input=new Scanner(System.in);
   	for(i=0;i<2;i++){
   		for(j=0;j<3;j++){
   		System.out.print(i+" "+j+" ");
   			a[i][j]=input.nextInt();
   		}
   	}
   	System.out.println("Output Matrix");
   	for(i=0;i<2;i++){
   	   for(j=0;j<3;j++){
   	      System.out.print(a[i][j]+" ");
   	   }
   	   System.out.print("\n");
   	}
   }
}
