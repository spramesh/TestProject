import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Concurence {

	public int noCount(Collection collect ,Object m){
		
		int count=0;
		for(Object obj : collect){
			if(m.equals(obj)){
				count++;
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		ArrayList<String> str=new ArrayList<String>();
		str.add("ramesh");
		str.add("kiran");
		str.add("ramesh");
		str.add("varma");
		Iterator strma=str.iterator();
		try{
			Concurence text=new Concurence();
			
			
			for(String no:str){
				System.out.println(no +": " +text.noCount(str, no) );
			}
			
			//System.out.println(new Concurence().noCount(str, "ramesh"));
			
			
		while(strma.hasNext()){
			strma.next();
			//str.remove("ramesh");
			
		}
		}catch(Exception se){
		se.printStackTrace();
		}
		
	}
}
