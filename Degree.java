import java.util.Scanner;
public class Degree{

	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter Celsius: ");
	double celsius = input.nextDouble();
	
	double Fahrenheit = (9.0/5 ) * celsius + 32;

	System.out.print(Fahrenheit);
	

}



}