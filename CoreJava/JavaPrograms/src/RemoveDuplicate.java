import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicate {
 public static void main(String[] args) {
	int[] inputArray={3,4,5,6,6,6,8,8,9};
	
	/*List li= Arrays.asList(inputArray);
	
	HashSet<Integer> dup=new HashSet<Integer>(li);
for(Integer mm:dup){
	System.out.print(mm);
}*/
int[] output=removeDuplicates(inputArray);
for(int m=0;m<output.length;m++){
	System.out.println(output[m]);
}
	
	
}
 
 public static int[] removeDuplicates(int[] input){
	 int[] out= new int[10];
	 
	 int i=0;
	 int j=1;
	 if(input.length<2){
		 return input;
	 }
	 while(i<input.length){
		 if(input[i]==input[j]){
			 i++;
		 }else{
			 input[j++]=input[i++];
		 }
	 }
	 int[] output= new int[j+1];
	 for(int k=0;k<output.length;k++){
		 output[k]=input[k];
	 }
	 return output;
 }
}
