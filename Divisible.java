import java.util.Scanner;
public class Divisible{

	public static void main(String[]args){
	Scanner userinput = new Scanner(System.in);

	System.out.print("Enter any number : ");
	int digit = userinput.nextInt();


	if(digit % 3 == 0) {
	System.out.print("the digit is divisible");
}else{ 
	System.out.print(" the digit is indivisible");
}



}




}