package Session_2;
import java.util.*;

public class Assign_4 {

		public static void main(String[] args) {
			Scanner in= new Scanner(System.in);
			System.out.println("Enter a number");
			int a=in.nextInt();
			if(a==0)
			
				System.out.println("You have entered Zero");
			else
				if(a<0)
					System.out.println("You have entered negative number");
				else
					System.out.println("You have entered positive number");
		
			System.out.println("*****************************************");
		System.out.println("Enter the marks of Student");
		int m=in.nextInt();
		System.out.println("Enter the age of Student");
		int b=in.nextInt();
		if(b>=15)
		{
			if(m>=70)
				System.out.println("Grade is A");
			else if (m>=61 && m<70)
				System.out.println("Grade is B");
			else if (m<61)
				System.out.println("Grade is c");
		}
		else
		{
			if(m>=60)
				System.out.println("Grade is A");
			else if (m>=45 && m<60)
				System.out.println("Grade is B");
			else if (m<45)
				System.out.println("Grade is c");
		}
				
		}
}
