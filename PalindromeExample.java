import java.util.Scanner;

public class PalindromeExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        int originalNum = num; // মূল সংখ্যাটি সেভ করে রাখা
        int reversedNum = 0;
        int remainder;

        // সংখ্যাটিকে উল্টো করার লজিক
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        // তুলনা করা
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a Palindrome number.");
        } else {
            System.out.println(originalNum + " is not a Palindrome number.");
        }
        
        input.close();
    }
}