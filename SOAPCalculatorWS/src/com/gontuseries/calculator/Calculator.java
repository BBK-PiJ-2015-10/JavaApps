package com.gontuseries.calculator;

/*
 * To access http://localhost:8080/SOAPCalculatorWS/services
 */

public class Calculator {
	
	public int addition (int param1, int param2){
		return param1 + param2;
	}
	
	public int substraction(int param1, int param2){
		int result = param1 - param2;
		return result;
	}
	
	public int multiplication(int param1, int param2){
		return param1 * param2;
	}
	
	public int division(int param1, int param2){
		return param1 / param2 ;
	}
	

}
