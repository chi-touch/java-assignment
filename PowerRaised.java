import java.util.Scanner;

public class PowerRaised{

public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.print("enter first  number: ");
int blo1 = input.nextInt();

System.out.print("enter first  number: ");
int blo2 = input.nextInt();

int result = 1;

for (int b =1;b<=blo2;b++){
result = result *blo1;
}
System.out.println("the raised to power is: " + result);






}





}