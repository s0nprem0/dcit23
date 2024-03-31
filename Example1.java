import java.util.Scanner;

/**
 *
 * @author son
 */
public class Example1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Number 1: ");
        int sum1 = input.nextInt();
        System.out.print("Number 2: ");
        int sum2 = input.nextInt();

        int sum = sum1 + sum2;
        
        System.out.print(sum);
        
}
}
