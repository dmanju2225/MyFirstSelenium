package com.portnov;

public class Calculator
{
int result;
	public void switchOn(){
		result=0;
	}
	public void add(int a){
		result=result+a;
	}
	public void substract(int a){
		result=result-a;
	}
	public int getResult(){
		return result;
	}
	public void multiply(int a){
		result=result*a;
	}
	public void devide(int a){
		
		result=result/a;
	}

}
