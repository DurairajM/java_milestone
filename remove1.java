package java_milestone;
import java.util.Scanner;
public class remove1 {

static int[] getCharCountArray(String str)

		    {

		       int count[] = new int[100];

		       for (int i = 0; i<str.length();  i++)

		          count[str.charAt(i)]++;

		        

		       return count;

		    }

		      static String removeDirtyChars(String str, String mask_str)

		    {

		      int count[]  = getCharCountArray(mask_str);

		      int ip_ind  = 0, res_ind = 0;

		       

		      char arr[] = str.toCharArray();

		       

		      while (ip_ind != arr.length)

		      {

		        char temp = arr[ip_ind];

		        if(count[temp] == 0)

		        {

		            arr[res_ind] = arr[ip_ind];

		            res_ind ++;

		        }

		            ip_ind++;

		         

		      }    

		 

		      str = new String(arr);

		       

		      return str.substring(0, res_ind);

		       

		    }

		     

		    public static void main(String[] args)

		    {

		    	Scanner sc=new Scanner(System.in);

		        String str =sc.nextLine();

		        String mask_str =sc.nextLine();

		        System.out.println(removeDirtyChars(str, mask_str));

		        sc.close();

		    }

		

	}
