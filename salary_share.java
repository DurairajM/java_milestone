package java_milestone;
import java.util.*;

import java.lang.*;
public class salary_share {

	public static void main(String args[])

	{

	float sum=444;

	float shd,sha=3,shb=4,shc=5;//Share of a, b, c workers 

	float reda=4,redb=5,redc=6;//Decrement from a, b ,c salaries

	shd=(sum-(reda+redb+redc))/12;  

	System.out.printf("Salary of A=%f Rs\n",(sha*shd)+reda);

	System.out.printf("Salary of B=%f Rs\n",(shb*shd)+redb);

	System.out.printf("Salary of C=%f Rs\n",(shc*shd)+redc);

	}

}
