package com.stream;

public class Employee {
private int eno;
private String ename;
private int dept;

public Employee(int eno,String ename,int dept) {
  this.eno=eno;
  this.ename=ename;
  this.dept=dept;
}

public int getEno() {
	return eno;
}
public void setEno(int eno) {
	this.eno = eno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getDept() {
	return dept;
}
public void setDept(int dept) {
	this.dept = dept;
}

}
