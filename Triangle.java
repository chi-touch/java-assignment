import java.util.Scanner;
public class Triangle{

	public static void main(String[]args){
	Scanner userinput = new Scanner(System.in);

	System.out.print("Enter first edge of a triangle :");
	double edge1 = userinput.nextDouble();
	

	System.out.print("Enter second edge of a triangle :");
	double edge2 = userinput.nextDouble();

	
	System.out.print("Enter third edge of a triangle : ");
	double edge3 = userinput.nextDouble();
	


	boolean valid = (edge1 + edge2 > edge3)||
		(edge2 + edge3 > edge1)||
		(edge3 + edge1 > edge2);


if(!valid)
{
	System.out.println("input is invalid");


}

}

}