package java_milestone;
import java.util.*;
import java.lang.*;
import java.util.Scanner;
public class list_array {

	public static void main(String[] args)

	{

	    Scanner s=new Scanner(System.in);

	    int n=s.nextInt();

	    int list[]=new int[n];

	    

	    System.out.println("Enter number of array elements");

	    

	    System.out.println("Enter array elements");

	    for(int i=0;i<n;i++)

	    {

	        list[i]=s.nextInt();

	        System.out.println(list[i]);

	    }

	    for(int i=0;i<n;i++)

	    {

	        if(list[i]<list[i+1])

	           {

	               System.out.println("Least element in array is"+list[i]);

	               System.out.println(list[i]-1);

	           }

	    }

	}

}
