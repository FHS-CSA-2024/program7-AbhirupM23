package src.main.java;
import java.util.Scanner;
import java.lang.Math.*;
//import stuff here

//Your code here

public class Program7{
    //Define your final variables here
    // **HINT: Maybe the conversion rates?????**


    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        
        Program7 tester = new Program7();
        
        System.out.println("Enter schrute-buck: ");
        int schruteBucks=scanner.nextInt();
        
        System.out.println("Enter klevin: ");
        int klevins=scanner.nextInt();
        
        System.out.println("Enter stanley-nickels: ");
        int stanleynickels = scanner.nextInt();
        
        double myTestVal = 0.0;
        
        myTestVal = tester.convertMoney(schruteBucks,stanleynickels,klevins);
        
        System.out.println("Decimal Schrute-Bucks = $" + myTestVal);
        
    }
    
    
    
    public double convertMoney(int schruteBucks, int stanleyNickels, int klevins){
        //implement a function that converts from the old format to the new format
        
        final double KLEVINCONVERSION=(double)klevins/20;
        final double STANLEYNICKELCONVERSION = (double) stanleyNickels/240;
        double total = KLEVINCONVERSION + STANLEYNICKELCONVERSION + schruteBucks;
        total=(double) Math.round(total*100)/100.0;
        
        
        return total;
    
    
    }
}
/*Insert SchruteBucks
//7
// Insert Klevins
//17
//Insert StanleyNicks
Decimal Schrute Bucks = 7.89
//
*/
