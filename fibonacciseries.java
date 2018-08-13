package java_milestone;
import java.util.*;
import java.lang.*;
import java.util.Scanner;
public class fibonacciseries {  

	 private static String f;

	public static void main(String[] args)

	 {

	        Scanner s=new Scanner(System.in);

	        System.out.println("Enter number of elements");

	        int n=s.nextInt();

	        int  a = 0, b = 1;

	        System.out.println("First " + n + " terms: ");



	        for (int i = 1; i <= n; ++i)

	        {

	            System.out.println(f + " + ");



	            int sum = a + b;

	            a = b;

	            b = sum;

	        }

	    }

	}

