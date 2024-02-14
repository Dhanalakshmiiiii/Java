import java.util.*;
class Multi{
   public static void main(String args[]){
       char[][] test={
       		{'D','B','A','C','B'},
       		{'A','B','C','A','A'},
       		{'B','B','C','A','B'},
       		{'D','D','A','C','B'},
       		{'D','C','B','A','A'}
       	      };
      char[] keys={'D','C','B','A','B'};
      int i,j,count=0;
      for(i=0;i<5;i++){
        for(j=0;j<5;j++){
        	if(test[i][j]==keys[j]){
        	   count=count+1;
        	}
        }
        System.out.println("Score of "+i+1+" is "+count);
        count=0;
     }
  }
}
