package com.coding;

public class AsdingOrder {

	
	public static void main(String[] args) {
		int[] array={5,3,1,7,9,4,2};
		int length=array.length;
		int temp;
		for(int i=0;i<length;i++){
			
			for(int j=i+1;j<length;j++){
				if(array[i]>array[j]){
				 temp=array[i];
				 array[i]=array[j];
				 array[j]=temp;
				}
			}
		}
		System.out.println("after sorting");
		for(int k=0;k<length;k++){
			System.out.println(array[k]);
		}
		System.out.println("descing order");
		for(int m=length-1;m>0;m--){
			System.out.println(array[m]);
			
		}
	}
	
}
