package com;

import java.util.Scanner;

public class Ex3 {
    String alterString(String str)
	{
    	char str2[]=str.toCharArray();
    	for(int i=0;i<str2.length;i++)
    	{
    		if(str2[i]!='a' || str2[i]!='e'||str2[i]!='i'||str2[i]!='o'||str2[i]!='u')
    		{
    			str2[i]= (char) (str2[i]+1);
    		}
    	}
    	
		return null;
		
	}

	public static void main(String[] args) {
		Ex3 ex=new Ex3();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.next();
		System.out.println(ex.alterString(s));
		
		
	}

}
