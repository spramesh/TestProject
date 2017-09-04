package com.coding;

public class StringDuplicates {

	
	public static void main(String[] args) {
		//String[] duplicate={"Ramesh","kiran","Ramesh","Varma"};
		int[] duplicate={4,5,4,4,6,6,7};
       int size=duplicate.length;
       for(int i=0;i<size;i++){
    	   for(int j=i+1;j<size;j++){
    		   if(duplicate[i]==duplicate[j]){
    			   while(j<size-1){
    				   duplicate[j]=duplicate[j+1];
    				   j++;
    			   }
    			   size--;
    		   }
    	   }
       }
       System.out.println(size);
       for(int k=0;k<size;k++){
    	   System.out.println(duplicate[k]);
       }
				
	}
	
}
