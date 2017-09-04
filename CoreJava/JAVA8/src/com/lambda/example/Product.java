package com.lambda.example;

public class Product {

private int sno;
private String sname;

public Product(int sno,String sname) {
 this.sno=sno;
 this.sname=sname;
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


public String toString(){
	return sno+sname;
}
	
}
