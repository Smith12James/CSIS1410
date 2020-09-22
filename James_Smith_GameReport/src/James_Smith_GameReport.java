/**
 * 
 * @author James Smith
 * @version 1.1
 * 
 * This program is designed to list a file of gamers
 * and their high score to the console prompt
 * for user input and use the optional input to add info to the file
 * 
 */

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

public class James_Smith_GameReport {

	public static void main(String[] args) throws IOException {
		
		File gameReport = new File ("src/GameScores.csv");
		
		if (gameReport.exists()) {
			
			scoreList(gameReport);
			
			/**
			 * The scoreList method is used to print the report of the games
			 */
			
			addGamer(gameReport);
			scoreList(gameReport);
				
		}
		
		
	}
	
	private static void scoreList(File fileName) throws IOException {
		
		BufferedReader br = null;
		String border = "-----------------------------------------------------------------------------------------------";
		String line = "";
		String splitBy = ",";
		String scoreName = "";
		String[] gamer = line.split(splitBy);
		int recordCount = 0;
		int total = 0;
		int highScore = 0;
				
		ArrayList<Integer> totalArr = new ArrayList<Integer>();
		ArrayList<String> gamerArr = new ArrayList<String>();
		br = new BufferedReader(new FileReader(fileName));
		
		System.out.println(border);
		System.out.println("Customer List");
		System.out.println(border);
		System.out.println("Name\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\total");
		System.out.println(border);
		
		while ((line = br.readLine()) != null) {
			
			gamer = line.split(splitBy);
			
			
			
			for (int i = 1; i < gamer.length; i++) {
			
				/**
				 * this loop is used to create the total variable
				 * the total variable is then reset at the end of the for loop
				 * I used the for loop here to count up to the length of gamer array
				 */
				
				int num = 0;
				num = Integer.parseInt(gamer[i]);
				total = num + total;
				totalArr.add(total);
				
			}
			
			for (int i = 0; i < totalArr.size(); i++) {
				
				/**
				 * I used this loop to basically do the same thing as the above
				 * for loop, to count up to the length of the totalArr array list
				 */
				
				if (highScore <= totalArr.get(i)) {
					
					highScore = totalArr.get(i);
					i++;
					
				}
				
			}
			
			gamerArr.add(gamer[0]);
			
			System.out.println(
					gamer[0] + "\t" + gamer[1]+ "\t" + gamer[2]+ "\t" + gamer[3]+ "\t" + gamer[4]+ "\t" + gamer[5]+ "\t" + gamer[6]+ "\t" + gamer[7]+ "\t" + gamer[8]+ "\t" + gamer[9]+ "\t" + gamer[10]+ "\t" + total
			);
			
			if(highScore == total) {
				
				scoreName = gamer[0];
				
			}
			
			recordCount++;
			total = 0;
			
		}
		
		System.out.println(border);
		System.out.printf("# of Gamers: %d\n", recordCount);
		System.out.printf("Top Gamer: %s %d\n", scoreName, highScore);
		
		br.close();
	}
	
	private static void addGamer(File fileName) throws IOException {
		
		/**
		 * the assignment calls to passing parameters however the assignment 
		 * asks us to keep the main method as simple as possible. To do so I
		 * used this method to take input from the user to allow the program
		 * to keep the main method as minimal as possible.
		 */
		
		System.out.print("Enter Player name and scores on games 1-10: \n");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		int score1 = input.nextInt();
		int score2 = input.nextInt();
		int score3 = input.nextInt();
		int score4 = input.nextInt();
		int score5 = input.nextInt();
		int score6 = input.nextInt();
		int score7 = input.nextInt();
		int score8 = input.nextInt();
		int score9 = input.nextInt();
		int score10 = input.nextInt();
		
		FileWriter csvWriter = new FileWriter(fileName, true);
		csvWriter.write(name + "," + score1 + "," + score2 + "," + score3 + "," + score4 + "," + score5 + "," + score6 + "," + score7 + "," + score8 + "," + score9 + "," + score10 + "\n");
		csvWriter.close();
		input.close();
	}

}
