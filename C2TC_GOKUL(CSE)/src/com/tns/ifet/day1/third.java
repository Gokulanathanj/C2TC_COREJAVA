package com.tns.ifet.day1;

import java.util.Scanner;

public class third {

	public static void main(String[] args) {
		Scanner value=new Scanner(System.in);
		System.out.println("enter values below:");
		int value1 = value.nextInt(); //integer division
		float value2 = value.nextFloat();
		double value3 = value.nextDouble();
		float value4 = value.nextFloat(); //float division
		System.out.println("value 1=" + value1);
		System.out.println("value 2=" + value2);
		System.out.println("value 3=" + value3);
		System.out.println("value 4=" + value4);
		int marker = 512;
		//assigning expression to variable
		double percentage = marker * 0.46f;
		System.out.println("percentage :" +
		percentage);
		// TODO Auto-generated method stub

	}

}
