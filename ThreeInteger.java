import java.util.Scanner;
public class ThreeInteger{

	public static void main(String[]args){
	Scanner userinput = new Scanner(System.in);

	System.out.print("Enter first integer :");
	int num1 = userinput.nextInt();

	System.out.print("Enter second integer :");
	int num2 = userinput.nextInt();
	
	System.out.print("Enter third integer : ");
	int num3 = userinput.nextInt();

	
	int integ;
	if(num2 < num1 || num3 < num1) 
	{
	if(num2 < num1)
	{
	integ =num1;
	num1 = num2;
	num2 = integ;
	}
	if(num3 < num1)
	{
	integ = num1;
	num1 = num3;
	num3 =integ;
}
}
	if(num3 < num2)
	{
	integ = num2;
	num2 = num3;
	num3 =integ;
	}
	System.out.println(num1 + "" + num2 + "" + num3);

}


}