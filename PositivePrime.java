import java.util.Scanner;
public class PositivePrime{

	public static void main(String[]args){
	Scanner userinput = new Scanner(System.in);

	System.out.print("Enter any integer: ");
	int number = userinput.nextInt();

if (number%2==0 && number%2!=0)
	
      System.out.printf("number is a positive prime:", number);

else {  
      System.out.printf("number is not a positive prime:", number);
}



}


}