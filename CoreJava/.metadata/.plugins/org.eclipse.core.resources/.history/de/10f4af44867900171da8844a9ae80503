
public class DuplicateArrayInt {

	
	public static void main (String[]args) {

		int[] duplicate= {1,2,1,4,5,7,7};
		int[] withouduplicat= new  int[duplicate.length];
		int count=0;
		for(int i=0;i<duplicate.length;i++){
			for(int j=i+1;j<duplicate.length;j++){
				if((duplicate[i]==duplicate[j]&& i!=j)){
					System.out.println("duplicatats is : "+duplicate[i]);
					count++;
				}else{
					withouduplicat[i]=duplicate[i];
				}
			}
		}
		
		System.out.println("count is : "+withouduplicat.length);
		
	}
}
