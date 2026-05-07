import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false; // ১ বা তার ছোট সংখ্যা মৌলিক নয়
        } else {
            // ২ থেকে শুরু করে সংখ্যার অর্ধেক পর্যন্ত লুপ চালালেই যথেষ্ট
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // ভাগ মিলে গেলে আর চেক করার দরকার নেই
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is not a Prime Number.");
        }
        
        input.close();
    }
}