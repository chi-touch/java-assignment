import java.util.Scanner;
public class HeadTail{

	public static void main(String[] args){
	Scanner userinput = new Scanner(System.in);

	System.out.print("Enter 0 for head : "); 
	int flip1 = userinput.nextInt(); 
	
	
	System.out.print("Enter 1 for tail : "); 
	int flip0 = userinput.nextInt(); 



	int head = 0;
	int tail = 1;

	if(flip1 == 0)System.out.print("head is correct");
	if(flip0 == 1)System.out.print("tail is correct");
	if(flip0 == 2)System.out.print("tail is incorrect");

}




}