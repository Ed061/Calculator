import java.util.Scanner;

public class calculator {
	//Power, modulo, and square/cube roots 
	public static double power(double num1, double num2) {
		// alternative method but int
		double ans = 1;
		while(num2 != 0){
			ans *= num1;
			--num2;
		}
		return ans;
		
	//	return Math.pow(num1, num2);
		
	}
	public static double modulus(double num1, double num2) {
	
		return num1 % num2;
			
	}
	public static double sqroot(double num1) {
		
		return Math.sqrt(num1);
	}
	
	public static double cbroot(double num1) {
		
		return Math.cbrt(num1);
	}
//Divy -----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public static double celsius(double num1) {
		return ((num1*1.8)+32);
	}
	public static double fahrenhiet(double num1) {
		return ((num1 -32 ) * 5/9);
	}
//Divy -----------------------------------------------------------------------------------------------------------------------------------------------------------------------

	public static String tohex(int num) {
		int rem = 0;
		char hexchars[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String conv = "";
		while(num != 0) {
			rem = num % 16;
			conv = hexchars[rem] + conv;
			num = num/16;
		}
		return conv;
	}
	
//Aadil -----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	public static double add(double num1, double num2) {
		double ans;
		ans=num1+num2;
		return ans;
		
	}
	
	public static double sub(double num1, double num2) {
		double ans;
		ans=num1-num2;
		return ans;
		
	}
	
	public static double multi(double num1, double num2) {
		double ans;
		ans=num1*num2;
		return ans;
		
	}
	
	public static double div(double num1, double num2) {
		double ans;
		ans=num1/num2;
		return ans;
	}
	
//Aadil -----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	public static void main (String[]args) {	
		String con = "Y";
		Scanner scan = new Scanner(System.in);//opening the scanner
		do {
		//list the following operations
		 System.out.println("Select one of the following:"); 
		 System.out.println("[1] Power");
		 System.out.println("[2] Modulo");
		 System.out.println("[3] Square root");
		 System.out.println("[4] Cube root");
		 System.out.println("[5] Convert number to hex");
		 System.out.println("[6] Convert Celsius into Fahrenheit");
		 System.out.println("[7] Convert Fahrenheit into Celsius");
		 System.out.println("[8] Addition");
		 System.out.println("[9] Subtraction");
		 System.out.println("[10] Multiplication");
		 System.out.println("[11] Division");
		 double num1 = 0, num2 = 0;
		 //int choice = 0;
		
		 String choice = scan.nextLine();
		 //doing the selected operations
		 switch(choice) {
		 	case "1":
		 		System.out.println("Enter your numbers");
		 		num1 = scan.nextDouble();
		 		num2 = scan.nextDouble();
		 		System.out.println(power(num1, num2));
		 		break;
		 	case "2":
		 		System.out.println("Enter your numbers");
		 		num1 = scan.nextDouble();
		 		num2 = scan.nextDouble();
		 		System.out.println(modulus(num1, num2));
		 		break;
		 	case "3":
		 		System.out.println("Enter your number");
		 		num1 = scan.nextInt();
		 		System.out.println(sqroot(num1));
		 		break;
		 	case "4":
		 		System.out.println("Enter your number");
		 		num1 = scan.nextInt();
		 		System.out.println(cbroot(num1));
		 		break;
		 	case "5":
		 		System.out.println("Enter your number");
		 		int hexnr;
		 		hexnr = scan.nextInt();
		 		System.out.println(tohex(hexnr));
		 		break;
//Divy -----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		 	case "6":
		 		System.out.println("Enter your number");
		 		num1 = scan.nextDouble();
		 		System.out.println(celsius(num1));
		 		break;
		 	case "7":
		 		System.out.println("Enter your number");
		 		num1 = scan.nextDouble();
		 		System.out.println(fahrenhiet(num1));
		 		break;
		 	

//Divy -----------------------------------------------------------------------------------------------------------------------------------------------------------------------


//Aadil -----------------------------------------------------------------------------------------------------------------------------------------------------------------------		 		
		 	case "8":
		 		System.out.println("Enter your numbers");
		 		num1 = scan.nextDouble();
		 		num2 = scan.nextDouble();
		 		System.out.println(add(num1, num2));
		 		break;
		 	case "9":
		 		System.out.println("Enter your numbers");
		 		num1 = scan.nextDouble();
		 		num2 = scan.nextDouble();
		 		System.out.println(sub(num1, num2));
		 		break;
		 	case "10":
		 		System.out.println("Enter your numbers");
		 		num1 = scan.nextDouble();
		 		num2 = scan.nextDouble();
		 		System.out.println(multi(num1, num2));
		 		break;
		 	case "11":
		 		System.out.println("Enter your numbers");
		 		num1 = scan.nextDouble();
		 		num2 = scan.nextDouble();
		 		System.out.println(div(num1, num2));
		 		break;
		 
//Aadil -----------------------------------------------------------------------------------------------------------------------------------------------------------------------
		 	

		 	
		 	default:
				System.out.println("unknown choise");
		 }
		 	System.out.println("Do you want to continue?");
		 	//con = scan.nextLine();
		 	while ((con = scan.nextLine()).isEmpty()) {
		 	}
		 	con = con.toUpperCase();//converting to upper case letter
		} 
		while (con.equals("Y"));
	
		//scan.close();
	}		
}
//Divy -----------------------------------------------------------------------------------------------------------------------------------------------------------------------
//		Scanner ob1 = new Scanner(System.in);
//			temperature tempObject = new temperature ();
//			
//			System.out.println("Please enter a 1 to convert Fahrenheit to Celsius or Please enter a 2 to convert Celsius to Fahrenheit");
//			String option = ob1.next();
//		  if (option.equals("1")){
//		      System.out.println("Please enter a temperature in degrees Fahrenheit.");
//		      tempObject.cel();
//		  }else if (option.equals("2")){
//		      System.out.println("Please enter a temperature in degrees Celsius.");
//		      tempObject.fah();
//		  }else{
//		      System.out.println("ERROR!");
//		  }
//Divy -----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	
