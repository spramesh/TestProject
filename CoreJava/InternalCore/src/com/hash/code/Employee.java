package com.hash.code;

public class Employee extends Object {

	private int sno;
	private String sname;
	
	Employee(int sno,String name){
		this.sno=sno;
		this.sname=name;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	@Override
	public int hashCode() {
		System.out.println("HashCode : "+this.sno);
		return this.sno;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean k=false;
		Employee ed=(Employee)obj;
		if(ed.getSno()==this.sno){
			k=true;
		}
		System.out.println("return ramesh : "+k);
		return k;
	}
	
	@Override
	public String toString() {
		return this.sname+this.sno;
	}
	
	
	
}
