import java.util.Scanner;
public class Addition{

	public static void main(String[]args){
	Scanner userinput = new Scanner(System.in);

	System.out.print("Enter first number : ");
	int number1 = userinput.nextInt();

	System.out.print("Enter second number : ");
	int number2 = userinput.nextInt();

	int sum = number1 + number2;
	System.out.println(sum);
	System.out.print(sum);
	System.out.printf("The sum is : %d ", sum);


	


}


}