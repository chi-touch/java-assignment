import java.util.Scanner;
public class SeparatingDigitInteger{

	public static void main(String[]args){
	Scanner userinput = new Scanner(System.in);

	System.out.print("Enter integers");
	int numbers = userinput.nextInt();

	int digit1  = numbers  % 10;
        int remainder1 = numbers / 10;
        
        int digit2 = remainder1% 10;
	int remainder2 = remainder1 /10;

	int digit3 = remainder2 % 10;
	int remainder3 = remainder2 /10;

	int digit4 = remainder3 % 10;
	int remainder4 = remainder3 / 10;


	System.out.printf("%d %d %d %d", digit4,  digit3,  digit2,  digit1); 


}
}