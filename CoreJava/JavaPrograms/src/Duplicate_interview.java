import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duplicate_interview {

	
	public static void main(String[] args) {
		int[] arrayA={1,2,4,6,8,9};
		int[] arrayB={4,5,6};
		int[] outPut=new int[arrayA.length];
		for(int i=0;i<arrayA.length;i++){
			
			boolean flag=false;
			for(int j=0;j<arrayB.length;j++){
				if(arrayA[i]==arrayB[j]){
					flag=true;
				}
			}// closing first loop
			if(flag==false){
				outPut[i]=arrayA[i];
			}
		}// closing 2d loop
		
		System.out.println(Arrays.toString(outPut));
		
		
		// 2nd way
		
		List arrayAList=(ArrayList) Arrays.asList(arrayA);
		List arrayBList=(ArrayList) Arrays.asList(arrayB);
		
		
		
	}
}
