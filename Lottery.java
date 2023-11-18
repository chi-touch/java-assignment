import java.util.Scanner;
public class Lottery{

	public static void main(String[]args){
	Scanner userinput = new Scanner(System.in);
	
	int firstWinningDigit = 4;
	int secondWinningDigit = 1;
	int thirdWinningDigit = 9;

	System.out.print("Enter the first digit : ");
	int firstUserDigit = userinput.nextInt();

	System.out.print("Enter the second digit : ");
	int secondUserDigit = userinput.nextInt();

	System.out.print("Enter the third digit : ");
	int thirdUserDigit = userinput.nextInt();

	
	
	if( firstUserDigit == firstWinningDigit && secondUserDigit == secondWinningDigit && thirdUserDigit  == thirdWinningDigit)  
System.out.printf("$ congratulations you won , 10,000");	

   if(firstUserDigit == secondWinningDigit ||secondUserDigit == thirdWinningDigit || thirdUserDigit == firstWinningDigit)
		System.out.printf("$ congratulations you won , 3,000");

		
	else System.out.printf("$ congratulations you won , 1,000");

	



}


}