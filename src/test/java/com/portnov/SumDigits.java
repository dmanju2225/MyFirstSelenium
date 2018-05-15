package com.portnov;

public class SumDigits
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
    int num=211;
    int rem;
  int result=0;
    while(num>0){
     rem=num%10;
     num=num/10;
    result+=rem;
	}
    System.out.println(result);
	}
}
