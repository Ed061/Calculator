import java.util.Scanner;

public class temperature {
	public static void main(String[] args) {
        System.out.println("This Program will allow the user to calculate temperature.");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a 1 to convert Fahrenheit to Celsius.");
        System.out.println("Please enter a 2 to convert Celsius to Fahrenheit.");
        String option = input.next();
        if (option.equals("1")){
            System.out.println("Please enter a temperature in degrees Fahrenheit.");
            cel();
        }else if (option.equals("2")){
            System.out.println("Please enter a temperature in degrees Celsius.");
            fah();
        }else{
            System.out.println("ERROR!");
        }
    }
    public static void cel() {
        Scanner input = new Scanner(System.in);
        int celsius = input.nextInt();
        System.out.println(((celsius * 1.8) + 32) + " Fahrenheit");
    }

    public static void fah() {
        Scanner input = new Scanner(System.in);
        int Fahrenheit = input.nextInt();
        System.out.println(((Fahrenheit - 32) * (5 / 9)) + " Celsius");
    }
}
///sdsads/a/d/asd/