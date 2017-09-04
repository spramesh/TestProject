package com.lumbda.without;

public class WithoutLambda {

	// annomouys inner class
	public static void main(String[] args) {
		Print ts= new Print(){
		public void 	statemtn(){
				System.out.println("print ln method ");
			}
		};
		ts.statemtn();
	}
	
	
}
