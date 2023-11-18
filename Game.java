import java.util.Scanner;
public class Game{

	public static void main(String[]args){
	Scanner userInput = new Scanner(System.in);
	Scanner userInput1 = new Scanner(System.in);


	System.out.print("Player1 enter your name : ");
	String name1  = userInput.nextLine();

	System.out.print("Player2 enter your name : ");
	String name2  = userInput.nextLine();
	
	int stop = 0;

	while(stop!=-19){
	System.out.printf("player1: %s %s",name1, "Play your game:  " );
	int number1 = userInput1.nextInt();

	System.out.printf("player2: %s %s",name2, "Play your game:  " );
	int number2 = userInput1.nextInt();


	int scissor = 0;
	int rock = 1;
	int paper = 2;


if(number1 <0 || number1 >2) System.out.println(name1 + " You entered a wrong input try again");

if(number2 <0 || number2 >2) System.out.println(name2 + " You entered a wrong input try again");

	if(number1 == scissor && number2 == paper)	System.out.println(name1 + " : you are the winner");

	if(number2 == rock && number1 == scissor)	System.out.println(name2 + " : you are the winner");

	if(number1 == paper && number2 == rock)	System.out.println(name1 + " : winner");

	if(number1 == rock && number2 == paper)	System.out.println(name1 + " : winner");

	if(number1 == rock && number2 == scissor)	System.out.println(name2 + " : winner");

	if(number1 == paper && number2 == paper)	System.out.println(name1 + " and " + name2 + " : draw");

	if(number1 == rock && number2 == rock)	System.out.println(name1 + " and " + name2 + " : draw");

	if(number1 == scissor && number2 == scissor)	System.out.println(name1 + " and " + name2 + " : draw");
	
	System.out.print("press -19 to stop or any number to continue: ");
	 stop = userInput.nextInt();
	}


    }

}