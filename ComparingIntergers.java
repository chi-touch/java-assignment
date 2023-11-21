import java.util.Scanner;
public class ComparingIntergers{

	public static void main(String[]args){
	Scanner userinput = new Scanner(System.in);
	
	System.out.print("Enter the integer : ");
	int value = userinput.nextInt();

	int square = value * 2;

	if(value > 100 && square > 100){
	System.out.print(value + " and " + square +  " are greater than 100");
	}else if(value == 100 && square ==100 ){
	System.out.print(value + " and " + square +  " are equals to 100");
	}else if(value != 100 && square !=100 ){
	System.out.print(value + " and " + square +  " are not equals to 100");
        }else if(value < 100 && square < 100 ){
	System.out.print(value + " and " + square +  " are lesser than 100");
	
	  }
     }
}