/*
Neal Amin
CSE 2 HW 13
05/06/2016

The program will use multidemensional arrays to holoport the object. 

*/
import java.util.Scanner;
import java.util.Random;

public class Holoporter{
    public static void main(String[] args){
        String [][][] array = soRandom();
        String [][][] array2 = soRandom();
        //assign the arrays the randomly generated codes
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                for(int k = 0; k < array[i][j].length; k++){
                    array[i][j][k] = coder();       
                    
                }
            }
        }
        print(array);
        String [][][] holoArray = holoport(array, array2);
        for(int i = 0; i < holoArray.length; i++){
            for(int j = 0; j < holoArray[i].length; j++){
                for(int k = 0; k < holoArray[i][j].length; k++){
                    System.out.print(holoArray[i][j][k]);
                }
            }
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a code to search for (XXYYYY format): ");
        String code = input.nextLine();
        if(code.length() > 6 || code.length() < 6){
            System.out.print("Please enter a code to search for in proper format: ");
            code = input.nextLine();
        }
        for(int i = 0; i < code.length() - 4; i++){
            char x = code.charAt(i);
            if(!Character.isLetter(x)){
               System.out.print("Please enter a code to search for in proper format: ");
               code = input.nextLine();
            }
        }
        System.out.println("");
        for(int i = code.length() - 4; i < code.length(); i++){
            char y = code.charAt(i);
            if(!Character.isDigit(y)){
                System.out.print("Please enter a code to search for in proper format: ");
               code = input.nextLine();
            }
        }
        System.out.println("");
        sampling(holoArray, code);
        System.out.println("");
        percentage(array, holoArray);
        System.out.println("");
        frankenstein(array, holoArray);
    }
    
    
    public static String[][][] soRandom(){
        String [][][] array = new String[(int)(Math.random()*10) + 1][(int)(Math.random()*10) + 1][(int)(Math.random()*10) + 1];
        
        return array;
    }
    
    
    public static String coder(){
        //generate random alpha numeric string 
        final String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final int y = alpha.length();
          String code = " ";
    Random x = new Random();

    for (int i = 0; i < 2; i++) {
    code = code + alpha.charAt(x.nextInt(y));
    }
    for (int i = 0; i < 4; i++){
    int num = (int)(Math.random() * 9) + 0;
    code = code + num;
        
    }
    return code;  //return the string 
}
    public static String[][][] holoport(String[][][] array, String[][][] array2){
        if(array2.length < array.length){
            
            for(int i = 0; i < array2.length; i++){
                if(array2[i].length < array[i].length){
                for(int j = 0; j < array2[i].length; j++){
                    if(array2[i][j].length < array[i][j].length){
                    for(int k = 0; k < array2[i][j].length; k++){
                        array2[i][j][k] = array[i][j][k];
                    }
                }
            }
                }
            }
            
            return array2; //return the holoported array
        }
            
        
        if(array2.length > array.length){
            
            for(int i = 0; i < array.length; i++){
                if(array2[i].length > array[i].length){
                    for(int j = 0; j < array[i].length; j++){
                    if(array2[i][j].length > array[i][j].length){
                        for(int k = 0; k < array[i][j].length; k++){
                        array2[i][j][k] = array[i][j][k];
                        if(i > array.length){
                            array2[i][j][k] = "$$$$$$";
                            
                        }
                    }
                }
            }
                }
                
            }
            return array2;
        }
            
       
       return array;     
    }
   
    
    public static void sampling(String[][][]holoArray, String code){
        
     for(int x = 0; x < holoArray.length; x++){
            for(int y = 0; y < holoArray[x].length; y++){
                for(int z = 0; z < holoArray[x][y].length; z++){
                if(code.equals(holoArray[x][y][z])) 
                {
                    System.out.println("Code was found at: (" + x +", " + y + ", " + z + ")");
                    return; 
                }
                
            }
        }
        
    }
    
    
    }
    
    public static void percentage(String[][][] array, String[][][] array2){
       
        System.out.println(" ");
        double percent = (array2.length - array.length)/array.length;
        
        if(array2.length > array.length){
        System.out.print("Percentage: " + percent);
    }
        if(array2.length < array.length){
        System.out.print("Percentage: " + percent*-1);
    }
    }
    
    public static void frankenstein(String[][][] array){
        for (int x = 0;  x < array.length;  x++ ){
                  for(int i = 0; i < array.length; i++){
                      for(int j = 0; j < array[i].length; j++){
                          for(int k = 0; k < array[i][j].length; k++){
                              if (array[i][j][k].compareToIgnoreCase(array[i+1][j][k]) > 0 ){
                            String temp = array[i][j][k];
                              temp = array[i][j][k];
                                      array[i][j][k] = array[i][j+1][k];     // swapping
                                      array[i][j+1][k] = temp; 
                          }
                      }
                  }
                  }
        }
                          
    }
    
    

    public static void print (String[][][] array){
        
        for(int i = 0; i < array.length; i++){
            
            for(int j = 0; j < array[i].length; j++){
                System.out.print("[");
                for(int k = 0; k < array[i][j].length; k++){
                    System.out.print(array[i][j][k] + "," );
                }
                System.out.print("] | ");
               
            }
            System.out.print("---");
        }
    }
}