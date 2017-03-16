import java.util.Scanner;

public class GameOne {
	public static void main(String [] args){
		Scanner stdin = new Scanner(System.in);
		boolean run = true;
		while(run){
		
		double rock = 1;
		double paper = 2;
		double scissors = 3;
		
		System.out.println("\n please enter rock (1), paper (2), or scissors(3): ");
		
		double playerIn = stdin.nextDouble();
		
		if (playerIn == 1){
		System.out.println("you have chosen rock");}
		
		if (playerIn == 2){
			System.out.println("you have chosen paper");}
		
		if (playerIn == 3){
			System.out.println("you have chosen scissors");}
	
		int randomNum = 1 + (int)(Math.random() * 3);
		
		//computer has chosen rock
		if (randomNum == 1){ 
			//if player chose rock
			if (playerIn == rock){ 
				System.out.println("The computer chose rock, you have tied!");
			}
			//player chose scissors
			if (playerIn == scissors){
				System.out.println("The computer chose rock, you lose!");
			}
			//player chose paper
			if (playerIn == paper){
				System.out.println("The computer chose rock, you win!");}
		
		}
		//computer chose paper
		if (randomNum == 2){
			//player chose rock
			if (playerIn == rock){ 
				System.out.println("The computer chose paper, you lose!");
			}
			//player chose scissors
			if (playerIn == scissors){
				System.out.println("The computer chose paper, you win!");
			}
			//player chose paper
			if (playerIn == paper){
				System.out.println("The computer chose paper, you have tied!");}
		}
		//computer chose scissors
		if (randomNum == 3){
			//player chose rock
			if (playerIn == rock){ 
				System.out.println("The computer chose scissors, you win!");
			}
			//player chose scissors
			if (playerIn == scissors){
				System.out.println("The computer chose scissors, you have tied!");
			}
			//player chose paper
			if (playerIn == paper){
				System.out.println("The computer chose scissors, you lose!");}
				
		}
		}
		stdin.close();
	}
}
