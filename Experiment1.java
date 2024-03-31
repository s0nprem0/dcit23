import java.util.Scanner;

/**
 *
 * @author son
 */
public class Experiment1 {
    
    public static void main (String[] args) {
    // INPUT FORM
    System.out.print("Enter your distance?");
    Scanner sc = new Scanner(System.in);
    int dist = sc.nextInt();
    // PRICE MATRIX
    double fare = 20.00;
    double scFare = 02.50;
    
    if (dist>=10){
        int adtKm = dist - 10; // num of additional
        double totalFare = fare+adtKm*scFare; //FORMULA
        System.out.println("Your fare is: "+totalFare);
    }
    else{ // CALCULATE FARE FOR THE SUCCEEDING 10KM
        System.out.println("Your fare is:" +fare);
    }
    
    }
}
