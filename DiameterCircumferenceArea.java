import java.util.Scanner;
public class DiameterCircumferenceArea{

	public static void main(String[]args){
	Scanner input = new Scanner(System.in);


	
	System.out.print("Enter the radius : ");
	int radius = input.nextInt();

	
	int diameter = 2 * radius;
	double circumference = (double)(2 * 3.14159 * radius);
	double area = (double)(3.14159 * (radius * radius));

 
	System.out.printf("%s %d %n ","The diameter is:  ",  diameter);
	System.out.printf("%s %.2f  %n ", "The circumference is  : ", circumference);
	System.out.printf("%s %.2f %n ","The area is : ", area);


}


}