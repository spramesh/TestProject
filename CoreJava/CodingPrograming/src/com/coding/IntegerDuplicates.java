package com.coding;

public class IntegerDuplicates {

	public static void main(String[] args) {
		int[] array={2,3,5,7,7};
		
		int size=array.length;
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(array[i]==array[j]){
					while(j<size-1){
						array[j]=array[j+1];
						j++;
					}
					size--;
				}
			}
		}
		//System.out.println(array.length);
		System.out.println(size);
	       for(int k=0;k<size;k++){
	    	   System.out.println(array[k]);
	       }
	}
}
