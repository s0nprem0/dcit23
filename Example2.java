import java.util.Scanner;

/**
 *
 * @author son
 */
public class Example2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Number 1: ");
        float sum1 = input.nextFloat();
        System.out.print("Number 2: ");
        float sum2 = input.nextFloat();

        float sum = sum1 + sum2;
        
        System.out.print(sum);
        
}
}
