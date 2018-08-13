package java_milestone;
import java.util.*;
import java.lang.*;
public class arraydiv

{  

    void checkdiv(int arr[],int n)

    {

     for(int i=0;i<n;i++)

   

       if(arr[i]%3==0)

       {

       System.out.println(arr[i]+"is divisible by 3");    

       }

       else

       System.out.println("Not divisible");

    

}

    

    public static void main(String[] args)

    {

        Scanner s=new Scanner(System.in);      

   

        int n;

        System.out.println("Enter number of array elements");

        n=s.nextInt();

        int div[]=new int[n];

   

   System.out.println("Enter array elements");

   for(int i=0;i<n;i++)

       div[i]=s.nextInt();

    arraydiv obj=new arraydiv();

        obj.checkdiv(div,n);

  

    }

}

