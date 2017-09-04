package com.hash.code;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


import javax.swing.plaf.synth.SynthSpinnerUI;

public class HashSetInternal {

	
	public static void main(String[] args) {
		/*HashSet<Employee> hash1=new HashSet<Employee>();
		hash1.add(new Employee(10,"ramesh"));
		hash1.add(new Employee(10, "divya"));
		hash1.add(new Employee(20, "ram"));
		hash1.forEach(e-> System.out.println(e.getSno()));
		*/
		
		HashMap mp= new HashMap();
        mp.put("10", new Employee(10, "ramesh"));
        mp.put("10", new Employee(10, "divya"));
        mp.put("20", new Employee(30, "kiran"));
        System.out.println(mp);
	}
	
	
}
