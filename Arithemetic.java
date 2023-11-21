import java.util.Scanner;
public class Arithemetic{

	public static void main(String[] agrs){


	Scanner input= new Scanner(System.in);

	System.out.print("Enter the first Integer : " );
	int num1 = input.nextInt();

	System.out.print("Enter the second Integer : ");
	int num2= input.nextInt();

	int sum = num1 +num2;
	System.out.printf("sum is %d%n", sum);


int square1 =num1 * num1;
System.out.printf("square1 is %d%n", square1);

int square2 = num2 * num2;
System.out.printf("square2 is %d%n", square2);

int sumofsquares = square1 + square2;
System.out.printf("sumofsquares is ", sumofsquares);


int squaredifference = square1 - square2;
System.out.printf("squaredifference is %d%n", squaredifference);


}



}