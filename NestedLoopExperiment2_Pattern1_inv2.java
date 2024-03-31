/**
 *
 * @author Jayson Bulugagao | BSIT 1-4
 */
import java.util.Scanner;
//  NESTED LOOP

public class NestedLoopExperiment2_Pattern1_inv2 {
    public static void main (String[] args) {
        int n = 5;
        for (int i =1,p = 5; i<=n; i++,p--){
            for (int j = i; j<=n; j++){
                System.out.print(p + " ");
            } 
        System.out.println();    
        }
    }
}