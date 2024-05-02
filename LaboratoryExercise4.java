/**
 *
 * @author Jayson Bulugagao | BSIT 1-4
 */
import java.util.Scanner;

public class LaboratoryExercise4 {
    public static void main (String[] args){
       
       int l = 100;
       Scanner sc = new Scanner(System.in);
       
       int choices = sc.nextInt();
       
       switch(choices){
           case 1:
               for (int i = 1; i < l; i+=2)
                   System.out.print(i + " ");
               
       }
    }