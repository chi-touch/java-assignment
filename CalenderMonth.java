import java.util.Scanner;
public class CalenderMonth{

	public static void main(String[]args){
	Scanner userinput = new Scanner(System.in);
	System.out.print("Enter number between 1 and 12 : ");
	int month = userinput.nextInt();


	if (month == 1)System.out.print("January");
	if (month == 2)System.out.print("February");
	if (month == 3)System.out.print("March");
	if (month == 4)System.out.print("April");
	if (month == 5)System.out.print("May");
	if (month == 6)System.out.print("June");
	if (month == 7)System.out.print("July");
	if (month == 8)System.out.print("August");
	if (month == 9)System.out.print("September");
	if (month == 10)System.out.print("October");
	if (month == 11)System.out.print("November");
	if (month == 12)System.out.print("December");
	
	
	


}

}