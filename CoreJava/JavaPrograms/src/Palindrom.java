import java.util.Scanner;

public class Palindrom {
  public static void main(String[] args) {
	int number=111;//new Scanner(System.in).nextInt();
	
	System.out.println("check palandram  "+isPalandrom(number));
}
 public static boolean isPalandrom(int origional){
	 int temp=origional;
	 int reminder=0;
	 int reverse=0;
	 while(origional>0){
		 reminder=origional%10;
		 reverse=reverse*10+reminder;
		 origional=origional/10;
	 }
	 if(temp==reverse){
		 return true;
	 }else{
		 return false;
	 }
 }
	
	
}
