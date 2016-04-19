/*
Neal Amin
HW 12
04/15/2016
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
            while(!input.hasNextInt()){
                System.out.print("Please enter integers only: ");
                input.next();
                }
               
                finalGrades[i] = input.nextInt();
                if(finalGrades[i] > 100 || finalGrades[i] < 0){
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
            
            int currentMin = list[i];
            int currentMinIndex = i;
            
        for (int j = i + 1; j < list.length; j++){
            if(currentMin > list[j]){
                currentMin = list[j];
                currentMinIndex = j;
            }
        }
        
        if (currentMinIndex != i){
            list[currentMinIndex] = list[i];
            list[i] = currentMin;
        }
        }
    }
    public static void binarySearch(int [] list, int key){
        int low = 0;
        int high = list.length - 1;
        int count = 0;
        while(high >= low){
            
            int mid = (low + high) / 2;
            if(key < list[mid]){
                high = mid - 1;
                count++;
            }
            else if(key == list[mid]){
                System.out.println(key + " was found in the list with " + count + " iterations.");
                break;
            }   
            else{
                low = mid + 1;
                count++;
            }
            if(high < low){
                System.out.println(key + " was not found in the list with " + count + " iterations.");
                break;
            }
        }
    }
    
    public static void randomScramble(int [] list){
        
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
            if (key == list[i]){
            System.out.println(key + " was found in the list with " + i + " iterations.");
            break;
            }
            
        }
           if(i == list.length){
               System.out.println(key + " was not found in the list with " + i + " iterations.");
           } 
            
        
    }
    }
