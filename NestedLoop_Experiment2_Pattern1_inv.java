/**
 *
 * @author Jayson Bulugagao | BSIT 1-4
 */
import java.util.Scanner;
// NESTED LOOP
public class NestedLoop_Experiment2_Pattern1_inv {
    public static void main (String[] args) {
        int n = 5;
        for (int i =1; i<=n; i++){
            for (int j = i; j<=n; j++){
                System.out.print("* ");
            }
        System.out.println();    
        }
    }
}