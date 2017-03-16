/**@Author: Jordan Matthews
 * @VersionDate: 11/7/16
 * 
 * @Purpose: To allow the user to play a game of black jack against the computer.
 * 
 * @Pseudocode:
 * 
 * 1. first we declare our variables to use in the main method
 * 
 * 2. we display the rules of black jack to the user and ask them if they want to play
 * 
 * 3. If they want to play we begin the loop and draw 2 cards for the play drawing them from the draw card method
 * 
 * 4. Then we check the cards to see if they are Ace's, we'll ask what they want the values to be later
 * 
 * 5. The user is then asked if they want to draw more cards, adding the totals and doing Ace checks on these new cards aswell
 * 
 * 6. After the user ends his draw cards loop with a "no" input, the dealer draws to cards, we check the dealers cards for Ace's aswell
 * 
 * 7. The dealer then checks if he has more than 17 with his cards, if he has and Ace and a card he makes sure they are less
 * than 21 and adjusts the values accordingly.
 * 
 * 8. If after adjusting the Ace Cards values, or having to regular cards, if he still has less than 17 he will begin to draw
 * more cards checking those for Ace's as well and adjusting his totals accordingly
 * 
 * 9. After the dealer has met the 17 minimum or busted, The checkWinner method will compare the 2 totals to see who wins, and who lost
 * by seeing if anyone busted and picking the higher of the 2 that didn't bust.
 * 
 * 10. After determining the winner if the player wins it will add to the players win count, then ask if they would like to play again
 * if they chose yes it starts the game over and resets the totals and values, if no it displays a goodbye message and 
 * terminates.
 */
import java.util.Scanner;

public class BlackJack {
	public static void main(String [] args){
		Scanner stdin = new Scanner(System.in);
		
	//declare variables
		int total = 0;
		int dealerTotal = 0;
		int aceCount = 0;
		int var1 = -1;
		int dealerAceCount = 0;
		int var2 = -1;
		int wins = 0;
		
		String gameStart;
		String drawAgain = null;
		String playAgain = null;
		
	//displays instructions on how to play
		System.out.println("Welcome to BlackJack!\n\n");
		displayInstructions();
		
	//ask to play
		System.out.println("\nWould you like to play? yes or no?");
		gameStart = stdin.next();
		
	//if they want to play
		if((!(gameStart.contains("yes"))) && (!(gameStart.contains("no")))){
		System.out.println("Invalid Choice");
		}
		if(gameStart.contains("no")){
			System.out.println("goodbye");
		}
		if(gameStart.contains("yes")){
		
		//play Again loop
			do {
			//set game totals to zero after each game
			    total = 0;
			    dealerTotal = 0;
			    aceCount = 0;
			    dealerAceCount = 0;
			    
			//drawing to cards for the player
				System.out.println("\nDraw 2 cards");
				
			//in both of these draws were going to check for aces and make a count that will allow the player change the numbers again later
				var1 = drawCard();
				if(var1 == 0){
					aceCount++;
				} 
				total += var1;
				var1 = -1;
				
				
				var1 = drawCard();
				if(var1 == 0){
					aceCount++;
				} 
				total += var1;
				var1 = -1;
				

				//dealers turn following the players draws
				System.out.println("\nThe Dealer draws his cards");
				
			//this dealer code will always make aces 11 and change them if the dealer is going to bust
		
			//since this is the first draw if its an ace well make it an 11
				var2 = dealerDraw();
				if(var2 == 0){
					if (dealerTotal < 11){
					var2 = 11;} else {
					var2 = 1;
					}
					dealerAceCount++; 
				} 
				dealerTotal += var2;
				var2 = -1;
				
			//same for this one if its an ace were gonna make it an 11
				var2 = dealerDraw();
				if(var2 == 0){
					if (dealerTotal < 11){
					var2 = 11;} else {
					var2 = 1;
					}
					dealerAceCount++;
				} 
				dealerTotal += var2;
				var2 = -1;
			    
			    
		  //begin draw again loop checks
				do{
					
			//asks if user would like to draw another card
				System.out.println("\nWould you like to draw another card?");
				drawAgain = stdin.next();
				
			//if yes draw another card and apply its value to total and display
				if (drawAgain.contains("yes")){
					var1 = drawCard();
					if(var1 == 0){
						aceCount++;
					} 
					total += var1;
					var1 = -1;

					if (total > 21){
						System.out.println("You busted\n");
						drawAgain = "no";
					}	
				} else if (!(drawAgain.contains("yes")) && !(drawAgain.contains("no"))) {
				System.out.println("Not a valid input");
				}
				
			//end draw again loop
				} while(drawAgain.contains("yes"));
				
				
			// if the user has any aces
				int aceChoice;
				
				if(aceCount > 0){
					System.out.println("\nYou have drawn " + aceCount + " ace(s)");
					
				for (int i = 0; i < aceCount; i++){
					
					System.out.println("Do you want your ace to be 1 or 11?");
				aceChoice = stdin.nextInt();
				
				if(aceChoice == 1){
					total += aceChoice;
					
				} else if (aceChoice == 11){
					total += aceChoice;
					
				} else {
					System.out.println("Invalid choice");
						}
					}
				}
			    
	
			//checks if the dealer has any aces and reassigns the values to stay under 21
				if(dealerAceCount > 0){
				
					for (int i = 0; i < dealerAceCount; i++){
						
					if(dealerTotal > 21){
						dealerTotal -= 11;
						dealerTotal += 1;
					}
				}
			} 
				
				
		    //dealers continuation parameters
				if(dealerTotal < 17){
			    while (dealerTotal < 17){
			    	
			    	System.out.println("Dealer draws to 17");
			    	var2 = dealerDraw();
					if(var2 == 0){
						dealerAceCount++;
					} 
					dealerTotal += var2;
					var2 = -1;
					 }
				}
			//if the dealer has an ace and his total is greater than 21 he will change the ace to a 1
				if(dealerTotal > 21 && dealerAceCount > 0){
					dealerTotal -= 11;
					dealerTotal += 1;
				}
			    
		
			//call winner method and determine winner
			    System.out.println("\nYour total was: " + total);
		    	System.out.println("The Dealers total was: " + dealerTotal);
		   System.out.println("\n" + determineWinner(total, dealerTotal));
		   if (determineWinner(total, dealerTotal).contains("Player")){
			   wins++;
		   }
		   
		   
		//prompt for play again choice
		   System.out.println("\nWould you like to play again? yes or no: ");
		   playAgain = stdin.next();
		   
	   //if they enter something other than yes or no
		   if(!(playAgain.contains("yes")) && (!(playAgain.contains("no")))){
			   do{
				   System.out.println("Inavlid choice");
				   playAgain = stdin.next();
				   if(playAgain.contains("yes") || playAgain.contains("no")){
					   break;
				   }
			   } while (!(playAgain.contains("yes")) && (!(playAgain.contains("no"))));
		   }
		   
		   
	   //starts the loop again if the value is yes
			} while (playAgain.contains("yes"));
		
			
		//display wins to user
			System.out.println("you have " + wins + " wins");
		//if no then say goodbye
			System.out.println("goodbye!");
		}
	stdin.close();
}//end of main method

//Draw card method	
public static int drawCard(){
	int cardValue = 0;
	int ranNum = (int) (Math.random()*(13 + 1 - 1) + 1);
	switch (ranNum){
	case 1:
		System.out.println("drew a 2");
	cardValue = 2;
	break;
	case 2:
		System.out.println("drew a 3");
	cardValue = 3;
	break;
	case 3:
		System.out.println("drew a 4");
	cardValue = 4;
	break;
	case 4:
		System.out.println("drew a 5");
	cardValue = 5;
	break;
	case 5:
		System.out.println("drew a 6");
	cardValue = 6;
	break;
	case 6:
		System.out.println("drew a 7");
	cardValue = 7;
	break;
	case 7:
		System.out.println("drew a 8");
	cardValue = 8;
	break;
	case 8:
		System.out.println("drew a 9");
	cardValue = 9;
	break;
	case 9:
		System.out.println("drew a 10");
	cardValue = 10;
	break;
	case 10:
		System.out.println("drew a Jack");
	cardValue = 10;
	break;
	case 11:
		System.out.println("drew a Queen");
	cardValue = 10;
	break;
	case 12:
		System.out.println("drew a King");
	cardValue = 10;
	break;
	case 13:
		System.out.println("drew a Ace");
	cardValue = 0;
	break;
			}
	return cardValue;
	}


//main instructions
public static void displayInstructions(){
	System.out.println("First, the dealer and player each start with two cards drawn. "
			+ "\nThe goal of the game is to get as close to 21 card points as possible."
			+ " \nHaving a card total of 21 points results in a win (unless the dealer also has a total of 21 points, in which case, it is a tie)."
			+ " \nIf anyone goes over 21 points, they automatically lose. "
			+ "\nIf both the dealer and player get over 21 card points, it is a tie. "
			+ "\nOtherwise, whoever is closest to 21 is deemed winner.");
}


//determines the winner of the game
public static String determineWinner(int total, int dealerTotal){
	String winner = "winner error";
	if(total > dealerTotal && total < 22){
		winner = "Player wins";
	} else if (total < dealerTotal && dealerTotal < 22){
		winner = "Dealer wins";
	} else if (total > 21 && dealerTotal > 21){
		winner = "tie";
	} else if (total == dealerTotal){
		winner = "tie";
	} else if (dealerTotal > 21 && total < 22){
		winner = "Player wins";
	} else if (total > 21 && dealerTotal < 22){
		winner = "Dealer wins";	
	}

	return winner;
	}

//dealer drawing method
public static int dealerDraw(){
	int total = 0;
	
	total += drawCard();
	
	return total;
	}
}