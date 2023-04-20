package ExceptionAssignment;
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		try {
			System.out.println("Enter X=");
			int x=s.nextInt();
			
			System.out.println("Enter Y=");
			int y=s.nextInt();
			
			System.out.println(x/y);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		s.close();
   
    }
}
      /*
Scanner s = new Scanner(System.in);

try {
	System.out.println("Enter x =");
    int x = s.nextInt();
    
    System.out.println("Enter y =");
    int y = s.nextInt(); 
    
    System.out.println(x / y);
} 

catch(ArithmeticException e) {
 
    System.out.println(e);
}
s.close();*/