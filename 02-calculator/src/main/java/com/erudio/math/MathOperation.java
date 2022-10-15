package com.erudio.math;

public class MathOperation {

	public Double sum (Double firstNumber, Double secondNumber) {
		return firstNumber + secondNumber;
	}
	
	public Double sub (Double firstNumber, Double secondNumber) {
		return firstNumber - secondNumber;
	}
	
	public Double div (Double firstNumber, Double secondNumber) {
		return firstNumber / secondNumber;
	}
	
	public Double mut (Double firstNumber, Double secondNumber) {
		return firstNumber * secondNumber;
	}
	
	public Double med (Double firstNumber, Double secondNumber) {
		return (firstNumber + secondNumber) / 2;
	}
	
	public Double root (Double number)  {
		return (Double) Math.sqrt(number);
	}
	
	
	
}
