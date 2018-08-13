package java_milestone;
import java.util.*;

import java.lang.*;

public class mark {
	


	public static void main(String[] args)

	{

	//%) students enrolled in the course

	int tot=50,pass,att;

	//Number of students attended the final exam=90% of total enrollment

	att=(50*90/100);

	System.out.println("Number of students who attended the exam are "+att);

	//Number of students who passed the final exam is 2/3 of attendance

	pass=(att*1/3);

	System.out.println("Number of students who cleare the exam are " +pass);

	}
}
