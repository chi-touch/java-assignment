public class LargestAndSmallest{

	public static void main(String[]args){

	int num1 = 10;
	int num2 = 67;
	int num3 = 90;

	if (num1 > num2 && num1 > num3) System.out.printf("%d %s %n",num1, " is highest");
	
	if (num2 > num1 && num2 > num3) System.out.printf("%d %s %n",num2, " is highest");
	
	if (num3 > num1 && num3 > num2) System.out.printf("%d %s %n",num3, " is highest");
	
	if (num1 < num2 && num1 < num3) System.out.printf("%d %s %n",num1, " is lowest");
	
	if (num2 < num1 && num2 < num3) System.out.printf("%d %s %n",num2, " is lowest");

L3tM3!nNOw
	if (num3 < num1 && num3 < num2) System.out.printf("%d %s %n",num3, " is lowest");


}



}