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
      int [] list = new int[10];
      for(int i = 0; i < list.length; i++){
          list[i] = (int)(Math.random()*9) + 0;
      }
      return list;
  }
  
  public static int [] delete(int list[], int pos){
      int [] newlist = new int[list.length-1];
      for(int i = 0; i < list.length -1; i++){
          
          if(i >= pos){
              newlist[i] = list[i+1];
              
          }
          else{
            newlist[i] = list[i];
          }
      }
      return newlist;
  }
 
 public static int [] remove(int list[], int target){
    //int [] newlist2 = new int[list.length];
    int count = 0;
    for(int i = 0; i < list.length; i++){
        
        if(target == list[i]){
            count++;
            //list[i] = list[i+1];
         }

    /*else{
        list[i] = list[i];
    }*/
    }
    int [] list1 = new int[list.length - count];
    for(int i = 0; i < list.length - count; i++){
        if(list[i] == target){
        list1[i] = list[i+1];
        //list1[i] = list[i];
    }
        else{
            list1[i] = list[i];
        }
    }
    return list1;
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