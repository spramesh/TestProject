
public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("the number before swapping : is "+a +" :  "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("the number after swapping : is "+a +" :  "+b);
	}
	
}
