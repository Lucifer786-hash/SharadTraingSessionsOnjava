import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age ");
        int age =sc.nextInt();
        if (age>=18)
        {
            System.out.println("You are Elegible for votiing ");
        }
        else
        {
            System.out.println("You are not Eligible for voting ");
        }
    }
}
