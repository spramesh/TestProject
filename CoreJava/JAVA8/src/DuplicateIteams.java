import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DuplicateIteams {

	HashMap<Object, Object> thp=new HashMap<Object, Object>();
	public boolean duplicate(Object obj){
		return (boolean) thp.put(obj, new Object());
	}
	
	
	public static void main(String[] args) {
		ArrayList<String> kk= new ArrayList<String>();
	    kk.add("ram");
	    kk.add("kir");
	    kk.add("varma");
	    kk.add("ram");
	    HashSet hst= new HashSet();
	    System.out.println(new DuplicateIteams().duplicate(kk));
	    
	    hst.add("ram");
	    for(String mm: kk){
	    	System.out.println(mm);
	    }
	}
	
}
