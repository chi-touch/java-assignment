import java.util.Scanner;
public class Nokia2{


Scanner input = new Scanner(System.in);

	public void mainMenu(){
System.out.print("""
	1.PhoneBook
	2.Messages
	3.Chat
	4.CallRegister
	5.Tones
	6.Settings
	7.CallDivert
	8.Games
	9.Calculator
	10.Reminders
	11.Clock
	12.Profiles
	13.SIMservices	
	""");
	int response = input.nextInt();
	if(response == 1){
	phoneBook();
	}
	
	if(response == 2){
	message();
}

	}


	public void phoneBook(){
System.out.print("""
	1.Search
	2.ServiceNos.
	3.Add name
	4.Erase
	5.Edit
	6.Assign tone
	7.Send b'card
	8.Option
	9.Speed dials
	10.voice Tag

Enter 8 for option <<<<====== 
enter 11 to go to the main menu
		""");
	int response = input.nextInt();
	if(response == 8){
	Option();

	}
	if(response == 11){
	mainMenu();
	}
}

	public void Option(){
System.out.print("""

	1.TypeOfView
	2.MemoryStatus
	
enter 10 to go to the main menu
		""");
	int response = input.nextInt();
	if(response == 10){
	
mainMenu();
}
}


	public void message(){
System.out.print("""
	1.Write messages
	2.inbox
	3.Outbox
	4.Picture messages
	5.Templates
	6.Smileys
	7.Messages settings
	8.info nservice
	9.voice mailbox number
	10.Service command editor
	11. main Menu  <<<===
	""");
	int response = input.nextInt();
	if(response==7){

	MessageSettings();

}
	if(response ==11){

mainMenu();

}

	


}

	public void MessageSettings(){
System.out.print("""
	1.set
	2.common
	3.Main Menu <====
""");
	int response = input.nextInt();
	if (response ==1){
	set();
	}
	
	if(response == 2){
	common();
	}

	if(response ==3){
	mainMenu();
	}	
	}


	public void set(){
System.out.print("""
	1.Message center number
	2.Message sent as
	3.Messages validity
	4.Main Menu <====
""");

	int response = input.nextInt();
	if(response ==4){
	mainMenu();

}
	}

	public void common(){
System.out.print("""
	1.Delivery report
	2.Reply via same centre
	3.Character support
	4.main Menu <====
""");
	int response = input.nextInt();
	if(response ==4){
	mainMenu();

}

}




	
}


