import java.util.Scanner;

public class FactorialExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        long factorial = 1; // বড় মান স্টোর করার জন্য long ব্যবহার করা ভালো

        if (num < 0) {
            System.out.println("Error! Factorial of a negative number doesn't exist.");
        } else {
            for (int i = 1; i <= num; i++) {
                factorial *= i; // factorial = factorial * i;
            }
            System.out.println("Factorial of " + num + " is: " + factorial);
        }
        
        input.close();
    }
}