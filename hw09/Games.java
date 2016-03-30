/*
Neal Amin
CSE 2 HW09
3/29/16
This program will run a method out of three choices, the user will be asked to input their game choice
Methods will be used to run the games.
*/

import java.util.Scanner;
import java.util.Random;
public class Games{
    public static void main(String[] args){
        System.out.println("Welcome to the game center! ");
        System.out.print("Choose from the following games: ");
        System.out.print("guessTheBox, spinTheWheel, and scrambler: ");
        
        String s1 = "guessTheBox";
        String s2 = "spinTheWheel";
        String s3 = "scrambler";
        Scanner input = new Scanner(System.in);
        String game = input.nextLine();
        
        if(game.equalsIgnoreCase(s1)){
            
        input = new Scanner(System.in);
        System.out.println("Please choose from box 1, 2, or 3 (enter a number) to see if you win: ");
        int num = input.nextInt();
        guessTheBox(num);
        }
        else if(game.equalsIgnoreCase(s2)){
        
        System.out.print("The wheel has 10 sections with 5 for Red and 5 for Black ");
        System.out.println(",each section has an integer from 1-5 on it.");
        input = new Scanner(System.in);
        System.out.println("Please enter a color either black or red: ");
        String color = input.nextLine();
        System.out.println("Please enter a number from 1-5: ");
        input = new Scanner(System.in);
        int num = input.nextInt();
        spinTheWheel(color, num);
        }
        
        else if(game.equalsIgnoreCase(s3)){
        
        System.out.print("Enter a word and it will be scrambled: ");
        input = new Scanner(System.in);
        String word = input.nextLine();
        scrambler(word);
        }
    }
    public static void guessTheBox(int num){
        int rand = (int)(Math.random()*3)+1;
        if(rand == num){
            System.out.print("Congratulations you have won $1 million!");
            
        }
        else
            System.out.println("Sorry no prize for you! ");
        }
    
    public static void spinTheWheel(String color, int num){
        String black = "black";
        String red = "red";
        int rand = (int)(Math.random()*2) + 1;
        
        if(rand == 1 && color.equalsIgnoreCase(black)){
            System.out.println("Congrats you picked the right color: " + black);
            
        }
        else if(!color.equalsIgnoreCase(black)){
            System.out.println("Sorry, the correct color: " + black);
        }
        else if(rand == 2 && color.equalsIgnoreCase(red)){
            System.out.println("Congrats you picked the right color: " + red);
        }
        else if(!color.equalsIgnoreCase(red)){
        System.out.println("Sorry, the correct color: " + red);
        }
        
        int rand2 = (int)(Math.random()*5)+1;
        if(rand2 == num){
            System.out.println("Congrats, you picked the right number: " + rand2);
            if(rand == 1 && color.equalsIgnoreCase(black) || rand == 2 && color.equalsIgnoreCase(red)){
                System.out.println("Congrats, you got a match");
            }
        }
        else
        System.out.println("Sorry, the correct number: " + rand2);
        System.out.println("Sorry, you don't have a match");
    }
    public static String scrambler(String word){
        
         
      int length = word.length(); 
      return word;
        }
    }
    
    

