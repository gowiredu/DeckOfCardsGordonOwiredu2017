import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.io.IOException;


public class Main {

    static ArrayList<String> cardsArrayList = new ArrayList<>(Arrays.asList("Ace of Spades", "Spades 2", "Spades 3", "Spades 4", "Spades 5", "Spades 6","Spades 7", "Spades 8", "Spades 9", "Spades 10", "Spade Joker", "Spade Queen", "Spade King", 
    		"Ace of Clubs", "Clubs 2", "Clubs 3", "Clubs 4", "Clubs 5", "Clubs 6", "Clubs 7", "Clubs 8", "Clubs 9", "Clubs 10",  "Club Joker", "Clubs Queen", "Clubs King", 
    		"Ace of Hearts", "Hearts 2", "Hearts 3", "Hearts 4", "Hearts 5", "Hearts 6", "Hearts 7", "Hearts 8", "Hearts 9", "Hearts 10", "Heart Joker", "Heart Queen", "Heart King",
    		"Ace of Diamonds", "Diamonds 2", "Diamonds 3", "Diamonds 4", "Diamonds 5", "Diamonds 6", "Diamonds 7", "Diamonds 8", "Diamonds 9", "Diamonds 10", "Diamond Joker", "Diamond Queen", "Diamond King"));
    
	
    public static void main(String args[]) 
    {
    	
		Main main = new Main();
		main.requestUserInput();
		
    }
    
    public void shuffle()
    {
		Collections.shuffle(cardsArrayList);
		
        System.out.println("Cards shuffled");
        System.out.println("Number of cards left: " + cardsArrayList.size());
		System.out.println(cardsArrayList.toString());
		
		System.out.println("\n");
        requestUserInput();
    }
    
    public void dealOneCard()
    {
        String cardPicked = cardsArrayList.get(new Random().nextInt(cardsArrayList.size()));
        cardsArrayList.remove(cardPicked);
        
        System.out.println(cardPicked);
        System.out.println("Number of cards left: " + cardsArrayList.size());
        System.out.println("Cards: " + cardsArrayList);
                
		System.out.println("\n");
        requestUserInput();
        
    }
    
    public void requestUserInput()
    {
    	try {

		    System.out.println("Enter 1 to randomize cards");
		    System.out.println("Enter 2 to deal a card");
		    System.out.println("Enter 0 to quit");

		    
		    Scanner scanner = new Scanner(System.in);
		    int input = scanner.nextInt();
		    
		    if (input == 1)
		    {
		        Main main = new Main();
                main.shuffle();
	        }
	        
	        else if (input == 2)
		    {
	        	if (cardsArrayList.size() == 0)
	        	{
	        		System.out.println("No more cards left to deal.");
	        		quitProgram();
	        	}
	        	
	        	else
	        	{
	        		Main main = new Main();
	            	main.dealOneCard();
	        	}
		    }
		    
	        else if (input == 0)
	        {
	        	quitProgram();
	        }
		    
		    scanner.close();
		    
		} catch (Exception e) {
		    e.printStackTrace();
		}
    	
    }
    
    public void quitProgram()
    {
		System.out.println("Thank you for playing!");
    	System.exit(0);
    }
}