/**
 *
 * @author Jayson Bulugagao | BSIT 1-4
 */
import java.util.Scanner;

public class NestedLoop_Experiment1_Pattern1 {
    public static void main (String[] args) {
        int n = 5;
        for (int i =1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
        System.out.println();    
        }
    }
}