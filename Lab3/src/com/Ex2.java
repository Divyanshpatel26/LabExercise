package com;

import java.util.Scanner;

public class Ex2 {

	String getMethod(String str)
	{
		StringBuffer br=new StringBuffer(str);
		br.append('|');
		StringBuffer str2=new StringBuffer(str);
		str2.reverse();
		br.append(str2);
		
		return br.toString();
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Ex2 ex=new Ex2();
		System.out.println("Enter String");
		String str=sc.next();
		System.out.println(ex.getMethod(str));
	}

}
