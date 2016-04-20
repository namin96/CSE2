/*
Neal Amin
HW 12
04/15/2016
This program will first ask user to enter 15 integers between 0 and 100 only. Then these integers
will be sorted in an array and then the user will be ask to search for a grade which will be done using 
binary search and linear search. Linear search will use the scrambled array whereas binary search will use
the sorted array. The number of iterations will be printed in addition to if the grade 
is found. 
*/

import java.util.Scanner;
import java.util.Random;
public class CSE2Linear{
    public static void main(String[] args){
        
        
        //declare array size to be 15 integers
        int [] finalGrades = new int[15];
        System.out.println("Enter 15 ints for final grades in CSE2: ");
        Scanner input = new Scanner(System.in);
        
        
        //ask user to enter integers upto the length of the array
        for (int i = 0; i < finalGrades.length; i++){
            //check input is an integer
            while(!input.hasNextInt()){     //only enter integers
                System.out.print("Please enter integers only: ");
                input.next();
                }
               
                finalGrades[i] = input.nextInt();
                if(finalGrades[i] > 100 || finalGrades[i] < 0){     //check if integers fall between 0 and 100
                System.out.print("Please enter integers between 0 and 100 only: ");
                finalGrades[i] = input.nextInt();
            }
                //finalGrades[i] = input.nextInt();
            }
       
       
       //sort the array 
       CSE2Linear.selectionSort(finalGrades);  
       
       System.out.println("Sorted: ");
       //print sorted array with for loop
       for (int i = 0; i < finalGrades.length; i++){
           System.out.print(finalGrades[i] + " ");
       }
       
       //prompt user to search for a grade
       System.out.println("");
       System.out.println("Enter a grade to search for: ");
       input = new Scanner(System.in);
       int searchGrade = input.nextInt();
       
       //call binary search method
       binarySearch(finalGrades, searchGrade);
       
       
       //call randomScramble
       randomScramble(finalGrades);
       
       //print scrambled array
       System.out.println("Scrambled: ");
       for (int i = 0; i < finalGrades.length; i++){
           System.out.print(finalGrades[i] + " ");
           
       }
       System.out.println(" ");
       //call linear search method
       System.out.println("Enter a grade to search for: ");
       input = new Scanner(System.in);
       int searchGrade2 = input.nextInt();
       linearSearch(finalGrades, searchGrade2);
       
    
    }
    public static void selectionSort(int [] list){
        for (int i = 0; i < list.length - 1; i++){
            //sorting the array
            int minVal = list[i];
            int minValIndex = i;
            
        for (int j = i + 1; j < list.length; j++){  //swap the elements within the array
            if(minVal > list[j]){
                minVal = list[j];
                minValIndex = j;
            }
        }
        
        if (minValIndex != i){          
            list[minValIndex] = list[i];
            list[i] = minVal;
        }
        }
    }
    public static void binarySearch(int [] list, int key){
        int low = 0;
        int high = list.length - 1;
        int count = 0;
        while(high >= low){
            
            int mid = (low + high) / 2;
            if(key < list[mid]){    //if user search is less than the mid value of array
                high = mid - 1;     //reset high value
                count++;            //increment count
            }
            else if(key == list[mid]){      //if user search equals element within array
                System.out.println(key + " was found in the list with " + count + " iterations.");
                break;                  //end of search and break
            }       
            else{                   
                low = mid + 1;      
                count++;
            }
            if(high < low){         //if user search is not found
                System.out.println(key + " was not found in the list with " + count + " iterations.");
                break;
            }
        }
    }
    
    public static void randomScramble(int [] list){
        //scramble the array
        //swap array elements
        for(int i = 0; i < list.length; i++){
            int j = (int)(Math.random() * list.length);
            int k = list[i];
            list[i] = list[j];
            list[j] = k;
        }
    }
    
    public static void linearSearch(int [] list, int key){
        
        int i = 0;
        for(i = 0; i < list.length; i++){
            if (key == list[i]){        //if user search matches the element in the array
            System.out.println(key + " was found in the list with " + i + " iterations.");
            break;
            }
            
        }
           if(i == list.length){        //if user search is not found
               System.out.println(key + " was not found in the list with " + i + " iterations.");
           } 
            
        
    }
    }
