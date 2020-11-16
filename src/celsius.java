import java.util.Scanner;

public class celsius {
	static void lol() {
		
		
		Scanner Ob0 = new Scanner(System.in);
		System.out.println("Enter 1 to convert Celsius into Fahrenheit or Enter 2 to Convert Fahrenhiet into Celsius");
		int z = Ob0.nextInt();
		
		
		if (z == 1){
			Scanner Ob1 = new Scanner(System.in);
			System.out.println("Please enter your temp in celsius");
			int num1 = Ob1.nextInt();
			double x = ((num1*1.8) + 32);
			System.out.println("The Temp in fahrenhiet is " + x);
		}
		
		else if (z == 2) {
			Scanner Ob2 = new Scanner(System.in);
			System.out.println("please your temp in fahrenheit");
			int num2 = Ob2.nextInt();
			double y = ((num2  - 32)*5/9);
			System.out.println("The Temp is Celsius " + y);	
		}
		
		else {
			System.out.println("ERROR ");
		       System.exit(1);
		}
	}
}
