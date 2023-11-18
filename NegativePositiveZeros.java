import java.util.Scanner;
public class NegativePositiveZeros{
	
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter number 1: ");
	int user1 = input.nextInt();

	System.out.print("Enter number 2: ");
	int user2 = input.nextInt();

	System.out.print("Enter number 3: ");
	int user3 = input.nextInt();

	System.out.print("Enter number 4: ");
	int user4 = input.nextInt();

	System.out.print("Enter number 5: ");
	int user5 = input.nextInt();
	
	int positive = 0;
	int negative = 0;
	int zeros = 0;
	if(user1 > 0) positive +=1;
	if(user1 < 0 ) negative +=1;
	if(user1 == 0) zeros +=1;


	if(user2 > 0) positive +=1;
	if(user2 <0 ) negative +=1;
	if(user2==0) zeros +=1;

	if(user3 > 0) positive +=1;
	if(user3 <0 ) negative +=1;
	if(user3==0) zeros +=1;

	if(user4 > 0) positive +=1;
	if(user4 <0 ) negative +=1;
	if(user4==0) zeros +=1;

	if(user5 > 0) positive +=1;
	if(user5 <0 ) negative +=1;
	if(user5==0) zeros +=1;


	System.out.printf("%s %d %n", "the sum of positive is: ",positive);

	System.out.printf("%s %d %n", "the sum of negative is: ",negative);

	System.out.printf("%s %d %n", "the sum of zeros is: ",zeros);


}





}