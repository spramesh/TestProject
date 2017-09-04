import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class DuplicateString {

	public static void main(String[] args) {
		ArrayList<String> kk= new ArrayList<String>();
		kk.add("Ramesh");
		kk.add("kiran");
		kk.add("Ramesh");
		
		
		HashSet<String> mm=new HashSet<String>(kk);
		for(String word:mm){
		System.out.println("the word : "+word +":"+ Dublicate(kk,word));
		}
		
		//Collections.frequency(c, o);
	}
	
	
	public static int Dublicate(ArrayList<String> listR,String word){
		int count=0;
		for(String origional:listR){
			if(origional.equals(word)){
				count=count+1;
			}
		}
		return count;
	}
}
