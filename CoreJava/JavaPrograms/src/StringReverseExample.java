import java.util.Collections;

public class StringReverseExample {
	public static void main(String[] args) {
      
		String str="string is reversal";
		System.out.println("before : "+str);
		String reverse=new StringBuffer(str).reverse().toString();
	  System.out.println(reverse);
		//	System.out.println(reverse(str));
		
		
	}
	
	
public static String reverse(String srtp){
	StringBuilder str=new StringBuilder();
	char[] toChar=srtp.toCharArray();
	for(int i=toChar.length-1;i>=0;i--){
		str.append(toChar[i]);
	}
	return str.toString();
}

	
}
