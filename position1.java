package java_milestone;
import java.util.*;

import java.math.*;

import java.lang.*;

import java.util.Scanner;

public class position1 {
	


		public static void main(String ar[])

		{  

			int i, count=0;

			String str;

			int[] a=new int[20];

		    char st[]=new char[20];

			char ch;

			Scanner s=new Scanner(System.in);

			System.out.println("Enter the String=");

			str=s.nextLine();

			System.out.println("Enter the CHARACTER TO BE SEARCHED=");

			ch=s.next().charAt(0);

			st=str.toCharArray();

			for( i=0;i<st.length;i++)

			{

				if(st[i]==ch)

				{count++;

					System.out.println("The index of "+ch+" is"+i);

				}

			}

			//for(i=0;i<2;i++)

			//{

				System.out.println("The Number of "+ch+" in String is"+count);

			//}

			

			

		}
}
