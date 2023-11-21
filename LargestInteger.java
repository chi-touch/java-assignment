import java.util.Scanner;
public class LargestInteger{

	public static void main(String[]args){
	Scanner input =new Scanner(System.in);

	System.out.print("Enter first the number : ");
	int num1 = input.nextInt();

	System.out.print("Enter second the number :");
	int num2 = input.nextInt();

	System.out.print("Enter third the number : ");
	int num3 = input.nextInt();


	System.out.print("Enter fourth the number : ");
	int num4 = input.nextInt();


	System.out.print("Enter fifth the number : ");
	int num5 = input.nextInt();



	if (num1 > num2 && num1 > num3  && num1 > num4 && num1 > num5 ) System.out.printf("%d %s %n",num1, " num1 is highest");

	if (num1 < num2 && num1 < num3  && num1 < num4 && num1 < num5 ) System.out.printf("%d %s %n",num1, " num1 is smallest");

	if (num2 > num1 && num2 > num3  && num2 > num4 && num2 > num5 ) System.out.printf("%d %s %n",num2, " num2 is highest");

	if (num2 < num1 && num2 < num3  && num2 < num4 && num2 < num5 ) System.out.printf("%d %s %n",num2, " num2 is smallest");

	if (num3 > num1 && num3 > num2  && num3 > num4 && num3 > num5 ) System.out.printf("%d %s %n",num3, " num3 is highest");

	if (num3 < num1 && num3 < num2  && num3 < num4 && num3 < num5 ) System.out.printf("%d %s %n",num3, " num3 is smallest");

	if (num4 > num1 && num4 > num2  && num4 > num3 && num4 > num5 ) System.out.printf("%d %s %n",num4, " num4 is highest");

	if (num4 < num1 && num4 < num2  && num4 < num3 && num4 < num5 ) System.out.printf("%d %s %n",num4, " num4 is smallest");

	if (num5 > num1 && num5 > num2  && num5 > num3 && num5 > num4 ) System.out.printf("%d %s %n",num5, " num5 is highest");

	if (num5 < num1 && num5 < num2  && num5 < num3 && num5 < num4 ) System.out.printf("%d %s %n",num5, " num5 is smallest");




}




}