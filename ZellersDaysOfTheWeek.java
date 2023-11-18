import java.util.Scanner;
public class ZellersDaysOfTheWeek{
public static void main(String [] args){

Scanner input = new Scanner(System.in);
System.out.print("Enter Days of the Month eg 1 -31: ");
int day = input.nextInt();

System.out.print("Enter  Month of the year eg 1 -12: ");
int month = input.nextInt();

System.out.print("Enter year eg 2015: ");
int year = input.nextInt();


int q = day;
int j = year/100;
int m = month;
int k = year% 100;
int g = 26 * (m + 1)/10;


int w = (q + g + k + k/4 + j/4 + 5*j);

int h = w % 7;


if (h==0) System.out.println("The days of the week is Saturday");
if (h==1) System.out.println("The days of the week is Sunday");
if (h==2) System.out.println("The days of the week is Monday");
if (h==3) System.out.println("The days of the week is Tuesday");
if (h==4) System.out.println("The days of the week is Wednesday");
if (h==5) System.out.println("The days of the week is Thursday");
if (h==6) System.out.println("The days of the week is Friday");

	}
}