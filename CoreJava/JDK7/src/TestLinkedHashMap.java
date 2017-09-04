import java.util.LinkedHashMap;

public class TestLinkedHashMap {

	
	
	
	public static void main(String[] args) {
		LinkedHashMap<String, String> l= new LinkedHashMap<>();
		
		l.put("ramesh", "valuRam");
		l.put("suresh" , "valueSures");
		System.out.println(l);
		l.put("ramesh", "divya");
		System.out.println(l);
	}
}
