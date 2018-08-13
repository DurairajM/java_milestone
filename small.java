package java_milestone;
import java.util.*;

import java.util.List;

import java.util.Scanner;
public class small {

		void leasts(int arr[]) {

			List<Integer> sum = new ArrayList<Integer>();

			for(int i=0;i<5;i++) {

				for(int j=0;j<5;j++) {

					sum.add(arr[i]+arr[j]);

				}

			}

			int val=arr[0];

			for(int i=0;i<5;i++) {

				if (Arrays.asList(sum).contains(arr[i]) && val>arr[i]) {

					val=arr[i];

					

				}

			}

			

			System.out.println(val);

			

		}

		public static void main(String[] args) {

		System.out.println("Enter 5 numbers");

			

	    Scanner s=new Scanner(System.in);

	    int[] a=new int[5];

	    for (int i=0;i<5;i++) {

	    	a[i]=s.nextInt();

	    }

			small ss=new small();

			ss.leasts(a);

		}

}
