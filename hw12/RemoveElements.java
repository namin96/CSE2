/*Neal Amin
CSE2 Program 2
04/19/2016

This program will use methods to show modified arrays depending on user input. One of the methods will
remove a certain index of an array while another method will remove certain elements within an array 
all based on user input.

*/



import java.util.Scanner;

public class RemoveElements{
  public static void main(String [] arg){
	
	Scanner scan=new Scanner(System.in);
    
    int num[]=new int[10];
    int newArray1[];
    int newArray2[];
    int index,target;
	
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
  
  public static int [] randomInput(){           
      int [] list = new int[10];                //size 10 integer array
      for(int i = 0; i < list.length; i++){     //fill the array with random integers generated from 0 to 9
          list[i] = (int)(Math.random()*9) + 0;
      }
      return list;                              //return that array
  }
  
  public static int [] delete(int list[], int pos){
      int [] newlist = new int[list.length-1];      //intialize and declare new array to hold one less member
      for(int i = 0; i < list.length -1; i++){      //for loop to count up to list.length - 1
          
          if(i >= pos){                             //when i is greater than or equal to user index
              newlist[i] = list[i+1];               //elements will be shifted left
              
          } 
          else{                                     //copying regular array elements
            newlist[i] = list[i];
          }
      }
      return newlist;                               //return the new array
  }
 
 public static int [] remove(int list[], int target){
    //intialize count to keep track of how many target numbers are present
    int count = 0;
    for(int i = 0; i < list.length; i++){
        
        if(list[i] == target){      //if the element within an array matches the target
            count++;                //increment count
            
         }

    }
    int [] list1 = new int[list.length - count];        //new array 
    
    int j = 0;      //initialize j to keep track of indicies in the new array
    for(int i = 0; i < list.length; i++){
        if(list[i] != target){      //if the original array element is not equal to target
        list1[j] = list[i];         //new list element will be equal to original list element
        j++;                        //increment j
    }
    }
    return list1;                   //return the new array
 }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
}