import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number1: ");
        int n = sc.nextInt();
        System.out.println("Enter Number2: ");
        int m = sc.nextInt();
        int sum = n + m;
        System.out.println("The sum of two numbers: " + sum);
    }
}