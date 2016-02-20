/*
Neal Amin
CSE 2 Lab04 Card Generator
02/18/16

This program will generate a random number between 1-52 including 1 and 52 and this number 
will represent a card number out of a deck of cards which is 52 cards. The program will assign 
suits based on each fourth of the deck of cards (every set of 13 cards corresponds to a suit).
Then card identities will be assigned with the help of a modulus operator to eventually print
the appropriate card suit and identity to the screen for the randomly generator card number.

*/


import java.util.Random;   //import class 

public class CardGenerator {
    public static void main(String[] args){

int cardNum = (int)(Math.random()*52)+1;        //random number generator between 1 and 52
        
        
        String suit = "";                       //card suit will be stored as a string
        String identity = "";                   //card identity will be stored as a string
        
        if (cardNum <= 13){                     //check to see if random number is less than or equal to 13
            suit = "Diamonds";                  //if true then the suit is Diamonds
        }
        else if (cardNum <= 26){                //check to see if card number is less than or equal to 26
            suit = "Clubs";                     //if true then suit is Clubs
        }
        else if (cardNum <= 39){                //check to see if card number is less than or equal to 39
            suit = "Hearts";                    //if true then suit is Hearts
        }
        else if (cardNum <= 52){                //check to see if card number is less than or equal to 52
            suit = "Spades";                    //if true then suit is Spades
        }
        
        switch (cardNum % 13){                  //switch statment being used with the card number being divided by 13 and the remainder determines the case
            case 0: identity = "Ace";           //which ever case is true the appropriate identity will be assigned
            break;                              //since there are 13 cards per suit that means 13 possible cases
            case 1: identity = "2";
            break;
            case 2: identity = "3";
            break;
            case 3: identity = "4";
            break;
            case 4: identity = "5";
            break;
            case 5: identity = "6";
            break;
            case 6: identity = "7";
            break;
            case 7: identity = "8";
            break;
            case 8: identity = "9";
            break;
            case 9: identity = "10";
            break;
            case 10: identity = "Jack";
            break;
            case 11: identity = "Queen";
            break;
            case 12: identity = "King";
            break;
            
        }
            //print the identity and suit of the card to the screen
            System.out.println("You picked the " + identity + " of " + suit);       
            
    }
}