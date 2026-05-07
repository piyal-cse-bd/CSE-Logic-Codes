import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = input.nextInt();
        System.out.print("Enter second number (b): ");
        int b = input.nextInt();

        System.out.println("\nBefore Swap: a = " + a + ", b = " + b);

        // অদলবদল করার লজিক
        a = a + b; // a এখন দুটি সংখ্যার যোগফল
        b = a - b; // যোগফল থেকে b বিয়োগ করলে a পাওয়া যায় (যা এখন b তে জমা হলো)
        a = a - b; // যোগফল থেকে নতুন b বিয়োগ করলে অরিজিনাল b পাওয়া যায় (যা এখন a তে জমা হলো)

        System.out.println("After Swap:  a = " + a + ", b = " + b);

        input.close();
    }
}