import java.util.Random;
import java.util.Scanner;
public class NumberGen{

     public static void main(String []args){
         Random randomGen = new Random();
         Scanner scan = new Scanner(System.in);
         System.out.println("Welcome Erika to the Random Number simulator.\n Would you like to play? (type yes.)");
         String a = scan.nextLine();
         System.out.println("This simulator will create a stream of numbers from 1-100 until it reaches your desired number.\n Please enter your desired number below:\n");
         int b = scan.nextInt();
         int i = 0;
         int howMany = 0;
         while ( i != b){
             int rand1 = +randomGen.nextInt(100);
             System.out.println(rand1 + "     Instance:"+ howMany);
             i = rand1;
             howMany++;
         }
        System.out.println("It took "+ howMany + " instances before you got your desired number.");
     }
}
