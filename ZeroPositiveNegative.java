import java.util.Scanner;
public class ZeroPositiveNegative{

	public static void main(String[]args){
	Scanner userInput = new Scanner(System.in);

	int zero = 0;
	int positive=0; 
	int negative=0;
	int counter=0; 
	int count =0;
	
	while (counter !=-100){

 	System.out.print("enter number"+ (count + 1) + ": ");
	int number =userInput.nextInt();
	   if(number > 0){
		positive +=1;
	}else if(number < 0){
		negative +=1;
	}else if(number == 0){
		zero +=1;
	}

 System.out.print("Enter -100 to stop or 2 to continue");
	counter = userInput.nextInt();

	 count ++;

}
	System.out.println("zero is:" + zero);
	System.out.println("negative is:"+ negative);
	System.out.println("positive is:"+ positive);



}




}