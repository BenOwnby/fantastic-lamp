import java.util.NoSuchElementException;
import java.util.Scanner;

public class Demo {

	public static int getUserInput(String message, Scanner user){
		int input;
		while(true){
			System.out.println(message);
			try{
				input = user.nextInt();
				if (input == 2){
					System.out.println("you wake up");
					System.exit(0);
				}
				if (input == 0 || input == 1)
					return input;
				System.out.print("YOU MUST INPUT 0, 1, OR 2:");
			}
			catch(NoSuchElementException e){
				System.out.print("INVALID, INPUT MUST BE A NUMBER: ");
			}
			user.nextLine();
		}
	}

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		int choiceInteract;
		int choiceItem;

		Item items[] = new Item[2];
		items[0] = new Lamp();
		items[1] = new TeaCup();

		System.out.println("Enter 2 to exit at any time.");
		while(true){
			choiceInteract = getUserInput("Enter 0 for examine and 1 for interact", user);
			choiceItem = getUserInput("Enter 0 for lamp and 1 for tea cup", user);

			if (choiceInteract == 0){
				items[choiceItem].examine();
			}
			else {
				items[choiceItem].interact();
			}
		}
	}
}
