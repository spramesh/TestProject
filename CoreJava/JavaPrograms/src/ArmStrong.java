
public class ArmStrong {

	
	private static boolean isArmStrong(int number) {
        int result = 0;
        int orig = number;
        while(number != 0){
            int remainder = number%10;
            result = result + remainder*remainder*remainder;
            number = number/10;
        }
        //number is Armstrong return true
        if(orig == result){
            return true;
        }
      
        return false;
    } 


//Read more: http://www.java67.com/2012/07/java-program-to-find-armstrong-numbers.html#ixzz4ocZ0QZ13

	
}
