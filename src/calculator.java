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
	
	public static String tohex(int num1) {
		int rem;
		char hexchars[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String conv = "";
		while(num1 != 0) {
			rem = num1 % 16;
			conv = hexchars[rem] + conv;
			num1 = num1/16;
		}
		return conv;
	}
	
	public static void main (String[]args) {
		String con = "Y";
		Scanner scan = new Scanner(System.in);
		do {
		 System.out.println("Select one of the following:"); 
		 System.out.println("[1] Power");
		 System.out.println("[2] Modulo");
		 System.out.println("[3] Square root");
		 System.out.println("[4] Cube root");
		 System.out.println("[5] Convert number to hex");
		 
		 double num1 = 0, num2 = 0;
		 //int choice = 0;
		
		 String choice = scan.nextLine();
		 
		 switch(choice) {
		 	case "1":
		 		System.out.println("Enter your numbers");
		 		num1 = scan.nextInt();
		 		num2 = scan.nextInt();
		 		System.out.println(power(num1, num2));
		 		break;
		 	case "2":
		 		System.out.println("Enter your numbers");
		 		num1 = scan.nextInt();
		 		num2 = scan.nextInt();
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
		scan.close();
	}
}
//comment