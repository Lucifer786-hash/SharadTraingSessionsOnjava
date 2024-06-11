import java.util.Scanner;
public class Quantity {
    public static void main(String[] args) {
        String answer;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Curiosity is the starting point for gre ");
            System.out.println("Enter the quantity");
            int qunt = sc.nextInt();
            System.out.println("Enter the price ");
            int price = sc.nextInt();
            double total = qunt * price;
            System.out.println(total);
            System.out.println("Do you want to perform again");

            answer = sc.next();
        }while(answer.equalsIgnoreCase("yes"));
    }
}
