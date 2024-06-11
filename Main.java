import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Curiosty is the starting point for greate adventure");

        String YOrN;
        do {


            System.out.println("Enter the Quantity");
            int Quantity = sc.nextInt();
            System.out.println("Enter the Price");
            float Price = sc.nextFloat();
            float Total = Quantity * Price;
            System.out.println("Total is " + Total);

            System.out.println("Do you want to perform again Y/N ");
            YOrN = sc.next();
        } while (YOrN.equals("y"));


    }
}