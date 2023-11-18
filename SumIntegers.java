import java.util.Scanner;
public class SumIntegers{


	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer: ");
	int num1 = input.nextInt();
	
	System.out.print("Enter second integer: ");
	int num2 = input.nextInt();

	System.out.print("Enter thrid integer");
	int num3 = input.nextInt();

	int sum = num1 + num2 + num3;
	int product = num1 * num2 * num3;
	int average = sum / 3;
	int difference = (num1 - num2) - num3;


	if (num1 > num2 && num1 > num3) System.out.printf("%d %s %n",num1, " is highest");
	
	if (num2 > num1 && num2 > num3) System.out.printf("%d %s %n",num2, " is highest");
	
	if (num3 > num1 && num3 > num2) System.out.printf("%d %s %n",num3, " is highest");
	
	if (num1 < num2 && num1 < num3) System.out.printf("%d %s %n",num1, " is lowest");
	
	if (num2 < num1 && num2 < num3) System.out.printf("%d %s %n",num2, " is lowest");
	
	if (num3 < num1 && num3 < num2) System.out.printf("%d %s %n",num3, " is lowest");

}


}
