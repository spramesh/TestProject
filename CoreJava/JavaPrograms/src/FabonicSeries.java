import java.util.Scanner;

public class FabonicSeries {
	public static void main(String[] args) {

		System.out.println("enter a number how many fabonic series do you want");
		int number= new Scanner(System.in).nextInt();
        for(int i=1;i<=number;i++){		
        	System.out.println(fabonicSeries(i)+" ");
        }
		
	}
	
	public static int fabonicSeries(int no){
		if(no==1 ||no==2){
			return 1;
		}
		int fo1=1;
		int fo2=1;
		int fobonicc=1;
		for(int k=1;k<=no;k++){
			fobonicc=fo1+fo2;
			fo1=fo2;
			fo2=fobonicc;
		}
		return fobonicc;
		
	}
}
